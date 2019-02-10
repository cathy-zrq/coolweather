package com.example.lenovo.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2019/2/1.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
