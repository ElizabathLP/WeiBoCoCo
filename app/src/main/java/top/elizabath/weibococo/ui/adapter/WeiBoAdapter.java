package top.elizabath.weibococo.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.entity.WeiBoBean;
import top.elizabath.weibococo.ui.entity.WeiBoSearchResult;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class WeiBoAdapter extends RecyclerView.Adapter<WeiBoAdapter.ViewHolder> {

    private Context context;
    private List<WeiBoBean> weiBoList;

    static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView weiBoImage;
        WebView weiBoContent;
        ImageView weiBoHeadImage;
        TextView weiBoUserName;
        TextView weiBoMsg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            weiBoImage = itemView.findViewById(R.id.weiboImage);
            weiBoContent = itemView.findViewById(R.id.weiboContent);
            weiBoHeadImage = itemView.findViewById(R.id.weiBoHeadImage);
            weiBoUserName = itemView.findViewById(R.id.weiBoUserName);
            weiBoMsg = itemView.findViewById(R.id.weiBoMsg);
        }
    }

    public WeiBoAdapter(List<WeiBoBean> weiBoList){
        this.weiBoList = weiBoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null){
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.weibo_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        WeiBoBean card = weiBoList.get(position);
        String html = card.getMblog().getText();
        String imgUrl = null;
        WeiBoBean.MblogBean.UserBean user = card.getMblog().getUser();
        try{
            imgUrl = card.getMblog().getPage_info().getPage_pic().getUrl();
        }catch (Exception e){
            Log.e(TAG, "微博图片资源不存在: ", e);
        }
//        Document doc = Jsoup.parse(html);
//        html = doc.select("body").text();
//        if (html.endsWith("全文")){
//            html = html.substring(0,html.lastIndexOf("全文"));
//        }
        html = html.replace("src=\"//","src=\"https://");
        html = html.replace("src=\\\"//","src=\\\"https://");
        html = html.replace("<a href=\"/status/","<a href=\"https://m.weibo.cn/status/");
        html = html.replace("<a href=\\\"/status/","<a href=\\\"https://m.weibo.cn/status/");
        holder.weiBoContent.loadData(html,"text/html; charset=UTF-8", null);
//        holder.weiBoContent.setText(Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY));
        holder.weiBoUserName.setText(user.getScreen_name());
        holder.weiBoMsg.setText(card.getMblog().getCreated_at()+"   来自 "+card.getMblog().getSource());
        Glide.with(context).load(user.getProfile_image_url()).error(R.drawable.cat_my_king).into(holder.weiBoHeadImage);
        if (imgUrl!=null){
            Glide.with(context).load(imgUrl).error(R.drawable.cat_my_king).into(holder.weiBoImage);
            holder.weiBoImage.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return weiBoList.size();
    }

}
