package com.peachgarden;

import android.app.Application;
import android.content.Context;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class GardenApplication extends Application {

    private static Context context = null;
    @Override
    public void onCreate() {
        super.onCreate();

        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
