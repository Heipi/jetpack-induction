package com.ai.fly.databinding;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

/**
 * @author khello
 * @date 2021/4/14
 */
public class ImageViewBindingAdapter {

    @BindingAdapter("image")
    public static void setImage(ImageView imageView,String url){
          if (!TextUtils.isEmpty(url)){
              //加载图片
               }else{
              imageView.setBackgroundColor(Color.GRAY);
          }
    }
    @BindingAdapter(value ={"image","defaultImage"},requireAll = false)
    public static void setImage(ImageView imageView,String url,int resId){
        if (!TextUtils.isEmpty(url)){
            //加载图片
        }else{
            imageView.setImageResource(resId);
        }
    }

}
