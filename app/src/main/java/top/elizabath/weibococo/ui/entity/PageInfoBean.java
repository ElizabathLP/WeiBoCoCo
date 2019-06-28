package top.elizabath.weibococo.ui.entity;

public class PageInfoBean {
    /**
     * page_pic : {"url":"https://wx2.sinaimg.cn/large/007aAt08ly8g3yj5etqymj319d1hdnl8.jpg"}
     * page_url : https://m.weibo.cn/c/story/player?oid=1042151%3A4382420464518417&luicode=10000011&lfid=100103type%3D61%26q%3Dgv%26t%3D0
     * page_title : 微博视频
     * content1 : 微博视频
     * content2 :
     * type : webpage
     * object_id : 1042151:4382420464518417
     */

    private PagePicBean page_pic;
    private String page_url;
    private String page_title;
    private String content1;
    private String content2;
    private String type;
    private String object_id;
    private MediaInfoBean media_info;
    private VideoDetailsBean video_details;
    private String object_type;
    private String title;
    private String video_orientation;
    private String play_count;
    private Object urls;

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideo_orientation() {
        return video_orientation;
    }

    public void setVideo_orientation(String video_orientation) {
        this.video_orientation = video_orientation;
    }

    public String getPlay_count() {
        return play_count;
    }

    public void setPlay_count(String play_count) {
        this.play_count = play_count;
    }

    public Object getUrls() {
        return urls;
    }

    public void setUrls(Object urls) {
        this.urls = urls;
    }

    public PagePicBean getPage_pic() {
        return page_pic;
    }

    public void setPage_pic(PagePicBean page_pic) {
        this.page_pic = page_pic;
    }

    public String getPage_url() {
        return page_url;
    }

    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }

    public String getPage_title() {
        return page_title;
    }

    public void setPage_title(String page_title) {
        this.page_title = page_title;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public MediaInfoBean getMedia_info() {
        return media_info;
    }

    public void setMedia_info(MediaInfoBean media_info) {
        this.media_info = media_info;
    }

    public VideoDetailsBean getVideo_details() {
        return video_details;
    }

    public void setVideo_details(VideoDetailsBean video_details) {
        this.video_details = video_details;
    }

}

