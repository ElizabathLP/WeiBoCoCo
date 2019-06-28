package top.elizabath.weibococo.ui.entity;

public class PicsBean {
    /**
     * pid : 00689sS9ly1g4g4g1jffbj30ix0ixac2
     * url : https://wx2.sinaimg.cn/orj360/00689sS9ly1g4g4g1jffbj30ix0ixac2.jpg
     * size : orj360
     * geo : {"width":360,"height":360,"croped":false}
     * large : {"size":"large","url":"https://wx2.sinaimg.cn/large/00689sS9ly1g4g4g1jffbj30ix0ixac2.jpg","geo":{"width":"681","height":"681","croped":false}}
     */

    private String pid;
    private String url;
    private String size;
    private GeoBean geo;
    private LargeBean large;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public GeoBean getGeo() {
        return geo;
    }

    public void setGeo(GeoBean geo) {
        this.geo = geo;
    }

    public LargeBean getLarge() {
        return large;
    }

    public void setLarge(LargeBean large) {
        this.large = large;
    }


}
