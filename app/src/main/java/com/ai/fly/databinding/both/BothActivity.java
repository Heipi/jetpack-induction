package com.ai.fly.databinding.both;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.ai.fly.R;
import com.ai.fly.databinding.ActivityBothBinding;

public class BothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_both);
        ActivityBothBinding bothBinding = DataBindingUtil.setContentView(this,R.layout.activity_both);
        bothBinding.setUserViewModel(new UserViewModel());
        bothBinding.setUserFieldModel(new UserFieldModel());
    }
}