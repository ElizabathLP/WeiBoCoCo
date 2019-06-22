package top.elizabath.weibococo.ui.entity;

public class PageInfoBean {
    /**
     * page_pic : {"url":"https://wx3.sinaimg.cn/large/8c85ddf3ly8g49225ejbqj20k00u07ao.jpg"}
     * page_url : https://m.weibo.cn/c/story/player?oid=1042151%3A4385719674710967&luicode=10000011&lfid=100103type%3D61%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0
     * page_title : 微博视频
     * content1 : 微博视频
     * content2 : 
     * type : webpage
     * object_id : 1042151:4385719674710967
     */

    /**
     * page_pic：此条微博图片
     */
    private PagePicBean page_pic;
    /**
     * page_url：微博故事链接？
     */
    private String page_url;
    /**
     * page_title：标题？
     */
    private String page_title;
    /**
     * content1: 内容说明？
     */
    private String content1;
    private String content2;
    /**
     * type: webpage
     */
    private String type;
    private String object_id;

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

}
