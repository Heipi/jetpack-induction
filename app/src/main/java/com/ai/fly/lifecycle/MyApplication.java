package com.ai.fly.lifecycle;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

/**
 * @author khello
 * @date 2021/4/14
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //监听应用程序生命周期
        ProcessLifecycleOwner.get().getLifecycle().
                addObserver(new ApplicationObserver());

    }
}
