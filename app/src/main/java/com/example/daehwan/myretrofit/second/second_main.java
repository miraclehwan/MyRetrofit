package com.example.daehwan.myretrofit.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.daehwan.myretrofit.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public class second_main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelApiInterface modelAPIInterface = ApiUtils.getmodelinterface();

        modelAPIInterface.get_Weather_retrofit().enqueue(new Callback<model>() {
            @Override
            public void onResponse(Call<model> call, Response<model> response) {
                Log.e("daehwanlog", String.valueOf(response.body()));
                //                Log.e("daehwanlog", response.body().getmList().get(0).getmWeatherList().get(0).getmWeatherInfoList().get(0).getmDescription());
            }

            @Override
            public void onFailure(Call<model> call, Throwable t) {
                Log.e("daehwanlog", String.valueOf(t));
            }
        });

    }
}
