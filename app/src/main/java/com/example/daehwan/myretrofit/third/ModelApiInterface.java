package com.example.daehwan.myretrofit.third;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by miraclehwan on 2018-04-19.
 */

public interface ModelApiInterface {

    @GET("/api/f1/2004/1/results.json")
    Call<model> get_json();

}
