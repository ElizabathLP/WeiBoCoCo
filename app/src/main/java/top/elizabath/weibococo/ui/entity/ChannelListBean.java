package top.elizabath.weibococo.ui.entity;

public class ChannelListBean {
    /**
     * id : 1
     * name : 综合
     * default_add : 1
     * must_show : 1
     * scheme : sinaweibo://selectchannel?containerid=100103type%3D1%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0
     * containerid : 100103type=1&q=百度云&t=0
     */

    /**
     * ID :  搜索时使用的ID，猜测是分类ID
     *
     * 1: 综合  3: 用户  21: 文章  32: 主页  38: 话题  58: 问答  60: 热门  61: 实时  62: 关注  63: 图片  64: 视频
     */
    private String id;
    /**
     * name: 分类名
     */
    private String name;
    private int default_add;
    private int must_show;
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

    public int getDefault_add() {
        return default_add;
    }

    public void setDefault_add(int default_add) {
        this.default_add = default_add;
    }

    public int getMust_show() {
        return must_show;
    }

    public void setMust_show(int must_show) {
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