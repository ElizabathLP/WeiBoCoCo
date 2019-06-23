package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class CardlistHeadCardsBean {
    /**
     * head_type : 0
     * head_type_name : channel_list
     * show_menu : 1
     * menu_scheme : sinaweibo://cardlist?containerid=100103type%3D42%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91&extparam=100103type%3D61%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0
     * channel_list : [{"id":"1","name":"综合","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D1%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=1&q=百度云&t=0"},{"id":"3","name":"用户","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D3%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=3&q=百度云&t=0"},{"id":"61","name":"实时","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type=61&q=百度云&t=0","containerid":"100103type=61&q=百度云&t=0"},{"id":"62","name":"关注","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D62%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=62&q=百度云&t=0"},{"id":"64","name":"视频","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D64%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=64&q=百度云&t=0"},{"id":"58","name":"问答","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D58%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=58&q=百度云&t=0"},{"id":"21","name":"文章","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D21%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=21&q=百度云&t=0"},{"id":"63","name":"图片","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D63%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=63&q=百度云&t=0"},{"id":"60","name":"热门","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D60%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=60&q=百度云&t=0"},{"id":"38","name":"话题","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D38%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=38&q=百度云&t=0"},{"id":"32","name":"主页","default_add":1,"must_show":1,"scheme":"sinaweibo://selectchannel?containerid=100103type%3D32%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0","containerid":"100103type=32&q=百度云&t=0"}]
     */

    private String head_type;
    private String head_type_name;
    private String show_menu;
    private String menu_scheme;
    private List<ChannelListBean> channel_list;

    public String getHead_type() {
        return head_type;
    }

    public void setHead_type(String head_type) {
        this.head_type = head_type;
    }

    public String getHead_type_name() {
        return head_type_name;
    }

    public void setHead_type_name(String head_type_name) {
        this.head_type_name = head_type_name;
    }

    public String getShow_menu() {
        return show_menu;
    }

    public void setShow_menu(String show_menu) {
        this.show_menu = show_menu;
    }

    public String getMenu_scheme() {
        return menu_scheme;
    }

    public void setMenu_scheme(String menu_scheme) {
        this.menu_scheme = menu_scheme;
    }

    public List<ChannelListBean> getChannel_list() {
        return channel_list;
    }

    public void setChannel_list(List<ChannelListBean> channel_list) {
        this.channel_list = channel_list;
    }

}