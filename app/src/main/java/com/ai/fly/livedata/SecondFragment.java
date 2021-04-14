package com.ai.fly.livedata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.ai.fly.R;


public class SecondFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_second, container, false);

        SeekBar seekBar =  root.findViewById(R.id.seekBar3);

        SeekBarModel seekBarModel = new ViewModelProvider(getActivity(),new ViewModelProvider.AndroidViewModelFactory(getActivity().getApplication())).get(SeekBarModel.class);

        Log.d("HashCode",""+seekBarModel.hashCode());
        seekBarModel.getProgress().observe(getActivity(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                seekBar.setProgress(integer);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarModel.getProgress().setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        // Inflate the layout for this fragment
        return root;

    }
}