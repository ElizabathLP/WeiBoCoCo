package top.elizabath.weibococo.ui.util;

import android.util.Log;

import java.util.LinkedHashMap;

import okhttp3.CacheControl;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class HttpUtil {

    private static OkHttpClient client = new OkHttpClient();

    public static String generateGetUrl(String url, LinkedHashMap<String, String> params) {
        if (null == params || params.isEmpty()) {
            return url;
        }
        StringBuilder builder = new StringBuilder(url);
        builder.append("?");
        for (String key : params.keySet()) {
            String value = params.get(key);
            if (null != value && !"".equals(value)) {
                builder.append(key).append("=").append(value).append("&");
            }
        }
        builder.append("localtime").append("=").append(System.currentTimeMillis()).append("&");
        url = builder.toString();
        url = url.substring(0,url.lastIndexOf("&"));
        return url;
    }

    public static Request.Builder addRequestHeaders(LinkedHashMap<String, String> headers, Request.Builder builder) {
        if (null == headers || headers.isEmpty()) {
            return builder;
        }
        for (String key : headers.keySet()) {
            String value = headers.get(key);
            if (null != value && !"".equals(value)) {
                builder.addHeader(key,value);
            }
        }
        return builder;
    }

    public static void sendOkHttpGetRequest(String address, LinkedHashMap<String, String> params, LinkedHashMap<String, String> headers, okhttp3.Callback callback) {
        Request.Builder builder = new Request.Builder();
        builder = addRequestHeaders(headers,builder);
        String url = generateGetUrl(address, params);
        Request request = builder.url(url).build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendOkHttpPostRequest(String address, LinkedHashMap<String, String> params, LinkedHashMap<String, String> headers, okhttp3.Callback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        Request.Builder reqBuilder = new Request.Builder();
        for (String key : params.keySet()) {
            String value = params.get(key);
            if (null != value && !"".equals(value)) {
                builder.add(key, value);
            }
        }
        reqBuilder = addRequestHeaders(headers,reqBuilder);
        RequestBody body = builder.build();
        Request request = reqBuilder.url(address).post(body).build();
        client.newCall(request).enqueue(callback);
    }
}
