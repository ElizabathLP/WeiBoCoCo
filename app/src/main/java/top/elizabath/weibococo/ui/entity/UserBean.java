package top.elizabath.weibococo.ui.entity;

public class UserBean {
    /**
     * id : 2561004853
     * screen_name : 诠释低调De人
     * profile_image_url : https://tva4.sinaimg.cn/crop.0.0.996.996.180/98a5d535jw8f0yy1ou5ddj20ro0ron02.jpg
     * profile_url : https://m.weibo.cn/u/2561004853?uid=2561004853&luicode=10000011&lfid=100103type%3D61%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0
     * statuses_count : 92
     * verified : false
     * verified_type : -1
     * close_blue_v : false
     * description : 做人要记住为人低调 因为低调才是最牛逼的的炫耀！
     * gender : m
     * mbtype : 0
     * urank : 14
     * mbrank : 0
     * follow_me : false
     * following : false
     * followers_count : 69
     * follow_count : 223
     * cover_image_phone : https://tva1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg
     * avatar_hd : https://ww4.sinaimg.cn/orj480/98a5d535jw8f0yy1ou5ddj20ro0ron02.jpg
     * like : false
     * like_me : false
     * badge : {"unread_pool":1,"unread_pool_ext":1,"user_name_certificate":1}
     */

    /**
     * id: 用户账号id
     */
    private long id;
    /**
     * screen_name: 微博账号昵称
     */
    private String screen_name;
    /**
     * profile_image_url: 微博头像
     */
    private String profile_image_url;
    /**
     * profile_url: 个人微博页面
     */
    private String profile_url;
    private int statuses_count;
    private boolean verified;
    private int verified_type;
    private boolean close_blue_v;
    /**
     * description: 个人简介
     */
    private String description;
    private String gender;
    private int mbtype;
    private int urank;
    private int mbrank;
    private boolean follow_me;
    /**
     * following：是否正在关注此人
     */
    private boolean following;
    /**
     * followers_count：关注数
     */
    private int followers_count;
    /**
     * follow_count：粉丝数
     */
    private int follow_count;
    /**
     * cover_image_phone：主页背景图
     */
    private String cover_image_phone;
    /**
     * avatar_hd: 头像大图
     */
    private String avatar_hd;
    private boolean like;
    private boolean like_me;
    /**
     * 微博小徽章，如会员徽章什么的，如果没有就是1，如果有就是2
     */
    private BadgeBean badge;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getVerified_type() {
        return verified_type;
    }

    public void setVerified_type(int verified_type) {
        this.verified_type = verified_type;
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

    public int getMbtype() {
        return mbtype;
    }

    public void setMbtype(int mbtype) {
        this.mbtype = mbtype;
    }

    public int getUrank() {
        return urank;
    }

    public void setUrank(int urank) {
        this.urank = urank;
    }

    public int getMbrank() {
        return mbrank;
    }

    public void setMbrank(int mbrank) {
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

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public int getFollow_count() {
        return follow_count;
    }

    public void setFollow_count(int follow_count) {
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
