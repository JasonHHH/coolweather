package com.example.jiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jiang on 2017/5/14.
 */

public class Forecast {
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
