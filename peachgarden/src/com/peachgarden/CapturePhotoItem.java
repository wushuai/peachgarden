package com.peachgarden;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;

/**
 * Created by macowu on 2015/6/17 017.
 */
public class CapturePhotoItem extends GridItem {

    private Context context;

    public CapturePhotoItem(Context context, String name) {
        super(name);
        this.context = context;
    }

    @Override
    public void action() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        context.startActivity(intent);
    }
}
