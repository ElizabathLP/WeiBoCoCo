package top.elizabath.weibococo.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.List;

import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.entity.CardGroupBean;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class WeiBoAdapter extends RecyclerView.Adapter<WeiBoAdapter.ViewHolder> {

    private Context context;
    private List<CardGroupBean> weiBoList;

    static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView weiBoImage;
        TextView weiBoContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            weiBoImage = itemView.findViewById(R.id.weiboImage);
            weiBoContent = itemView.findViewById(R.id.weiboContent);
        }
    }

    public WeiBoAdapter(List<CardGroupBean> weiBoList){
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
        CardGroupBean card = weiBoList.get(position);
        String html = card.getMblog().getText();
        String imgUrl = null;
        try{
            imgUrl = card.getMblog().getPage_info().getPage_pic().getUrl();
        }catch (Exception e){
            Log.e(TAG, "微博图片资源不存在: ", e);
        }
        Document doc = Jsoup.parse(html);
        html = doc.select("body").text();
        if (html.endsWith("全文")){
            html = html.substring(0,html.lastIndexOf("全文"));
        }
        holder.weiBoContent.setText(html);
        Log.d(TAG, "onBindViewHolder: "+imgUrl);
        if (imgUrl!=null){
            Glide.with(context).load(imgUrl).into(holder.weiBoImage);
            return;
        }
        Glide.with(context).load(R.drawable.cat_my_king).into(holder.weiBoImage);
    }

    @Override
    public int getItemCount() {
        return weiBoList.size();
    }

}
