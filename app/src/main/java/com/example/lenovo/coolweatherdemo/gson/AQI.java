package com.example.lenovo.coolweatherdemo.gson;

import java.security.PublicKey;

/**
 * Created by lenovo on 2019/2/1.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public  String aqi;

        public String pm25;
    }
}
