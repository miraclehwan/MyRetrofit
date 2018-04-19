package com.example.daehwan.myretrofit.third;

/**
 * Created by miraclehwan on 2018-04-19.
 */

public class ApiUtils {

    public static final String BASE_URL = "http://ergast.com/";

    public static ModelApiInterface getmodelInterface(){
        return RetrofitClient.getClient(BASE_URL).create(ModelApiInterface.class);
    }

}
