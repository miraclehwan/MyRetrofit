package com.example.daehwan.myretrofit.second;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public interface ModelApiInterface {

    @GET("/data/2.5/forecast/daily?id=524901&lang=zh_cn&appid=b6907d289e10d714a6e88b30761fae22")
    Call<model> get_Weather_retrofit();

}
