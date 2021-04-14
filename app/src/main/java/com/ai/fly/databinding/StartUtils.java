package com.ai.fly.databinding;

/**
 * @author khello
 * @date 2021/4/14
 */
public class StartUtils {
    public static  String getStart(int start){
        switch (start){
            case 1:
                return "一星";
            case 2:
                return "二星";
            case 3:
                return "三星";
        }
        return  "";
    }
}
