package com.ai.fly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.ai.fly.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyViewModel  model = new ViewModelProvider(this,new ViewModelProvider.
                AndroidViewModelFactory(getApplication())).get(MyViewModel.class);
    }
}