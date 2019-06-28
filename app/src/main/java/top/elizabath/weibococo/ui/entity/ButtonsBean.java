package top.elizabath.weibococo.ui.entity;

public class ButtonsBean {
    /**
     * type : follow
     * name : 关注
     * sub_type : 0
     * params : {"uid":1323527941}
     */

    private String type;
    private String name;
    private String sub_type;
    private ParamsBean params;

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

    public String getSub_type() {
        return sub_type;
    }

    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

    public ParamsBean getParams() {
        return params;
    }

    public void setParams(ParamsBean params) {
        this.params = params;
    }

}
