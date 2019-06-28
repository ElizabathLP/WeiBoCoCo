package top.elizabath.weibococo.ui.entity;

public class ActionlogBean {
    /**
     * act_code : 554
     * ext : seqid:846291328|type:61|t:0|pos:1-0-0|q:gv|ext:&cate=31&mid=4386539339591774&qtime=1561315911&
     * luicode :
     * uicode :
     * fid : 100103type=61&q=gv&t=0
     */

    private String act_code;
    private String ext;
    private String luicode;
    private String uicode;
    private String fid;
    private String source;
    private String act_type;
    private String lfid;
    private String oid;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAct_type() {
        return act_type;
    }

    public void setAct_type(String act_type) {
        this.act_type = act_type;
    }

    public String getLfid() {
        return lfid;
    }

    public void setLfid(String lfid) {
        this.lfid = lfid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getAct_code() {
        return act_code;
    }

    public void setAct_code(String act_code) {
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
