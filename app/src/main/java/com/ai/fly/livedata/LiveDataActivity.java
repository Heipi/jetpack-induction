package com.ai.fly.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.ai.fly.R;

import java.util.Timer;
import java.util.TimerTask;

public class LiveDataActivity extends AppCompatActivity {

    LiveViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        TextView textView = findViewById(R.id.textView);
         viewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(LiveViewModel.class);
        textView.setText(String.valueOf(viewModel.getCurrentSecond().getValue()));
        viewModel.getCurrentSecond().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(String.valueOf(integer));
            }
        });

        startTimer();

    }

    private void startTimer() {
     new Timer().schedule(new TimerTask() {
         @Override
         public void run() {
             if (viewModel.getCurrentSecond().getValue()!= null){
          viewModel.getCurrentSecond().postValue(viewModel.getCurrentSecond().getValue()+1);
             }
         }
     },1000,1000);
    }

}