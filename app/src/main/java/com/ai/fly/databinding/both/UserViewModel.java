package com.ai.fly.databinding.both;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.ai.fly.BR;

/**
 * @author khello
 * @date 2021/4/14
 */
public class UserViewModel extends BaseObservable {

    String TAG = "UserViewModel";
    private User user;

    public UserViewModel() {
        this.user = new User("Tom");
    }
    @Bindable
    public String getUserName() {
        return user.userName;
    }
    public void setUserName(String userName){
       if (userName!= null && !userName.equals(user.userName)){
           user.userName  = userName;
           Log.d(TAG,"set user name "+userName);
           notifyPropertyChanged(BR.userName);
       }

    }
}
