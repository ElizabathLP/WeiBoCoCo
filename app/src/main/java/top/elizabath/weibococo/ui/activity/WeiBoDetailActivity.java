package top.elizabath.weibococo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.entity.WeiBoBean;
import top.elizabath.weibococo.ui.entity.WeiBoDetail;
import top.elizabath.weibococo.ui.util.GsonUtil;
import top.elizabath.weibococo.ui.util.HttpUtil;
import top.elizabath.weibococo.ui.util.KEYManage;
import top.elizabath.weibococo.ui.util.ToastUtil;

import java.io.IOException;
import java.util.LinkedHashMap;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class WeiBoDetailActivity extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();
    private final int GET_DETAIL_SUCCESS = 200;
    private final int GET_DETAIL_FAILED = 500;

    private ImageView weiBoImage;
    private WebView weiBoContent;
    private ImageView weiBoHeadImage;
    private TextView weiBoUserName;
    private TextView weiBoMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wei_bo_detail);
        initView();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String bid = intent.getStringExtra("bid");
        if (StringUtils.isBlank(bid)){
            ToastUtil.showToast(WeiBoDetailActivity.this,"获取微博详情失败");
        }else {
            getWeiBoDetail(bid);
        }
    }

    private void initView() {
        weiBoImage = findViewById(R.id.weiboDetailImage);
        weiBoContent = findViewById(R.id.weiboDetailContent);
        weiBoHeadImage = findViewById(R.id.weiBoDetailHeadImage);
        weiBoUserName = findViewById(R.id.weiBoDetailUserName);
        weiBoMsg = findViewById(R.id.weiBoDetailMsg);
    }

    private void getWeiBoDetail(String bid){
        LinkedHashMap<String,String> params = new LinkedHashMap<>();
        params.put("id",bid);
        LinkedHashMap<String,String> header = new LinkedHashMap<>();
        header.put("Accept","application/json, text/plain, */*");
        header.put("MWeibo-Pwa","1");
        header.put("User-Agent","Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1");
        header.put("X-Requested-With","XMLHttpRequest");
        header.put("Referer","https://m.weibo.cn/status/HAizshrbq?mblogid=HAizshrbq&luicode=10000011&lfid=100103type%3D61%26q%3D110%26t%3D0");

        HttpUtil.sendOkHttpGetRequest(KEYManage.WEIBO_DETAIL_URL, params, header, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // 失败
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                // 成功
                String responseBody = response.body().string();
                if (StringUtils.isBlank(responseBody)){
                    Log.d(TAG, "onResponse: 信息获取失败");
                    return;
                }
                WeiBoDetail weiBoDetail = GsonUtil.fromJson(responseBody,WeiBoDetail.class);
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
//                    更新控件
                    WeiBoDetail weiBoDetail = (WeiBoDetail) msg.obj;
                    String html = makeURL(weiBoDetail.getData().getText());
                    runOnUiThread(() -> {
                        String imgUrl = null;
                        WeiBoDetail.DataBean.UserBean user = weiBoDetail.getData().getUser();
                        try {
                            imgUrl = weiBoDetail.getData().getPage_info().getPage_pic().getUrl();
                        } catch (Exception e) {
                            Log.e(TAG, "微博图片资源不存在: ", e);
                        }
                        weiBoContent.loadData(html, "text/html; charset=UTF-8", null);
                        weiBoUserName.setText(user.getScreen_name());
                        weiBoMsg.setText(weiBoDetail.getData().getCreated_at() + "   来自 " + weiBoDetail.getData().getSource());
                        Glide.with(WeiBoDetailActivity.this).load(user.getProfile_image_url()).error(R.drawable.cat_my_king).into(weiBoHeadImage);
                        weiBoImage.setVisibility(View.GONE);
                        if (imgUrl != null && !"".equals(imgUrl.trim())) {
                            Glide.with(WeiBoDetailActivity.this).load(imgUrl).error(R.drawable.cat_my_king).into(weiBoImage);
                            weiBoImage.setVisibility(View.VISIBLE);
                        }
                    });
                    break;
                default:
                    break;
            }
        }
    };
    private String makeURL(String html) {
        html = html.replace("src=\"//", "src=\"https://");
        html = html.replace("src=\'//", "src=\'https://");
        html = html.replace("src=\"http://", "src=\"https://");
        html = html.replace("src=\'http://", "src=\'https://");
        html = html.replace("<a href=\"/status/", "<a href=\"https://m.weibo.cn/status/");
        html = html.replace("<a href=\'/status/", "<a href=\'https://m.weibo.cn/status/");
        StringBuilder builder = new StringBuilder();
        builder.append("<div>");
        builder.append(html);
        builder.append("</div>");
        return builder.toString();
    }
}
