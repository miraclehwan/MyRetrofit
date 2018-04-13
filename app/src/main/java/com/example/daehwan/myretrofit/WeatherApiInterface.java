package com.example.daehwan.myretrofit;

import com.example.daehwan.myretrofit.model.WeatherRepo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public interface WeatherApiInterface {

    @GET("/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
    Call<WeatherRepo> get_Weather_retrofit();

}
