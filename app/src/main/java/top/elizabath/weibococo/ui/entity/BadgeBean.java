package top.elizabath.weibococo.ui.entity;

public class BadgeBean {
    /**
     * unread_pool : 1
     * unread_pool_ext : 1
     * user_name_certificate : 1
     */

    private int unread_pool;
    private int unread_pool_ext;
    private int user_name_certificate;

    public int getUnread_pool() {
        return unread_pool;
    }

    public void setUnread_pool(int unread_pool) {
        this.unread_pool = unread_pool;
    }

    public int getUnread_pool_ext() {
        return unread_pool_ext;
    }

    public void setUnread_pool_ext(int unread_pool_ext) {
        this.unread_pool_ext = unread_pool_ext;
    }

    public int getUser_name_certificate() {
        return user_name_certificate;
    }

    public void setUser_name_certificate(int user_name_certificate) {
        this.user_name_certificate = user_name_certificate;
    }
}
