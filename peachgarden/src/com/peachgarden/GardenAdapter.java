package com.peachgarden;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by macowu on 2015/5/25 025.
 */
public class GardenAdapter extends BaseAdapter {

    private Context context;

    List<GridItem> contentList;

    public GardenAdapter(Context context, List<GridItem> contentList) {
        this.context = context;
        this.contentList = contentList;
    }

    @Override
    public int getCount() {
        return (null == contentList || contentList.isEmpty()) ? 0 : contentList.size();
    }

    @Override
    public Object getItem(int position) {
        return (contentList != null && position >= 0 && position < getCount()) ? contentList.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        GridItem item = (GridItem) getItem(position);
        if (convertView != null) {
            textView = (TextView) convertView;
            textView.setText(item.name);
        } else {
            textView = new TextView(context);
            textView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
            textView.setGravity(Gravity.CENTER);
            textView.setText(item.name);
        }
        return textView;
    }

}
