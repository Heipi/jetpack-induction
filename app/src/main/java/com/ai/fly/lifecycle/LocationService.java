package com.ai.fly.lifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleService;

public class LocationService extends LifecycleService {
    public LocationService() {
        Log.d("constructor","LocationService");

        LocationObserver  observer = new LocationObserver(this);
        getLifecycle().addObserver(observer);
    }
}
