package com.ai.fly.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author khello
 * @date 2021/4/14
 */
public class LiveViewModel extends ViewModel {
    private MutableLiveData<Integer> currentSecond;


    public LiveViewModel() {
    }

    public MutableLiveData<Integer> getCurrentSecond() {

        if (currentSecond == null){
            currentSecond = new MutableLiveData<>();
            currentSecond.setValue(0);
        }
        return currentSecond;
    }
}
