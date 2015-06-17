package com.peachgarden;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GardenActivity extends Activity {

    private static List<GridItem> content;
    private String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);

        initData();
        initView();
    }

    private void initData() {
        content = new ArrayList<GridItem>();
        Random random = new Random();
        int len = characters.length();
        for (int i = 0; i < 60; i++) {
            content.add(ItemFactory.getInstanse().crateItem(this, String.valueOf(characters.charAt(random.nextInt(len)))));
        }
    }

    private void initView() {
        GridView gridView = (GridView) findViewById(R.id.gridview);

        final GardenAdapter adapter = new GardenAdapter(this, content);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                GridItem item = (GridItem) adapter.getItem(position);
                if (item != null) item.action();
            }
        });
    }

}
