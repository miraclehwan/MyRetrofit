package com.example.daehwan.myretrofit.second;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public class ApiUtils {
    public static final String BASE_URL = "http://samples.openweathermap.org/";

    public static ModelApiInterface getmodelinterface() {
        return RetrofitClient.getClient(BASE_URL).create(ModelApiInterface.class);
    }
}