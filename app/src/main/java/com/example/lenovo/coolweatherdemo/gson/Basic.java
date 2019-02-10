package com.example.lenovo.coolweatherdemo.gson;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2019/2/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
