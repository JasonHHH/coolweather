package com.example.jiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jiang on 2017/5/14.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }

}
