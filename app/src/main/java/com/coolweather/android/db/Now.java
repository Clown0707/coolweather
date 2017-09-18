package com.coolweather.android.db;

import com.google.gson.annotations.SerializedName;

/**
 * Created by clown on 2017/9/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
