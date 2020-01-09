package com.cooweather.andriod.gson;

import com.google.gson.annotations.SerializedName;

import java.util.concurrent.locks.Condition;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public Condition condition;

    public class Temperature{

        public String max;

        public String min;
    }

    public class Condition{
        @SerializedName("txt_d")
        public String info;
    }
}
