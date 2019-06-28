package top.elizabath.weibococo.ui.entity;

public class ChannelListBean {
    /**
     * id : 1
     * name : 综合
     * default_add : 1
     * must_show : 1
     * scheme : sinaweibo://selectchannel?containerid=100103type%3D1%26q%3Dgv%26t%3D0
     * containerid : 100103type=1&q=gv&t=0
     */

    private String id;
    private String name;
    private String default_add;
    private String must_show;
    private String scheme;
    private String containerid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefault_add() {
        return default_add;
    }

    public void setDefault_add(String default_add) {
        this.default_add = default_add;
    }

    public String getMust_show() {
        return must_show;
    }

    public void setMust_show(String must_show) {
        this.must_show = must_show;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getContainerid() {
        return containerid;
    }

    public void setContainerid(String containerid) {
        this.containerid = containerid;
    }
}

