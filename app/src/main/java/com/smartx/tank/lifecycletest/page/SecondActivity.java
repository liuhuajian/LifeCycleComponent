package com.smartx.tank.lifecycletest.page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.smartx.tank.lifecycletest.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
