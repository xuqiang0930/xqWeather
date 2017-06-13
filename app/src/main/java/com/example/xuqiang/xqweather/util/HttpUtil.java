package com.example.xuqiang.xqweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.tls.OkHostnameVerifier;

/**
 * Created by xuqiang on 17/6/13.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
