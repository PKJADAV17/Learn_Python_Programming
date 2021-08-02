package com.meet.learnpython;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomGridViewActivity extends BaseAdapter {

    private Context mContext;
    private final String[] gridViewString;
    private final String[] gridViewImageId;

    public CustomGridViewActivity(Context context, String[] gridViewString, String[] gridViewImageId) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
        this.gridViewString = gridViewString;
    }

    @Override
    public int getCount() {
        return gridViewString.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public android.view.View getView(int i, android.view.View convertView, ViewGroup parent) {
        android.view.View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = new android.view.View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.gridview_layout, parent,false);
        } else {
            gridViewAndroid = (android.view.View) convertView;
        }
        android.widget.TextView textViewAndroid = (android.widget.TextView) gridViewAndroid.findViewById(R.id.android_gridview_text);
        android.widget.TextView imageViewAndroid = (android.widget.TextView) gridViewAndroid.findViewById(R.id.android_gridview_text1);
        textViewAndroid.setText(gridViewString[i]);
        imageViewAndroid.setText(gridViewImageId[i]);
        return gridViewAndroid;
    }

}