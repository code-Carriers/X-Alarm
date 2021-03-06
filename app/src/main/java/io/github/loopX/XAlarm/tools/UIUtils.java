package io.github.loopX.XAlarm.tools;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.ColorRes;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

import io.github.loopX.XAlarm.XAlarmApp;

/**
 * Author UFreedom
 * Date : 2016 六月 05
 */
public class UIUtils {

    public static int getScreenWidth(){
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager wm = (WindowManager) XAlarmApp.getAppContext().getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;

    }

    public static int getScreenHeight(){
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager wm = (WindowManager) XAlarmApp.getAppContext().getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    public static  int getColor(@ColorRes int id){
        return XAlarmApp.getAppContext().getResources().getColor(id);
    }
    
    public static int dip2px(float dp) {
        Resources r = XAlarmApp.getAppContext().getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
        return Math.round(px);
    }
    
}
