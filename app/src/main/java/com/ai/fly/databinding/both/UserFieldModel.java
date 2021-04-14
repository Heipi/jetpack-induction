package com.ai.fly.databinding.both;

import android.util.Log;

import androidx.databinding.ObservableField;

/**
 * @author khello
 * @date 2021/4/14
 */
public class UserFieldModel {
    private static final String TAG = UserFieldModel.class.getSimpleName();
    private ObservableField<User> userObservableField;

    public UserFieldModel() {
        User user = new User("Jack");
        this.userObservableField = new ObservableField<>();
        userObservableField.set(user);
    }
    public String getUserName(){
        return  userObservableField.get().userName;
    }
    public  void setUserName(String userName){
        Log.d(TAG," userObservableField=="+userName);
        userObservableField.get().userName = userName;
    }

}
