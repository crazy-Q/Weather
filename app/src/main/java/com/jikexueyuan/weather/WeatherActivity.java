package com.jikexueyuan.weather;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class WeatherActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout swipeRefreshLayout;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        initView();
    }

    @Override
    public void onRefresh() {

    }

    private void initView() {
//        listView = (ListView) findViewById(R.id.list);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.id_swipe_refresh_container);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_purple,
                android.R.color.holo_blue_bright,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        swipeRefreshLayout.setOnRefreshListener(this);
    }
}
