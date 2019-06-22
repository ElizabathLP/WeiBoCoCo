package top.elizabath.weibococo.ui.entity;

public class SlidesBean {
    /**
     * create_time : 1561120516000
     * owner_id : 2357583347
     * nickname : 绅士书女
     * expire_time : 1561120516000
     * segment_duration : 3000
     * segment_type : 1
     * avatar : http://tvax2.sinaimg.cn/crop.0.0.996.996.180/8c85ddf3ly8fowjdjjbxej20ro0roq3y.jpg
     * segment_id : 4385719674710967
     * url : http://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg
     */

    private long create_time;
    private long owner_id;
    private String nickname;
    private long expire_time;
    private int segment_duration;
    private int segment_type;
    private String avatar;
    private long segment_id;
    private String url;

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }

    public long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(long owner_id) {
        this.owner_id = owner_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(long expire_time) {
        this.expire_time = expire_time;
    }

    public int getSegment_duration() {
        return segment_duration;
    }

    public void setSegment_duration(int segment_duration) {
        this.segment_duration = segment_duration;
    }

    public int getSegment_type() {
        return segment_type;
    }

    public void setSegment_type(int segment_type) {
        this.segment_type = segment_type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public long getSegment_id() {
        return segment_id;
    }

    public void setSegment_id(long segment_id) {
        this.segment_id = segment_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
