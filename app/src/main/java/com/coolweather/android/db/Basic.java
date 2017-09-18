package com.coolweather.android.db;

import com.google.gson.annotations.SerializedName;

/**
 * Created by clown on 2017/9/18.
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
