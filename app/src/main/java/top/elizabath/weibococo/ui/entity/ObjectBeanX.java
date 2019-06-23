package top.elizabath.weibococo.ui.entity;

public class ObjectBeanX {
    /**
     * object_id : 1042151:4385719674710967
     * containerid : 2313544385719674710967
     * object_domain_id : 1042151
     * object_type : story
     * safe_status : 1
     * show_status : 11
     * act_status : 0
     * last_modified : Fri Jun 21 20:35:18 CST 2019
     * timestamp : 1561120518172
     * uuid : 4385719681343511
     * uuidstr : 4385719681343511
     * activate_status : 0
     * object : {"image":{"width":720,"url":"http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg","height":1080},"object_type":"story","author":{"id":2357583347},"mid":4385719684065502,"display_name":"微博视频","url":"https://story.video.weibo.com/show?id=1042151:4385719674710967_6","slide_cover":{"slides":[{"create_time":1561120516000,"owner_id":2357583347,"nickname":"绅士书女","expire_time":1561120516000,"segment_duration":3000,"segment_type":1,"avatar":"http://tvax2.sinaimg.cn/crop.0.0.996.996.180/8c85ddf3ly8fowjdjjbxej20ro0roq3y.jpg","segment_id":4385719674710967,"url":"http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg"}]},"share_type":2,"update_at":1561120518000,"id":"1042151:4385719674710967","author_mid":"4385719684065502","create_at":1561120392000,"story":{"bizType":0,"segments_ids":[4385719674710967],"story_id":"1042151:4385719674710967_6","type":6},"biz":{"biz_id":"231354","containerid":"2313544385719674710967"},"target_url":"https://story.video.weibo.com/show?id=1042151:4385719674710967_6"}
     */

    private String object_id;
    private String containerid;
    private String object_domain_id;
    private String object_type;
    private String safe_status;
    private String show_status;
    private String act_status;
    private String last_modified;
    private long timestamp;
    private long uuid;
    private String uuidstr;
    private String activate_status;
    private ObjectBean object;

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

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
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

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
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

    public ObjectBean getObject() {
        return object;
    }

    public void setObject(ObjectBean object) {
        this.object = object;
    }


}
