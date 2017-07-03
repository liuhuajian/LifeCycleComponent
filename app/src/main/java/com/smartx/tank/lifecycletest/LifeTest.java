package com.smartx.tank.lifecycletest;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

/**
 * Created by messi on 17/7/3.
 */

public class LifeTest implements LifecycleObserver {
    private Lifecycle lifecycle;

    public LifeTest(Lifecycle lifecycle){
        lifecycle.addObserver(this);
        this.lifecycle = lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void OnResume(){
        Logger.d("it call when resume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Logger.d("it call when oncreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Logger.d("it call when onstop");
    }
}
