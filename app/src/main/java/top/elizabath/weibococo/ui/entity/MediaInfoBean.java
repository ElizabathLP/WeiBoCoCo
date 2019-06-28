package top.elizabath.weibococo.ui.entity;

public class MediaInfoBean {
    /**
     * stream_url : https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_ld&mpflag=16&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video
     * stream_url_hd : https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_hd&mpflag=8&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video
     * duration : 89
     */

    private String stream_url;
    private String stream_url_hd;
    private String duration;

    public String getStream_url() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }

    public String getStream_url_hd() {
        return stream_url_hd;
    }

    public void setStream_url_hd(String stream_url_hd) {
        this.stream_url_hd = stream_url_hd;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

