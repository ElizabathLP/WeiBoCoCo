package top.elizabath.weibococo.ui.entity;

public class LargeBean {
    /**
     * size : large
     * url : https://wx2.sinaimg.cn/large/00689sS9ly1g4g4g1jffbj30ix0ixac2.jpg
     * geo : {"width":"681","height":"681","croped":false}
     */

    private String size;
    private String url;
    private GeoBean geo;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GeoBean getGeo() {
        return geo;
    }

    public void setGeo(GeoBean geo) {
        this.geo = geo;
    }

}
