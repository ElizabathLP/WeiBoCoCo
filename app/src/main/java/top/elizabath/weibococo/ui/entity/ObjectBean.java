package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class ObjectBean {
    /**
     * image : {"width":720,"url":"http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg","height":1080}
     * object_type : story
     * author : {"id":2357583347}
     * mid : 4385719684065502
     * display_name : 微博视频
     * url : https://story.video.weibo.com/show?id=1042151:4385719674710967_6
     * slide_cover : {"slides":[{"create_time":1561120516000,"owner_id":2357583347,"nickname":"绅士书女","expire_time":1561120516000,"segment_duration":3000,"segment_type":1,"avatar":"http://tvax2.sinaimg.cn/crop.0.0.996.996.180/8c85ddf3ly8fowjdjjbxej20ro0roq3y.jpg","segment_id":4385719674710967,"url":"http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg"}]}
     * share_type : 2
     * update_at : 1561120518000
     * id : 1042151:4385719674710967
     * author_mid : 4385719684065502
     * create_at : 1561120392000
     * story : {"bizType":0,"segments_ids":[4385719674710967],"story_id":"1042151:4385719674710967_6","type":6}
     * biz : {"biz_id":"231354","containerid":"2313544385719674710967"}
     * target_url : https://story.video.weibo.com/show?id=1042151:4385719674710967_6
     */

    private ImageBean image;
    private String object_type;
//    private AuthorBean author;
    private long mid;
    private String display_name;
    private String url;
    private SlideCoverBean slide_cover;
    private int share_type;
    private long update_at;
    private String id;
    private String author_mid;
    private long create_at;
    private StoryBean story;
    private BizBean biz;
    private String target_url;

    public ImageBean getImage() {
        return image;
    }

    public void setImage(ImageBean image) {
        this.image = image;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

//    public AuthorBean getAuthor() {
//        return author;
//    }

//    public void setAuthor(AuthorBean author) {
//        this.author = author;
//    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SlideCoverBean getSlide_cover() {
        return slide_cover;
    }

    public void setSlide_cover(SlideCoverBean slide_cover) {
        this.slide_cover = slide_cover;
    }

    public int getShare_type() {
        return share_type;
    }

    public void setShare_type(int share_type) {
        this.share_type = share_type;
    }

    public long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor_mid() {
        return author_mid;
    }

    public void setAuthor_mid(String author_mid) {
        this.author_mid = author_mid;
    }

    public long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(long create_at) {
        this.create_at = create_at;
    }

    public StoryBean getStory() {
        return story;
    }

    public void setStory(StoryBean story) {
        this.story = story;
    }

    public BizBean getBiz() {
        return biz;
    }

    public void setBiz(BizBean biz) {
        this.biz = biz;
    }

    public String getTarget_url() {
        return target_url;
    }

    public void setTarget_url(String target_url) {
        this.target_url = target_url;
    }
}
