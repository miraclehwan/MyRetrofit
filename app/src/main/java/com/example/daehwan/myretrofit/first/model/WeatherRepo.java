package com.example.daehwan.myretrofit.first.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public class WeatherRepo {

    @SerializedName("coord")
    coord mCoord;
    @SerializedName("weather")
    List<weather> mWeatherList;
    @SerializedName("base")
    String mBase;
    @SerializedName("main")
    main mMain;
    @SerializedName("visibility")
    double mVisibility;
    @SerializedName("wind")
    wind mWind;
    @SerializedName("clouds")
    clouds mClouds;
    @SerializedName("dt")
    double mDt;
    @SerializedName("sys")
    sys mSys;
    @SerializedName("id")
    double mId;
    @SerializedName("name")
    String mName;
    @SerializedName("cod")
    double mCod;

    public coord getmCoord() {
        return mCoord;
    }

    public List<weather> getmWeatherList() {
        return mWeatherList;
    }

    public String getmBase() {
        return mBase;
    }

    public main getmMain() {
        return mMain;
    }

    public double getmVisibility() {
        return mVisibility;
    }

    public wind getmWind() {
        return mWind;
    }

    public clouds getmClouds() {
        return mClouds;
    }

    public double getmDt() {
        return mDt;
    }

    public sys getmSys() {
        return mSys;
    }

    public double getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public double getmCod() {
        return mCod;
    }

    public class coord{
        @SerializedName("lon")
        double mLon;
        @SerializedName("lat")
        double mLat;

        public double getmLon() {
            return mLon;
        }

        public double getmLat() {
            return mLat;
        }
    }

    public class weather{
        @SerializedName("id")
        double mId;
        @SerializedName("main")
        String mMain;
        @SerializedName("description")
        String mDescription;
        @SerializedName("icon")
        String mIcon;

        public double getmId() {
            return mId;
        }

        public String getmMain() {
            return mMain;
        }

        public String getmDescription() {
            return mDescription;
        }

        public String getmIcon() {
            return mIcon;
        }
    }

    public class main{
        @SerializedName("temp")
        double mTemp;
        @SerializedName("pressure")
        double mPressure;
        @SerializedName("humidity")
        double mHumidity;
        @SerializedName("temp_min")
        double mTemp_min;
        @SerializedName("temp_max")
        double mTemp_max;

        public double getmTemp() {
            return mTemp;
        }

        public double getmPressure() {
            return mPressure;
        }

        public double getmHumidity() {
            return mHumidity;
        }

        public double getmTemp_min() {
            return mTemp_min;
        }

        public double getmTemp_max() {
            return mTemp_max;
        }
    }

    public class wind{
        @SerializedName("speed")
        double mSpeed;
        @SerializedName("deg")
        double mDeg;

        public double getmSpeed() {
            return mSpeed;
        }

        public double getmDeg() {
            return mDeg;
        }
    }

    public class clouds{
        @SerializedName("all")
        double mAll;

        public double getmAll() {
            return mAll;
        }
    }

    public class sys{
        @SerializedName("type")
        double mType;
        @SerializedName("id")
        double mId;
        @SerializedName("message")
        double mMessage;
        @SerializedName("country")
        String mCountry;
        @SerializedName("sunrise")
        double mSunrise;
        @SerializedName("sunset")
        double mSunset;

        public double getmType() {
            return mType;
        }

        public double getmId() {
            return mId;
        }

        public double getmMessage() {
            return mMessage;
        }

        public String getmCountry() {
            return mCountry;
        }

        public double getmSunrise() {
            return mSunrise;
        }

        public double getmSunset() {
            return mSunset;
        }
    }

}
