package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class UrlObjectsBean {
    /**
     * url_ori : http://t.cn/AipA4n2e
     * object_id : 1042151:4385719674710967
     * info : {"url_short":"http://t.cn/AipA4n2e","url_long":"https://story.video.weibo.com/show?id=1042151:4385719674710967_6","type":39,"result":true,"title":"","description":"","last_modified":1561120517,"transcode":0,"ext_status":0}
     * object : {"object_id":"1042151:4385719674710967","containerid":"2313544385719674710967","object_domain_id":"1042151","object_type":"story","safe_status":1,"show_status":"11","act_status":"0","last_modified":"Fri Jun 21 20:35:18 CST 2019","timestamp":1561120518172,"uuid":4385719681343511,"uuidstr":"4385719681343511","activate_status":"0","object":{"image":{"width":720,"url":"http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg","height":1080},"object_type":"story","author":{"id":2357583347},"mid":4385719684065502,"display_name":"微博视频","url":"https://story.video.weibo.com/show?id=1042151:4385719674710967_6","slide_cover":{"slides":[{"create_time":1561120516000,"owner_id":2357583347,"nickname":"绅士书女","expire_time":1561120516000,"segment_duration":3000,"segment_type":1,"avatar":"http://tvax2.sinaimg.cn/crop.0.0.996.996.180/8c85ddf3ly8fowjdjjbxej20ro0roq3y.jpg","segment_id":4385719674710967,"url":"http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg"}]},"share_type":2,"update_at":1561120518000,"id":"1042151:4385719674710967","author_mid":"4385719684065502","create_at":1561120392000,"story":{"bizType":0,"segments_ids":[4385719674710967],"story_id":"1042151:4385719674710967_6","type":6},"biz":{"biz_id":"231354","containerid":"2313544385719674710967"},"target_url":"https://story.video.weibo.com/show?id=1042151:4385719674710967_6"}}
     * like_count : 0
     * isActionType : false
     * follower_count : 0
     * asso_like_count : 0
     * card_info_un_integrity : false
     * super_topic_status_count : 0
     * super_topic_photo_count : 0
     * search_topic_count : 0
     * search_topic_read_count : 0
     * play_count : 1261
     * is_follow_object_author : false
     */

    private String url_ori;
    private String object_id;
    private InfoBean info;
    private ObjectBeanX object;
    private int like_count;
    private boolean isActionType;
    private int follower_count;
    private int asso_like_count;
    private boolean card_info_un_integrity;
    private int super_topic_status_count;
    private int super_topic_photo_count;
    private int search_topic_count;
    private int search_topic_read_count;
    private int play_count;
    private boolean is_follow_object_author;

    public String getUrl_ori() {
        return url_ori;
    }

    public void setUrl_ori(String url_ori) {
        this.url_ori = url_ori;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public ObjectBeanX getObject() {
        return object;
    }

    public void setObject(ObjectBeanX object) {
        this.object = object;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public boolean isIsActionType() {
        return isActionType;
    }

    public void setIsActionType(boolean isActionType) {
        this.isActionType = isActionType;
    }

    public int getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(int follower_count) {
        this.follower_count = follower_count;
    }

    public int getAsso_like_count() {
        return asso_like_count;
    }

    public void setAsso_like_count(int asso_like_count) {
        this.asso_like_count = asso_like_count;
    }

    public boolean isCard_info_un_integrity() {
        return card_info_un_integrity;
    }

    public void setCard_info_un_integrity(boolean card_info_un_integrity) {
        this.card_info_un_integrity = card_info_un_integrity;
    }

    public int getSuper_topic_status_count() {
        return super_topic_status_count;
    }

    public void setSuper_topic_status_count(int super_topic_status_count) {
        this.super_topic_status_count = super_topic_status_count;
    }

    public int getSuper_topic_photo_count() {
        return super_topic_photo_count;
    }

    public void setSuper_topic_photo_count(int super_topic_photo_count) {
        this.super_topic_photo_count = super_topic_photo_count;
    }

    public int getSearch_topic_count() {
        return search_topic_count;
    }

    public void setSearch_topic_count(int search_topic_count) {
        this.search_topic_count = search_topic_count;
    }

    public int getSearch_topic_read_count() {
        return search_topic_read_count;
    }

    public void setSearch_topic_read_count(int search_topic_read_count) {
        this.search_topic_read_count = search_topic_read_count;
    }

    public int getPlay_count() {
        return play_count;
    }

    public void setPlay_count(int play_count) {
        this.play_count = play_count;
    }

    public boolean isIs_follow_object_author() {
        return is_follow_object_author;
    }

    public void setIs_follow_object_author(boolean is_follow_object_author) {
        this.is_follow_object_author = is_follow_object_author;
    }

}
