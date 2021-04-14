package com.ai.fly.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.ai.fly.R;

public class DataBindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_data_bind);
          ActivityDataBindBinding mainBinding  = DataBindingUtil.setContentView(this,R.layout.activity_data_bind);
         Idol idol = new Idol("斯嘉丽.约翰逊",2);
         mainBinding.setIdol(idol);
         mainBinding.setEventHandle(new EventHandleListener(this));
    }
}