package com.example.daehwan.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.daehwan.myretrofit.model.WeatherRepo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherApiInterface weatherApiInterface = ApiUtils.getWeatherApiInterface();

        weatherApiInterface.get_Weather_retrofit().enqueue(new Callback<WeatherRepo>() {
            @Override
            public void onResponse(Call<WeatherRepo> call, Response<WeatherRepo> response) {
                Log.e("daehwanlog", String.valueOf(response.body().getmMain().getmHumidity()));
            }

            @Override
            public void onFailure(Call<WeatherRepo> call, Throwable t) {
                Log.e("daehwanlog", String.valueOf(t));
            }
        });

    }
}
