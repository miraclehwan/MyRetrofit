package com.example.daehwan.myretrofit.second;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by miraclehwan on 2018-04-13.
 */

public class model {

    @SerializedName("cod")
    int mCod;
    @SerializedName("message")
    String mMessage;
    @SerializedName("city")
    city mCity;
    @SerializedName("cnt")
    int mCnt;
    @SerializedName("list")
    List<list> mList;

    public int getmCod() {
        return mCod;
    }

    public String getmMessage() {
        return mMessage;
    }

    public city getmCity() {
        return mCity;
    }

    public int getmCnt() {
        return mCnt;
    }

    public List<list> getmList() {
        return mList;
    }

    public class city{
        @SerializedName("geoname_id")
        int mGeoname_Id;
        @SerializedName("name")
        String mName;
        @SerializedName("lat")
        double mLat;
        @SerializedName("lon")
        double mLon;
        @SerializedName("country")
        String mCountry;
        @SerializedName("iso2")
        String mIso2;
        @SerializedName("type")
        String mType;
        @SerializedName("population")
        int mPopulation;

        public int getmGeoname_Id() {
            return mGeoname_Id;
        }

        public String getmName() {
            return mName;
        }

        public double getmLat() {
            return mLat;
        }

        public double getmLon() {
            return mLon;
        }

        public String getmCountry() {
            return mCountry;
        }

        public String getmIso2() {
            return mIso2;
        }

        public String getmType() {
            return mType;
        }

        public int getmPopulation() {
            return mPopulation;
        }
    }

    public class list{

        @SerializedName("dt")
        double mDt;
        @SerializedName("temp")
        temp mTemp;
        @SerializedName("pressure")
        double mPressure;
        @SerializedName("humidity")
        double mHumidity;
        @SerializedName("weather")
        List<weatherInfo> mWeatherList;
        @SerializedName("speed")
        double mSpeed;
        @SerializedName("deg")
        int mDeg;
        @SerializedName("clouds")
        int mClouds;
        @SerializedName("snow")
        double mSnow;

        public double getmDt() {
            return mDt;
        }

        public temp getmTemp() {
            return mTemp;
        }

        public double getmPressure() {
            return mPressure;
        }

        public double getmHumidity() {
            return mHumidity;
        }

        public List<weatherInfo> getmWeatherList() {
            return mWeatherList;
        }

        public double getmSpeed() {
            return mSpeed;
        }

        public int getmDeg() {
            return mDeg;
        }

        public int getmClouds() {
            return mClouds;
        }

        public double getmSnow() {
            return mSnow;
        }

        public class temp{
            @SerializedName("day")
            double mDay;
            @SerializedName("min")
            double mMin;
            @SerializedName("max")
            double mMax;
            @SerializedName("night")
            double mNight;
            @SerializedName("eve")
            double mEve;
            @SerializedName("morn")
            double mMore;

            public double getmDay() {
                return mDay;
            }

            public double getmMin() {
                return mMin;
            }

            public double getmMax() {
                return mMax;
            }

            public double getmNight() {
                return mNight;
            }

            public double getmEve() {
                return mEve;
            }

            public double getmMore() {
                return mMore;
            }
        }

        public class weatherInfo{
            @SerializedName("id")
            int mId;
            @SerializedName("main")
            String mMain;
            @SerializedName("description")
            String mDescription;
            @SerializedName("icon")
            String mIcon;

            public int getmId() {
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

//        public class weather{
//
//            List<weatherInfo> mWeatherInfoList;
//
//            public List<weatherInfo> getmWeatherInfoList() {
//                return mWeatherInfoList;
//            }
//
//            public class weatherInfo{
//                @SerializedName("id")
//                int mId;
//                @SerializedName("main")
//                String mMain;
//                @SerializedName("description")
//                String mDescription;
//                @SerializedName("icon")
//                String mIcon;
//
//                public int getmId() {
//                    return mId;
//                }
//
//                public String getmMain() {
//                    return mMain;
//                }
//
//                public String getmDescription() {
//                    return mDescription;
//                }
//
//                public String getmIcon() {
//                    return mIcon;
//                }
//            }
//        }

    }

}
