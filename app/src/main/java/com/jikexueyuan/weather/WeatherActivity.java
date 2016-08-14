package com.jikexueyuan.weather;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RelativeLayout rl_city;
    private TextView tv_city,//城市
            tv_release,//发布时间
            tv_now_weather,//天气
            tv_today_temp,//温度
            tv_now_temp,//当前温度
            tv_aqi,//空气质量指数
            tv_quality,//空气质量
            tv_next_three,//3小时
            tv_next_six,//6小时
            tv_next_nine,//9小时
            tv_next_twelve,//12小时
            tv_next_fifteen,//15小时
            tv_next_three_temp,//3小时温度
            tv_next_six_temp,//6小时温度
            tv_next_nine_temp,//9小时温度
            tv_next_twelve_temp,//12小时温度
            tv_next_fifteen_temp,//15小时温度
            tv_today_temp_a,//今天温度a
            tv_today_temp_b,//今天温度b
            tv_tomorrow,//明天
            tv_tomorrow_temp_a,//明天温度a
            tv_tomorrow_temp_b,//明天温度b
            tv_thirdday,//第三天
            tv_thirdday_temp_a,//第三天温度a
            tv_thirdday_temp_b,//第三天温度b
            tv_fourthday,//第四天
            tv_fourthday_temp_a,//第四天温度a
            tv_fourthday_temp_b,//第四天温度b
            tv_humidity,//湿度
            tv_wind,//风向风力
            tv_uv_index,//紫外线指数
            tv_dressing_index;//穿衣指数

    private ImageView iv_now_weather,//现在天气
            iv_next_three,//3小时
            iv_next_six,//6小时
            iv_next_nine,//9小时
            iv_next_twelve,//12小时
            iv_next_fifteen,//15小时
            iv_today_weather,//今天
            iv_tomorrow_weather,//明天
            iv_thirdday_weather,//第三天
            iv_fourthday_weather;//第四天


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        init();
    }

    private void init() {
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.id_swipe_refresh_container);
        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_purple,
                android.R.color.holo_blue_bright,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        rl_city = (RelativeLayout) findViewById(R.id.rl_city);
        //切换城市
        rl_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tv_city = (TextView) findViewById(R.id.tv_city);
        tv_release = (TextView) findViewById(R.id.tv_release);
        tv_now_weather = (TextView) findViewById(R.id.tv_now_weather);
        tv_today_temp = (TextView) findViewById(R.id.tv_today_temp);
        tv_now_temp = (TextView) findViewById(R.id.tv_now_temp);
        tv_aqi = (TextView) findViewById(R.id.tv_aqi);
        tv_quality = (TextView) findViewById(R.id.tv_quality);
        tv_next_three = (TextView) findViewById(R.id.tv_next_three);
        tv_next_six = (TextView) findViewById(R.id.tv_next_six);
        tv_next_nine = (TextView) findViewById(R.id.tv_next_nine);
        tv_next_twelve = (TextView) findViewById(R.id.tv_next_twelve);
        tv_next_fifteen = (TextView) findViewById(R.id.tv_next_fifteen);
        tv_next_three_temp = (TextView) findViewById(R.id.tv_next_three_temp);
        tv_next_six_temp = (TextView) findViewById(R.id.tv_next_six_temp);
        tv_next_nine_temp = (TextView) findViewById(R.id.tv_next_nine_temp);
        tv_next_twelve_temp = (TextView) findViewById(R.id.tv_next_twelve_temp);
        tv_next_fifteen_temp = (TextView) findViewById(R.id.tv_next_fifteen_temp);
        tv_today_temp_a = (TextView) findViewById(R.id.tv_today_temp_a);
        tv_today_temp_b = (TextView) findViewById(R.id.tv_today_temp_b);
        tv_tomorrow = (TextView) findViewById(R.id.tv_tomorrow);
        tv_tomorrow_temp_a = (TextView) findViewById(R.id.tv_tomorrow_temp_a);
        tv_tomorrow_temp_b = (TextView) findViewById(R.id.tv_tomorrow_temp_b);
        tv_thirdday = (TextView) findViewById(R.id.tv_third);
        tv_thirdday_temp_a = (TextView) findViewById(R.id.tv_third_temp_a);
        tv_thirdday_temp_b = (TextView) findViewById(R.id.tv_third_temp_b);
        tv_fourthday = (TextView) findViewById(R.id.tv_fourth);
        tv_fourthday_temp_a = (TextView) findViewById(R.id.tv_fourth_temp_a);
        tv_fourthday_temp_b = (TextView) findViewById(R.id.tv_fourth_temp_b);
        tv_humidity = (TextView) findViewById(R.id.tv_humidity);
        tv_wind = (TextView) findViewById(R.id.tv_wind);
        tv_uv_index = (TextView) findViewById(R.id.tv_uv_index);
        tv_dressing_index = (TextView) findViewById(R.id.tv_dressing_index);

        iv_now_weather = (ImageView) findViewById(R.id.iv_now_weather);
        iv_next_three = (ImageView) findViewById(R.id.iv_next_three);
        iv_next_six = (ImageView) findViewById(R.id.iv_next_six);
        iv_next_nine = (ImageView) findViewById(R.id.iv_next_nine);
        iv_next_twelve = (ImageView) findViewById(R.id.iv_next_twelve);
        iv_next_fifteen = (ImageView) findViewById(R.id.iv_next_fifteen);
        iv_today_weather = (ImageView) findViewById(R.id.iv_today_weather);
        iv_tomorrow_weather = (ImageView) findViewById(R.id.iv_tomorrow_weather);
        iv_thirdday_weather = (ImageView) findViewById(R.id.iv_third_weather);
        iv_fourthday_weather = (ImageView) findViewById(R.id.iv_fourth_weather);
    }

    @Override
    public void onRefresh() {

    }
}
