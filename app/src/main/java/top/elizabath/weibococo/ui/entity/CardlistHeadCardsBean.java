package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class CardlistHeadCardsBean {
    /**
     * channel_list :
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
