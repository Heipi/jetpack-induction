package com.ai.fly.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @author khello
 * @date 2021/4/14
 */
public class ApplicationObserver implements LifecycleObserver {

    String TAG = "application observer";


    /**
     *针对整个应用程序监听，与Activity数量无关
     * onCreate 只会被调用一次
     */
   @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
   void onCreate(){
       Log.d(TAG,"onCreate");

   }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart(){
        Log.d(TAG,"onStart");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(){
        Log.d(TAG,"onResume");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(){
        Log.d(TAG,"onPause");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(){
        Log.d(TAG,"onStop");
    }

    /**
     * 不会被调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(){
        Log.d(TAG,"onDestroy");
    }
















}
