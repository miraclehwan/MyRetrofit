package com.example.daehwan.myretrofit.third;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.daehwan.myretrofit.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by miraclehwan on 2018-04-19.
 */

public class third_main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelApiInterface modelApiInterface = ApiUtils.getmodelInterface();

        modelApiInterface.get_json().enqueue(new Callback<model>() {
            @Override
            public void onResponse(Call<model> call, Response<model> response) {
                int a = 1;
            }

            @Override
            public void onFailure(Call<model> call, Throwable t) {

            }
        });

    }
}
