package com.peachgarden;

import android.content.Context;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class QuitItem extends GridItem {

    public QuitItem(Context context, String name) {
        super(context, name);
    }

    @Override
    public void action() {
        System.exit(0);
    }
}
