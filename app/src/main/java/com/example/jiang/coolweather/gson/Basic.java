package com.example.jiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jiang on 2017/5/14.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
