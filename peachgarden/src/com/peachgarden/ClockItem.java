package com.peachgarden;

import android.content.Context;
import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.MediaStore;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class ClockItem extends GridItem {

    public ClockItem(Context context, String name) {
        super(context, name);
    }

    @Override
    public void action() {
        Intent intent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        context.startActivity(intent);
    }
}
