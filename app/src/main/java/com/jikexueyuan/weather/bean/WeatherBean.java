package com.jikexueyuan.weather.bean;

import java.util.List;

/**
 * Created by QQQ on 2016/8/15.
 */
public class WeatherBean {

    private String city;
    private String release;
    private String weather_id;
    private String weather_str;
    private String temp;
    private String now_temp;
    private String pm;
    private String aqi;//空气质量指数
    private String quality;
    private String felt_temp;
    private String humidity;
    private String wind;
    private String uv_index;
    private String dressing_index;

    private List<FutureWeatherBean> futureList;

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWeather_str() {
        return weather_str;
    }

    public void setWeather_str(String weather_str) {
        this.weather_str = weather_str;
    }

    public String getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(String weather_id) {
        this.weather_id = weather_id;
    }

    public String getUv_index() {
        return uv_index;
    }

    public void setUv_index(String uv_index) {
        this.uv_index = uv_index;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDressing_index() {
        return dressing_index;
    }

    public void setDressing_index(String dressing_index) {
        this.dressing_index = dressing_index;
    }

    public String getFelt_temp() {
        return felt_temp;
    }

    public void setFelt_temp(String felt_temp) {
        this.felt_temp = felt_temp;
    }

    public List<FutureWeatherBean> getFutureList() {
        return futureList;
    }

    public void setFutureList(List<FutureWeatherBean> futureList) {
        this.futureList = futureList;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getNow_temp() {
        return now_temp;
    }

    public void setNow_temp(String now_temp) {
        this.now_temp = now_temp;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
