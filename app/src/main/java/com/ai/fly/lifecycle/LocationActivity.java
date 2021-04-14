package com.ai.fly.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ai.fly.databinding.ActivityLocationBinding;
import com.ai.fly.databinding.ActivityMainBinding;


public class LocationActivity extends AppCompatActivity {

    private ActivityLocationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLocationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
//        setContentView(R.layout.activity_main);
        setContentView(view);
       binding.buttonStart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             startService(new Intent(LocationActivity.this,LocationService.class));

           }
       });
       binding.buttonStop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               stopService(new Intent(LocationActivity.this,LocationService.class));
           }
       });
    }
}