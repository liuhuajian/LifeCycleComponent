package com.smartx.tank.lifecycletest.model;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import com.smartx.tank.lifecycletest.util.Logger;

/**
 * Created by messi on 17/7/3.
 */

public class LifeTest implements LifecycleObserver {
    private Lifecycle lifecycle;

//    public interface LifeCycleStateListener{
//        void
//    }

    public LifeTest(Lifecycle lifecycle){
        lifecycle.addObserver(this);
        this.lifecycle = lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void OnResume(){
        Logger.d("it call when resume");
        Logger.d(lifecycle.getCurrentState().toString());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Logger.d("it call when oncreate");
        Logger.d(lifecycle.getCurrentState().toString());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Logger.d("it call when onstop");
        Logger.d(lifecycle.getCurrentState().toString());
    }

    public void requestLifeState(){

    }

}
