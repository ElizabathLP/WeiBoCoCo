package top.elizabath.weibococo.ui.util;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLHelper {
    public static String encode(String str) {
        String result = "";
        if (null == str) {
            return result;
        }
        try {
            result = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("URLHelper", "URL编码错误:" + e.getMessage(), e);
        }
        return result;
    }

    public static String decode(String str) {
        String result = "";
        if (null == str) {
            return result;
        }
        if (str.contains("+")) {
            str = str.replaceAll("\\+", "%2B");
        }
        try {
            result = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("URLHelper", "URL解码错误:" + e.getMessage(), e);
        }
        return result;
    }

    public static String replaceUrlNormaily(String html) {
        html = html.replace("src=\"//", "src=\"https://");
        html = html.replace("src=\'//", "src=\'https://");
        html = html.replace("src=\"http://", "src=\"https://");
        html = html.replace("src=\'http://", "src=\'https://");
        html = html.replace("<a href=\"/status/", "<a href=\"https://m.weibo.cn/status/");
        html = html.replace("<a href=\'/status/", "<a href=\'https://m.weibo.cn/status/");
        return html;
    }
}
