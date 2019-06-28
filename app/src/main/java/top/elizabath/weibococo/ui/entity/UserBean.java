package top.elizabath.weibococo.ui.entity;

public class UserBean {
    /**
     * id : 1323527941
     * screen_name : Vista看天下
     * profile_image_url : https://tva2.sinaimg.cn/crop.0.0.180.180.180/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg
     * profile_url : https://m.weibo.cn/u/1323527941?uid=1323527941
     * statuses_count : 69131
     * verified : true
     * verified_type : 3
     * verified_type_ext : 0
     * verified_reason : 《Vista看天下》官方微博
     * close_blue_v : false
     * description : 一个有趣的蓝V
     * gender : m
     * mbtype : 12
     * urank : 48
     * mbrank : 6
     * follow_me : false
     * following : false
     * followers_count : 17443261
     * follow_count : 1783
     * cover_image_phone : https://tva1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg
     * avatar_hd : https://ww2.sinaimg.cn/orj480/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg
     * like : false
     * like_me : false
     * badge : {"enterprise":1,"gongyi_level":1,"bind_taobao":1,"dzwbqlx_2016":1,"follow_whitelist_video":1,"lol_gm_2017":1,"user_name_certificate":1,"wenchuan_10th":1,"qixi_2018":1,"lol_s8":1,"memorial_2018":1,"denglong_2019":1,"suishoupai_2019":1}
     */

    private String id;
    private String screen_name;
    private String profile_image_url;
    private String profile_url;
    private String statuses_count;
    private boolean verified;
    private String verified_type;
    private String verified_type_ext;
    private String verified_reason;
    private boolean close_blue_v;
    private String description;
    private String gender;
    private String mbtype;
    private String urank;
    private String mbrank;
    private boolean follow_me;
    private boolean following;
    private String followers_count;
    private String follow_count;
    private String cover_image_phone;
    private String avatar_hd;
    private boolean like;
    private boolean like_me;
    private BadgeBean badge;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public String getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(String statuses_count) {
        this.statuses_count = statuses_count;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getVerified_type() {
        return verified_type;
    }

    public void setVerified_type(String verified_type) {
        this.verified_type = verified_type;
    }

    public String getVerified_type_ext() {
        return verified_type_ext;
    }

    public void setVerified_type_ext(String verified_type_ext) {
        this.verified_type_ext = verified_type_ext;
    }

    public String getVerified_reason() {
        return verified_reason;
    }

    public void setVerified_reason(String verified_reason) {
        this.verified_reason = verified_reason;
    }

    public boolean isClose_blue_v() {
        return close_blue_v;
    }

    public void setClose_blue_v(boolean close_blue_v) {
        this.close_blue_v = close_blue_v;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMbtype() {
        return mbtype;
    }

    public void setMbtype(String mbtype) {
        this.mbtype = mbtype;
    }

    public String getUrank() {
        return urank;
    }

    public void setUrank(String urank) {
        this.urank = urank;
    }

    public String getMbrank() {
        return mbrank;
    }

    public void setMbrank(String mbrank) {
        this.mbrank = mbrank;
    }

    public boolean isFollow_me() {
        return follow_me;
    }

    public void setFollow_me(boolean follow_me) {
        this.follow_me = follow_me;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public String getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(String followers_count) {
        this.followers_count = followers_count;
    }

    public String getFollow_count() {
        return follow_count;
    }

    public void setFollow_count(String follow_count) {
        this.follow_count = follow_count;
    }

    public String getCover_image_phone() {
        return cover_image_phone;
    }

    public void setCover_image_phone(String cover_image_phone) {
        this.cover_image_phone = cover_image_phone;
    }

    public String getAvatar_hd() {
        return avatar_hd;
    }

    public void setAvatar_hd(String avatar_hd) {
        this.avatar_hd = avatar_hd;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isLike_me() {
        return like_me;
    }

    public void setLike_me(boolean like_me) {
        this.like_me = like_me;
    }

    public BadgeBean getBadge() {
        return badge;
    }

    public void setBadge(BadgeBean badge) {
        this.badge = badge;
    }

}

