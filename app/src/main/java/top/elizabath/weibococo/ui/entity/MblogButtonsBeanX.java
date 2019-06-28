package top.elizabath.weibococo.ui.entity;

public class MblogButtonsBeanX {
    /**
     * type : mblog_buttons_forward
     * name : 转发
     * pic :
     * actionlog : {"source":"hot","act_code":"1202","act_type":"1","fid":"102803_ctg1_1761_-_ctg1_1761","lfid":"","oid":"4386218965925403","uicode":"","ext":"uid:38793897593|time:1561314469|source:1042015:newTagCategory_014_|recommend_source:18002|contributor:|hot_request_id:1561314469355994387938975987894"}
     */

    private String type;
    private String name;
    private String pic;
    private ActionlogBean actionlog;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public ActionlogBean getActionlog() {
        return actionlog;
    }

    public void setActionlog(ActionlogBean actionlog) {
        this.actionlog = actionlog;
    }

}
