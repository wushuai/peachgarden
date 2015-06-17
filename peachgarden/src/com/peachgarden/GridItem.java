package com.peachgarden;

import android.content.Context;

/**
 * Created by macowu on 2015/6/17 017.
 */
public abstract class GridItem {

    protected String name;
    protected Context context;

    public GridItem(Context context, String name) {
        this.name = name;
        this.context = context;
    }

    public abstract void action();
}
