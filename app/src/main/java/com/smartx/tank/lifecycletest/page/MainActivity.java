package com.smartx.tank.lifecycletest.page;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.smartx.tank.lifecycletest.model.LifeTest;
import com.smartx.tank.lifecycletest.model.LocationLiveData;
import com.smartx.tank.lifecycletest.model.MyViewModel;
import com.smartx.tank.lifecycletest.R;
import com.smartx.tank.lifecycletest.entity.User;

public class MainActivity extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

    }

    private void initData() {
        //LifeCycle test
        LifeTest lifeTest = new LifeTest(getLifecycle());

        //ViewModel test
        MyViewModel model = ViewModelProviders.of(this).get(MyViewModel.class);

        model.getUsers().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {

            }
        });

        //LiveData test
        LiveData myLocationListener = new LocationLiveData(this);
        myLocationListener.observe(this, new Observer() {
            @Override
            public void onChanged(@Nullable Object o) {
                //update
                //当LiveData中通过setValue（）修改了数据时，这里将会收到修改后的数据
            }
        });
    }


    public void btnClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
        finish();
    }
}
