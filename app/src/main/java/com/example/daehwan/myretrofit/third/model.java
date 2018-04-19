package com.example.daehwan.myretrofit.third;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by miraclehwan on 2018-04-19.
 */

public class model {

    @SerializedName("MRData")
    MRData mMRData;

    public MRData getmMRData() {
        return mMRData;
    }

    public class MRData{

        @SerializedName("xmlns")
        String mXmlns;
        @SerializedName("series")
        String mSeries;
        @SerializedName("url")
        String mUrl;
        @SerializedName("limit")
        String mLimit;
        @SerializedName("offset")
        String mOffset;
        @SerializedName("total")
        String mTotal;
        @SerializedName("RaceTable")
        RaceTable mRaceTable;

        public String getmXmlns() {
            return mXmlns;
        }

        public String getmSeries() {
            return mSeries;
        }

        public String getmUrl() {
            return mUrl;
        }

        public String getmLimit() {
            return mLimit;
        }

        public String getmOffset() {
            return mOffset;
        }

        public String getmTotal() {
            return mTotal;
        }

        public RaceTable getmRaceTable() {
            return mRaceTable;
        }

        public class RaceTable{

            @SerializedName("season")
            String mSeason;
            @SerializedName("round")
            String mRound;
            @SerializedName("Races")
            List<Races> mRacesList;

            public String getmSeason() {
                return mSeason;
            }

            public String getmRound() {
                return mRound;
            }

            public List<Races> getmRacesList() {
                return mRacesList;
            }

            public class Races{

                @SerializedName("season")
                String mSeason;
                @SerializedName("round")
                String mRound;
                @SerializedName("url")
                String mUrl;
                @SerializedName("raceName")
                String mRaceName;
                @SerializedName("Circuit")
                Circuit mCircult;
                @SerializedName("date")
                String mDate;
                @SerializedName("Results")
                List<Results> mResultsList;

                public String getmSeason() {
                    return mSeason;
                }

                public String getmRound() {
                    return mRound;
                }

                public String getmUrl() {
                    return mUrl;
                }

                public String getmRaceName() {
                    return mRaceName;
                }

                public Circuit getmCircult() {
                    return mCircult;
                }

                public String getmDate() {
                    return mDate;
                }

                public List<Results> getmResultsList() {
                    return mResultsList;
                }

                public class Circuit{

                    @SerializedName("circuitId")
                    String mCircuitId;
                    @SerializedName("url")
                    String mUrl;
                    @SerializedName("circuitName")
                    String mCircuitName;
                    @SerializedName("Location")
                    Location mLocation;

                    public String getmCircuitId() {
                        return mCircuitId;
                    }

                    public String getmUrl() {
                        return mUrl;
                    }

                    public String getmCircuitName() {
                        return mCircuitName;
                    }

                    public Location getmLocation() {
                        return mLocation;
                    }

                    public class Location{

                        @SerializedName("lat")
                        String mLat;
                        @SerializedName("long")
                        String mLong;
                        @SerializedName("locality")
                        String mLocality;
                        @SerializedName("country")
                        String mCountry;

                        public String getmLat() {
                            return mLat;
                        }

                        public String getmLong() {
                            return mLong;
                        }

                        public String getmLocality() {
                            return mLocality;
                        }

                        public String getmCountry() {
                            return mCountry;
                        }
                    }

                }

                public class Results{

                    @SerializedName("number")
                    String mNumber;
                    @SerializedName("position")
                    String mPosition;
                    @SerializedName("positionText")
                    String mPositionText;
                    @SerializedName("points")
                    String mPoints;
                    @SerializedName("Driver")
                    Driver mDriver;
                    @SerializedName("Constructor")
                    Constructor mConstructor;
                    @SerializedName("grid")
                    String mGrid;
                    @SerializedName("laps")
                    String mLaps;
                    @SerializedName("status")
                    String mStatus;
                    @SerializedName("Time")
                    Time mTime;
                    @SerializedName("FastestLap")
                    FastestLap mFastestLap;

                    public String getmNumber() {
                        return mNumber;
                    }

                    public String getmPosition() {
                        return mPosition;
                    }

                    public String getmPositionText() {
                        return mPositionText;
                    }

                    public String getmPoints() {
                        return mPoints;
                    }

                    public Driver getmDriver() {
                        return mDriver;
                    }

                    public Constructor getmConstructor() {
                        return mConstructor;
                    }

                    public String getmGrid() {
                        return mGrid;
                    }

                    public String getmLaps() {
                        return mLaps;
                    }

                    public String getmStatus() {
                        return mStatus;
                    }

                    public Time getmTime() {
                        return mTime;
                    }

                    public FastestLap getmFastestLap() {
                        return mFastestLap;
                    }

                    public class Driver{

                        @SerializedName("driverId")
                        String mDriverId;
                        @SerializedName("code")
                        String mCode;
                        @SerializedName("url")
                        String mUrl;
                        @SerializedName("givenName")
                        String mGivenName;
                        @SerializedName("familyName")
                        String mFamilyName;
                        @SerializedName("dateOfBirth")
                        String mDateOfBirth;
                        @SerializedName("nationality")
                        String mNationality;

                        public String getmDriverId() {
                            return mDriverId;
                        }

                        public String getmCode() {
                            return mCode;
                        }

                        public String getmUrl() {
                            return mUrl;
                        }

                        public String getmGivenName() {
                            return mGivenName;
                        }

                        public String getmFamilyName() {
                            return mFamilyName;
                        }

                        public String getmDateOfBirth() {
                            return mDateOfBirth;
                        }

                        public String getmNationality() {
                            return mNationality;
                        }
                    }

                    public class Constructor{

                        @SerializedName("constructorId")
                        String mConstructorId;
                        @SerializedName("url")
                        String mUrl;
                        @SerializedName("name")
                        String mName;
                        @SerializedName("nationality")
                        String mNationality;

                        public String getmConstructorId() {
                            return mConstructorId;
                        }

                        public String getmUrl() {
                            return mUrl;
                        }

                        public String getmName() {
                            return mName;
                        }

                        public String getmNationality() {
                            return mNationality;
                        }
                    }

                    public class Time{

                        @SerializedName("millis")
                        String mMillis;
                        @SerializedName("time")
                        String mTime;

                        public String getmMillis() {
                            return mMillis;
                        }

                        public String getmTime() {
                            return mTime;
                        }
                    }

                    public class FastestLap{

                        @SerializedName("rank")
                        String mRank;
                        @SerializedName("lap")
                        String mLap;
                        @SerializedName("Time")
                        Time mTime;
                        @SerializedName("AverageSpeed")
                        AverageSpeed mAverageSpeed;

                        public String getmRank() {
                            return mRank;
                        }

                        public String getmLap() {
                            return mLap;
                        }

                        public Time getmTime() {
                            return mTime;
                        }

                        public AverageSpeed getmAverageSpeed() {
                            return mAverageSpeed;
                        }

                        public class Time{

                            @SerializedName("time")
                            String mTime;

                            public String getmTime() {
                                return mTime;
                            }
                        }

                        public class AverageSpeed{

                            @SerializedName("units")
                            String mUnits;
                            @SerializedName("speed")
                            String mSpeed;

                            public String getmUnits() {
                                return mUnits;
                            }

                            public String getmSpeed() {
                                return mSpeed;
                            }
                        }

                    }



                }

            }


        }

    }


}
