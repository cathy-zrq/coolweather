package com.example.lenovo.coolweatherdemo.util;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.sql.ClientInfoStatus;


/**
 * Created by lenovo on 2019/1/31.
 */

public class HttpUtil {
    public static  void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
