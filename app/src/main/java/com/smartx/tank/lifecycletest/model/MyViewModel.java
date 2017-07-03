package com.smartx.tank.lifecycletest.model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.smartx.tank.lifecycletest.entity.User;

/**
 * Created by messi on 17/7/3.
 */

public class MyViewModel extends ViewModel {

    private MutableLiveData<User> users;

    public LiveData<User> getUsers(){
        if (users ==null){
            users = new MutableLiveData();
            loadUsers();
        }
        return users;
    }

    /**
     * do async operation to fetch users
     */
    private void loadUsers() {

    }
}
