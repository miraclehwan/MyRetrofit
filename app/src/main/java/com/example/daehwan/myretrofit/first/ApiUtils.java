package com.example.daehwan.myretrofit.first;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public class ApiUtils {
    public static final String BASE_URL = "http://samples.openweathermap.org/";

    public static WeatherApiInterface getWeatherApiInterface() {
        return RetrofitClient.getClient(BASE_URL).create(WeatherApiInterface.class);
    }
}