package com.peachgarden;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class CommonItem extends GridItem {

    public CommonItem(Context context, String name) {
        super(context, name);
    }

    @Override
    public void action() {
        Toast.makeText(GardenApplication.getContext(), name, Toast.LENGTH_SHORT).show();
    }
}
