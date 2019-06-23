package top.elizabath.weibococo.ui.entity;

public class InfoBean {
    /**
     * url_short : http://t.cn/AipA4n2e
     * url_long : https://story.video.weibo.com/show?id=1042151:4385719674710967_6
     * type : 39
     * result : true
     * title :
     * description :
     * last_modified : 1561120517
     * transcode : 0
     * ext_status : 0
     */

    private String url_short;
    private String url_long;
    private String type;
    private boolean result;
    private String title;
    private String description;
    private String last_modified;
    private String transcode;
    private String ext_status;

    public String getUrl_short() {
        return url_short;
    }

    public void setUrl_short(String url_short) {
        this.url_short = url_short;
    }

    public String getUrl_long() {
        return url_long;
    }

    public void setUrl_long(String url_long) {
        this.url_long = url_long;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getTranscode() {
        return transcode;
    }

    public void setTranscode(String transcode) {
        this.transcode = transcode;
    }

    public String getExt_status() {
        return ext_status;
    }

    public void setExt_status(String ext_status) {
        this.ext_status = ext_status;
    }
}