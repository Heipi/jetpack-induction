package com.ai.fly.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * @author khello
 * @date 2021/4/14
 */
public class EventHandleListener {

    private Context context;

    public EventHandleListener(Context context) {
        this.context = context;
    }


    public void buttonOnClick(View view){
        Toast.makeText(context,"喜欢",Toast.LENGTH_SHORT).show();
    }

}
