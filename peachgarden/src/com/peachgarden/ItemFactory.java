package com.peachgarden;

import android.content.Context;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class ItemFactory {

    private static ItemFactory instanse = null;

    public GridItem crateItem(Context context, String name) {
        if ("P".equals(name)) {
            return new CapturePhotoItem(context, name);
        }

        return new CommonItem(name);
    }

    public static ItemFactory getInstanse() {
        if(instanse == null){
            instanse = new ItemFactory();
        }
        return instanse;
    }
}
