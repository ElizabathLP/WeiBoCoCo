package top.elizabath.weibococo.ui.util;

import java.util.LinkedHashMap;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class HttpUtil {

    private static OkHttpClient client = new OkHttpClient();

    public static String generateGetUrl(String url, LinkedHashMap<String, String> params) {
        StringBuilder builder = new StringBuilder(url);
        for (String key : params.keySet()) {
            String value = params.get(key);
            if (null != value && !"".equals(value)) {
                builder.append(key).append(value);
            }
        }
        return builder.toString();
    }

    public static void sendOkHttpGetRequest(String address, LinkedHashMap<String, String> params, okhttp3.Callback callback) {
        Request request = new Request.Builder().url(generateGetUrl(address,params)).build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendOkHttpPostRequest(String address, LinkedHashMap<String, String> params, okhttp3.Callback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        for (String key : params.keySet()) {
            String value = params.get(key);
            if (null != value && !"".equals(value)) {
                builder.add(key,value);
            }
        }
        RequestBody body = builder.build();
        Request request = new Request.Builder().url(address).post(body).build();
        client.newCall(request).enqueue(callback);
    }
}
