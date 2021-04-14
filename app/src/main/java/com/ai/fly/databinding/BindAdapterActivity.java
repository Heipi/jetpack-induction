package com.ai.fly.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ai.fly.R;

public class BindAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bind_adapter);
      ActivityBindAdapterBinding bindAdapterBinding  = DataBindingUtil.setContentView(this,R.layout.activity_bind_adapter);
//     bindAdapterBinding.setNetworkImage("");
     bindAdapterBinding.setLocalImage(R.drawable.ic_launcher_background);
    }

}