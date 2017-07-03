package com.smartx.tank.lifecycletest;

import android.arch.lifecycle.LifecycleActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LifeTest lifeTest = new LifeTest(getLifecycle());
    }


    public void btnClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
        finish();
    }
}
