package com.peachgarden;

/**
 * Created by macowu on 2015/6/17 017.
 */
public abstract class GridItem {

    protected String name;

    public GridItem(String name) {
        this.name = name;
    }

    public abstract void action();
}
