package com.ai.fly.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author khello
 * @date 2021/4/14
 */
public class SeekBarModel extends ViewModel {
private MutableLiveData<Integer>  progress;

    public MutableLiveData<Integer> getProgress() {

        if (progress == null){
            progress = new MutableLiveData<>();
            progress.setValue(0);
        }
        return progress;
    }
}
