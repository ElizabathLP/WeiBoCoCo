package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class ObjectBean {
    /**
     * image : {"width":720,"url":"http://wx2.sinaimg.cn/large/007aAt08ly8g3yj5etqymj319d1hdnl8.jpg","height":1080}
     * object_type : story
     * author : {"id":6569384476}
     * mid : 4382420469806469
     * display_name : 微博视频
     * url : https://story.video.weibo.com/show?id=1042151:4382420464518417_6
     * slide_cover : {"slides":[{"create_time":1560333923000,"owner_id":6569384476,"nickname":"小妹你好嗨噢","expire_time":1560333923000,"segment_duration":3000,"segment_type":1,"avatar":"http://tvax4.sinaimg.cn/crop.0.0.1080.1080.180/007aAt08ly8g3ichnf69zj30u00u0wh7.jpg","segment_id":4382420464518417,"url":"http://wx2.sinaimg.cn/large/007aAt08ly8g3yj5etqymj319d1hdnl8.jpg"}]}
     * share_type : 2
     * update_at : 1560333925000
     * id : 1042151:4382420464518417
     * author_mid : 4382420469806469
     * create_at : 1560333802000
     * story : {"bizType":0,"segments_ids":[4382420464518417],"story_id":"1042151:4382420464518417_6","type":6}
     * biz : {"biz_id":"231354","containerid":"2313544382420464518417"}
     * target_url : https://story.video.weibo.com/show?id=1042151:4382420464518417_6
     */

    private ImageBean image;
    private String object_type;
    private String mid;
    private String display_name;
    private String url;
    private SlideCoverBean slide_cover;
    private String share_type;
    private String update_at;
    private String id;
    private String author_mid;
    private String create_at;
    private StoryBean story;
    private BizBean biz;
    private String target_url;
    private String object_id;
    private String containerid;
    private String object_domain_id;
    private String safe_status;
    private String show_status;
    private String act_status;
    private String last_modified;
    private String timestamp;
    private String uuid;
    private String uuidstr;
    private String activate_status;

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getContainerid() {
        return containerid;
    }

    public void setContainerid(String containerid) {
        this.containerid = containerid;
    }

    public String getObject_domain_id() {
        return object_domain_id;
    }

    public void setObject_domain_id(String object_domain_id) {
        this.object_domain_id = object_domain_id;
    }

    public String getSafe_status() {
        return safe_status;
    }

    public void setSafe_status(String safe_status) {
        this.safe_status = safe_status;
    }

    public String getShow_status() {
        return show_status;
    }

    public void setShow_status(String show_status) {
        this.show_status = show_status;
    }

    public String getAct_status() {
        return act_status;
    }

    public void setAct_status(String act_status) {
        this.act_status = act_status;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuidstr() {
        return uuidstr;
    }

    public void setUuidstr(String uuidstr) {
        this.uuidstr = uuidstr;
    }

    public String getActivate_status() {
        return activate_status;
    }

    public void setActivate_status(String activate_status) {
        this.activate_status = activate_status;
    }

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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
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

    public String getShare_type() {
        return share_type;
    }

    public void setShare_type(String share_type) {
        this.share_type = share_type;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
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

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
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

