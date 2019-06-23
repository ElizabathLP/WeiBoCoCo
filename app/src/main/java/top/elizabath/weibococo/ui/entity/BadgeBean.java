package top.elizabath.weibococo.ui.entity;

public class BadgeBean {
    /**
     * unread_pool : 1
     * unread_pool_ext : 1
     * user_name_certificate : 1
     */

    private String unread_pool;
    private String unread_pool_ext;
    private String user_name_certificate;

    public String getUnread_pool() {
        return unread_pool;
    }

    public void setUnread_pool(String unread_pool) {
        this.unread_pool = unread_pool;
    }

    public String getUnread_pool_ext() {
        return unread_pool_ext;
    }

    public void setUnread_pool_ext(String unread_pool_ext) {
        this.unread_pool_ext = unread_pool_ext;
    }

    public String getUser_name_certificate() {
        return user_name_certificate;
    }

    public void setUser_name_certificate(String user_name_certificate) {
        this.user_name_certificate = user_name_certificate;
    }
}
