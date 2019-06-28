package top.elizabath.weibococo.ui.entity;

public class GeoBean {
    /**
     * width : 360
     * height : 360
     * croped : false
     */

    private String width;
    private String height;
    private boolean croped;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public boolean isCroped() {
        return croped;
    }

    public void setCroped(boolean croped) {
        this.croped = croped;
    }
}
