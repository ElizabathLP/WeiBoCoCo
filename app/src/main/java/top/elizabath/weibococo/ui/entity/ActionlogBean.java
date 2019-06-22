package top.elizabath.weibococo.ui.entity;

public class ActionlogBean {
    /**
     * act_code : 554
     * ext : seqid:1013777008|type:61|t:0|pos:3-0-0|q:百度云|ext:&cate=31&mid=4385724990122235&qtime=1561121838&
     * luicode :
     * uicode :
     * fid : 100103type=61&q=百度云&t=0
     */

    private int act_code;
    private String ext;
    private String luicode;
    private String uicode;
    private String fid;

    public int getAct_code() {
        return act_code;
    }

    public void setAct_code(int act_code) {
        this.act_code = act_code;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getLuicode() {
        return luicode;
    }

    public void setLuicode(String luicode) {
        this.luicode = luicode;
    }

    public String getUicode() {
        return uicode;
    }

    public void setUicode(String uicode) {
        this.uicode = uicode;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }
}