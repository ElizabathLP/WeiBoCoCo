package top.elizabath.weibococo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import androidx.appcompat.widget.Toolbar;
import com.dueeeke.videocontroller.StandardVideoController;
import com.dueeeke.videoplayer.player.IjkVideoView;
import com.lzy.ninegrid.ImageInfo;
import com.lzy.ninegrid.NineGridView;
import com.lzy.ninegrid.preview.NineGridViewClickAdapter;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.entity.*;
import top.elizabath.weibococo.ui.util.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class WeiBoDetailActivity extends ActivityBase {
    private final String TAG = getClass().getSimpleName();
    private final int GET_DETAIL_SUCCESS = 200;
    private final int GET_DETAIL_FAILED = 500;

    private NineGridView weiBoImage;
    private WebView weiBoContent;
    private ImageView weiBoHeadImage;
    private TextView weiBoUserName;
    private TextView weiBoMsg;
    private IjkVideoView weiBoVideo;
    private StandardVideoController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wei_bo_detail);
        initView();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String bid = intent.getStringExtra("bid");
        if (StringUtils.isBlank(bid)) {
            ToastUtil.showToast(WeiBoDetailActivity.this, "获取微博详情失败");
        } else {
            getWeiBoDetail(bid);
        }
    }

    private void initView() {
        weiBoImage = findViewById(R.id.weiboDetailImage);
        weiBoContent = findViewById(R.id.weiboDetailContent);
        weiBoHeadImage = findViewById(R.id.weiBoDetailHeadImage);
        weiBoUserName = findViewById(R.id.weiBoDetailUserName);
        weiBoMsg = findViewById(R.id.weiBoDetailMsg);
        weiBoVideo = findViewById(R.id.weiboDetailVideo);
        controller = new StandardVideoController(getApplicationContext());
    }

    private void getWeiBoDetail(String bid) {
        OkHttpUtils.get()
                .url(KEYManage.WEIBO_DETAIL_URL)
                .addParams("id", bid)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("MWeibo-Pwa", "1")
                .addHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1")
                .addHeader("X-Requested-With", "XMLHttpRequest")
                .addHeader("Referer", "https://m.weibo.cn/status/HAizshrbq?mblogid=HAizshrbq&luicode=10000011&lfid=100103type%3D61%26q%3D110%26t%3D0")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        // 失败
                    }

                    @Override
                    public void onResponse(String responseBody, int id) {
                        if (StringUtils.isBlank(responseBody)) {
                            Log.d(TAG, "onResponse: 信息获取失败");
                            return;
                        }
                        WeiBoSearchResult weiBoDetail = GsonUtil.fromJson(responseBody, WeiBoSearchResult.class);
                        Message message = new Message();
                        message.what = GET_DETAIL_SUCCESS;
                        message.obj = weiBoDetail;
                        handler.handleMessage(message);
                    }
                });
    }

    private final Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            switch (msg.what) {
                case GET_DETAIL_SUCCESS:
                    WeiBoSearchResult weiBoDetail = (WeiBoSearchResult) msg.obj;
                    String html = URLHelper.replaceUrlNormaily(weiBoDetail.getData().getText());
                    runOnUiThread(() -> {
                        UserBean user = weiBoDetail.getData().getUser();
                        weiBoContent.loadData(html, "text/html; charset=UTF-8", null);
                        weiBoUserName.setText(user.getScreen_name());
                        weiBoMsg.setText(weiBoDetail.getData().getCreated_at() + "   来自 " + weiBoDetail.getData().getSource());
                        Glide.with(WeiBoDetailActivity.this).load(user.getProfile_image_url()).error(R.drawable.cat_my_king).into(weiBoHeadImage);
                        weiBoVideo.setVisibility(View.GONE);
                        PageInfoBean pageInfoBeans = weiBoDetail.getData().getPage_info();
                        List<ImageInfo> imgList = getWeiBoImages(weiBoDetail);
                        if (pageInfoBeans != null) {
                            String type = pageInfoBeans.getType();
                            switch (type) {
                                case "video":
                                    weiBoVideo.setVisibility(View.VISIBLE);
                                    ImageView thumb = controller.getThumb();
                                    Glide.with(thumb.getContext())
                                            .load(pageInfoBeans.getPage_pic().getUrl())
                                            .error(R.drawable.cat_my_king)
                                            .centerCrop()
                                            .placeholder(android.R.color.white)
                                            .into(thumb);
                                    weiBoVideo.setUrl(pageInfoBeans.getMedia_info().getStream_url()); //设置视频地址
                                    controller.setTitle(pageInfoBeans.getTitle()); //设置视频标题
                                    weiBoVideo.setVideoController(controller); //设置控制器，如需定制可继承BaseVideoController
                                    weiBoImage.setVisibility(View.GONE);
                                    break;
                                default:
                                    weiBoImage.setVisibility(View.VISIBLE);
                                    weiBoVideo.setVisibility(View.GONE);
                                    weiBoImage.setAdapter(new NineGridViewClickAdapter(WeiBoDetailActivity.this, imgList));
                                    break;
                            }
                        }
                    });
                    break;
                default:
                    break;
            }
        }
    };

    private ArrayList<ImageInfo> getWeiBoImages(WeiBoSearchResult weiBoDetail) {
        List<PicsBean> picBeans = weiBoDetail.getData().getPics();
        ArrayList<ImageInfo> pics = new ArrayList<>();
        if (picBeans == null) {
            PageInfoBean pageInfoBeans = weiBoDetail.getData().getPage_info();
            if (pageInfoBeans != null) {
                ImageInfo info = new ImageInfo();
                info.setThumbnailUrl(pageInfoBeans.getPage_pic().getUrl());
                info.setBigImageUrl(pageInfoBeans.getPage_pic().getUrl());
                pics.add(info);
            }
            return pics;
        }
        for (PicsBean pic : picBeans) {
            ImageInfo info = new ImageInfo();
            info.setThumbnailUrl(pic.getUrl());
            if (null != pic.getLarge()) {
                info.setBigImageUrl(pic.getLarge().getUrl());
            } else {
                info.setBigImageUrl(pic.getUrl());
            }
            pics.add(info);
        }
        return pics;
    }

    @Override
    protected void onPause() {
        super.onPause();
        weiBoVideo.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        weiBoVideo.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        weiBoVideo.release();
    }


    @Override
    public void onBackPressed() {
        if (!weiBoVideo.onBackPressed()) {
            super.onBackPressed();
        }
    }
}
