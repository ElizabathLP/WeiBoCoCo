package top.elizabath.weibococo.ui.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.util.TypedValue;
import android.view.*;
import android.webkit.WebView;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.dueeeke.videocontroller.StandardVideoController;
import com.lzy.ninegrid.ImageInfo;
import com.lzy.ninegrid.NineGridView;
import com.lzy.ninegrid.preview.NineGridViewClickAdapter;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.widget.QMUIRadiusImageView;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.activity.WeiBoDetailActivity;
import top.elizabath.weibococo.ui.entity.*;
import top.elizabath.weibococo.ui.util.*;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class WeiBoAdapter extends RecyclerView.Adapter<WeiBoAdapter.ViewHolder> {

    private Context context;
    private List<WeiBoBean> weiBoList;

    static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        NineGridView weiBoImage;
        WebView weiBoContent;
        ImageView weiBoHeadImage;
        TextView weiBoUserName;
        TextView weiBoMsg;
        StandardVideoController controller;
        com.dueeeke.videoplayer.player.IjkVideoView weiBoVideo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            weiBoImage = itemView.findViewById(R.id.weiboImage);
            weiBoContent = itemView.findViewById(R.id.weiboContent);
            weiBoHeadImage = itemView.findViewById(R.id.weiBoHeadImage);
            weiBoUserName = itemView.findViewById(R.id.weiBoUserName);
            weiBoMsg = itemView.findViewById(R.id.weiBoMsg);
            weiBoVideo = itemView.findViewById(R.id.weiboVideo);
            controller = new StandardVideoController(itemView.getContext());
        }
    }

    public WeiBoAdapter(List<WeiBoBean> weiBoList) {
        this.weiBoList = weiBoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.weibo_item, parent, false);
        NineGridView.setImageLoader(new NineGridView.ImageLoader() {
            @Override
            public void onDisplayImage(Context context, ImageView imageView, String url) {
                Glide.with(context).load(url)//
                        .placeholder(R.drawable.ic_default_color)//
                        .error(R.drawable.ic_default_color)//
                        .diskCacheStrategy(DiskCacheStrategy.ALL)//
                        .into(imageView);
            }

            @Override
            public Bitmap getCacheImage(String url) {
                return null;
            }
        });
        final ViewHolder holder = new ViewHolder(view);
        onClickEvent(holder);
        return holder;
    }

    private void onClickEvent(final ViewHolder holder) {
        holder.cardView.setOnClickListener(weibo -> {
            // 点击跳转详情按钮
            int position = holder.getAdapterPosition();
            goToWeiBoDetail(position,holder);
        });
        holder.cardView.setOnLongClickListener(view1 -> {
            // 点击发起举报请求
            QMUIDialog.MessageDialogBuilder dialog = new QMUIDialog.MessageDialogBuilder(context);
            dialog.setTitle("确定举报此条微博？");
            dialog.setMessage("系统将以你的名义举报此条微博");
            dialog.setCancelable(true);
            dialog.addAction("OK", (alog, index) -> {
                //确定按钮
                alog.dismiss();
                int position = holder.getAdapterPosition();
                WeiBoBean weiBo = weiBoList.get(position);
                String weiBoId = weiBo.getMblog().getId();
                String nowTime = String.valueOf(System.currentTimeMillis());
                //todo 之后换成登录用户ID
                String reporterId = "3264859587";
                String weiBoOwnerId = weiBo.getMblog().getUser().getId();
                if (StringUtils.isBlank(weiBoId)) {
                    ToastUtil.showToast(context, "举报失败，微博ID获取失败");
                    return;
                }
                if (StringUtils.isBlank(nowTime)) {
                    ToastUtil.showToast(context, "举报失败，当前时间获取失败");
                    return;
                }
                if (StringUtils.isBlank(weiBoOwnerId)) {
                    ToastUtil.showToast(context, "举报失败，此条微博所有者获取失败");
                    return;
                }
                reportWeiBo(KEYManage.COMPLAINT_CATEGORY_YELLOW_MESSAGE, KEYManage.COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_SELL_YELLOW_RESOURCES, nowTime, weiBoId, reporterId, weiBoOwnerId);
                ToastUtil.showToast(context, "举报成功");
            });
            dialog.addAction("Cancel", (alog, index) -> {
                // 取消按钮
                alog.dismiss();
                ToastUtil.showToast(context, "取消举报");
            });
            dialog.show();
            return true;
        });
    }

    private void goToWeiBoDetail(int position, ViewHolder holder) {
        WeiBoBean weiBo = weiBoList.get(position);
        String bid = weiBo.getMblog().getBid();
        Intent intent = new Intent(context, WeiBoDetailActivity.class);
        intent.putExtra("bid", bid);
        if (holder.weiBoVideo != null && !holder.weiBoVideo.isFullScreen()) {
            holder.weiBoVideo.stopPlayback();
        }
        context.startActivity(intent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        WeiBoBean card = weiBoList.get(position);
        String html = card.getMblog().getText();
        UserBean user = card.getMblog().getUser();
        html = URLHelper.replaceUrlNormaily(html);
        holder.weiBoContent.loadData(html, "text/html; charset=UTF-8", null);
        holder.weiBoUserName.setText(user.getScreen_name());
        holder.weiBoMsg.setText(card.getMblog().getCreated_at() + "   来自 " + card.getMblog().getSource());
        Glide.with(context).load(user.getProfile_image_url()).error(R.drawable.cat_my_king).into(holder.weiBoHeadImage);
        holder.weiBoVideo.setVisibility(View.GONE);
        PageInfoBean pageInfoBeans = card.getMblog().getPage_info();
        List<ImageInfo> imgList = getWeiBoImages(card);
        if (pageInfoBeans != null) {
            String type = pageInfoBeans.getType();
            switch (type) {
                case "video":
                    holder.weiBoVideo.setVisibility(View.VISIBLE);
                    ImageView thumb = holder.controller.getThumb();
                    Glide.with(thumb.getContext())
                            .load(pageInfoBeans.getPage_pic().getUrl())
                            .error(R.drawable.cat_my_king)
                            .centerCrop()
                            .placeholder(android.R.color.white)
                            .into(thumb);
                    holder.weiBoVideo.setUrl(pageInfoBeans.getMedia_info().getStream_url()); //设置视频地址
                    holder.controller.setTitle(pageInfoBeans.getTitle()); //设置视频标题
                    holder.weiBoVideo.setVideoController(holder.controller); //设置控制器，如需定制可继承BaseVideoController
                    holder.weiBoImage.setVisibility(View.GONE);
                    break;
                default:
                    holder.weiBoImage.setVisibility(View.VISIBLE);
                    holder.weiBoImage.setAdapter(new NineGridViewClickAdapter(context, imgList));
                    break;
            }
        }

    }

    @Override
    public int getItemCount() {
        return weiBoList.size();
    }

    private void reportWeiBo(int category, int tag_id, String nowTime, String weiBoId, String reporterId, String weiBoOwnerId) {
        OkHttpUtils.post()
                .url(KEYManage.WEIBO_REPORT_URL)
                .addHeader("Host", "service.account.weibo.com")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Length", "158")
                .addHeader("Origin", "https://service.account.weibo.com")
                .addHeader("X-Requested-With", "XMLHttpRequest")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Accept", "*/*")
                .addHeader("Referer", "https://service.account.weibo.com/reportspamobile?rid=" + weiBoId + "&type=1&from=20000")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8")
                .addHeader("Cookie", "ALF=" + nowTime.substring(0, nowTime.length() - 3) + "; SUB=_2A25wFjENDeRhGeVM7VYZ9SfJwzuIHXVT-V9FrDV8PUJbkNAKLRD1kW1NTPrCAGTYHesbiDUFJ7n31LmaaQgWBNxu; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WF4Nzr5EBRaFEJ9ybQXnj1U5JpX5oz75NHD95Q0eoqX1h-4SKnNWs4DqcjHBgfbIPxDdcRLxKBLBonLBo9zdcp.; S_ACCOUNT-G0=83b4ce5166df2ff731e23703d58dea95")
                .addParams("category", String.valueOf(category))
                .addParams("tag_id", String.valueOf(tag_id))
                .addParams("type", "1")
                .addParams("rid", weiBoId)
                .addParams("uid", reporterId)
                .addParams("r_uid", weiBoOwnerId)
                .addParams("getrid", weiBoId)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        // 失败
                        Log.d(TAG, "onResponse: " + "举报失败，请检查网络设置");
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        // 成功
                        WeiBoReportMsg result = GsonUtil.fromJson(response, WeiBoReportMsg.class);
                        Log.d(TAG, "onResponse: " + result.getMsg());
                    }
                });
    }

    private ArrayList<ImageInfo> getWeiBoImages(WeiBoBean weiBo) {
        List<PicsBean> picBeans = weiBo.getMblog().getPics();
        ArrayList<ImageInfo> pics = new ArrayList<>();
        if (picBeans == null) {
            PageInfoBean pageInfoBeans = weiBo.getMblog().getPage_info();
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
}
