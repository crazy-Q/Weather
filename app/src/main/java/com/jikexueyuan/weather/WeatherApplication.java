package com.jikexueyuan.weather;

import android.app.Application;

import com.thinkland.sdk.android.JuheSDKInitializer;

/**
 * Created by QQQ on 2016/8/14.
 */
public class WeatherApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        JuheSDKInitializer.initialize(getApplicationContext());
    }
}
