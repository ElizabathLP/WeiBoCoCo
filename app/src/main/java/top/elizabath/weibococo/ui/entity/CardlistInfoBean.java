package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class CardlistInfoBean {
    /**
     * v_p : 42
     * containerid : 100103type=61&q=gv&t=0
     * title_top : -gv
     * total : 1000
     * show_style : 1
     * starttime : 1561315911
     * can_shared : 0
     * cardlist_menus : []
     * cardlist_head_cards : [{"head_type":0,"head_type_name":"channel_list","show_menu":1,"menu_scheme":"sinaweibo://cardlist?containerid=100103type%3D42%26q%3Dgv&extparam=100103type%3D61%26q%3Dgv%26t%3D0","channel_list":[{"id":"1","name":"综合","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D1%26q%3Dgv%26t%3D0","containerid":"100103type=1&q=gv&t=0"},{"id":"3","name":"用户","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D3%26q%3Dgv%26t%3D0","containerid":"100103type=3&q=gv&t=0"},{"id":"61","name":"实时","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type=61&q=gv&t=0","containerid":"100103type=61&q=gv&t=0"},{"id":"62","name":"关注","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D62%26q%3Dgv%26t%3D0","containerid":"100103type=62&q=gv&t=0"},{"id":"64","name":"视频","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D64%26q%3Dgv%26t%3D0","containerid":"100103type=64&q=gv&t=0"},{"id":"58","name":"问答","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D58%26q%3Dgv%26t%3D0","containerid":"100103type=58&q=gv&t=0"},{"id":"21","name":"文章","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D21%26q%3Dgv%26t%3D0","containerid":"100103type=21&q=gv&t=0"},{"id":"63","name":"图片","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D63%26q%3Dgv%26t%3D0","containerid":"100103type=63&q=gv&t=0"},{"id":"60","name":"热门","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D60%26q%3Dgv%26t%3D0","containerid":"100103type=60&q=gv&t=0"},{"id":"38","name":"话题","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D38%26q%3Dgv%26t%3D0","containerid":"100103type=38&q=gv&t=0"},{"id":"32","name":"主页","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D32%26q%3Dgv%26t%3D0","containerid":"100103type=32&q=gv&t=0"}]}]
     * toolbar_menus : []
     * page_size : 10
     * hide_oids : []
     * page : 2
     */

    private String v_p;
    private String containerid;
    private String title_top;
    private String total;
    private String show_style;
    private String starttime;
    private String can_shared;
    private String page_size;
    private String page;
    private List<?> cardlist_menus;
    private List<CardlistHeadCardsBean> cardlist_head_cards;
    private List<?> toolbar_menus;
    private List<?> hide_oids;
    private String statistics_from;
    private String since_id;
    private String cardlist_title;
    private String desc;

    public String getStatistics_from() {
        return statistics_from;
    }

    public void setStatistics_from(String statistics_from) {
        this.statistics_from = statistics_from;
    }

    public String getSince_id() {
        return since_id;
    }

    public void setSince_id(String since_id) {
        this.since_id = since_id;
    }

    public String getCardlist_title() {
        return cardlist_title;
    }

    public void setCardlist_title(String cardlist_title) {
        this.cardlist_title = cardlist_title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getV_p() {
        return v_p;
    }

    public void setV_p(String v_p) {
        this.v_p = v_p;
    }

    public String getContainerid() {
        return containerid;
    }

    public void setContainerid(String containerid) {
        this.containerid = containerid;
    }

    public String getTitle_top() {
        return title_top;
    }

    public void setTitle_top(String title_top) {
        this.title_top = title_top;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getShow_style() {
        return show_style;
    }

    public void setShow_style(String show_style) {
        this.show_style = show_style;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getCan_shared() {
        return can_shared;
    }

    public void setCan_shared(String can_shared) {
        this.can_shared = can_shared;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<?> getCardlist_menus() {
        return cardlist_menus;
    }

    public void setCardlist_menus(List<?> cardlist_menus) {
        this.cardlist_menus = cardlist_menus;
    }

    public List<CardlistHeadCardsBean> getCardlist_head_cards() {
        return cardlist_head_cards;
    }

    public void setCardlist_head_cards(List<CardlistHeadCardsBean> cardlist_head_cards) {
        this.cardlist_head_cards = cardlist_head_cards;
    }

    public List<?> getToolbar_menus() {
        return toolbar_menus;
    }

    public void setToolbar_menus(List<?> toolbar_menus) {
        this.toolbar_menus = toolbar_menus;
    }

    public List<?> getHide_oids() {
        return hide_oids;
    }

    public void setHide_oids(List<?> hide_oids) {
        this.hide_oids = hide_oids;
    }

}

