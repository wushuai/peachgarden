package com.peachgarden;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class CommonItem extends GridItem {
    public CommonItem(String name) {
        super(name);
    }

    @Override
    public void action() {
        Toast.makeText(GardenApplication.getContext(), name, Toast.LENGTH_SHORT).show();
    }
}
