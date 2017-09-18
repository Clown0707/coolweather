package com.coolweather.android.db;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by clown on 2017/9/18.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
