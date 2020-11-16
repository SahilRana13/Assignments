package com.example.listadapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomAdapter extends BaseAdapter {


    private Integer[] movieImages = {
            R.drawable.Don2,
            R.drawable.Raees,
            R.drawable.Fan,
            R.drawable.Zero,
            R.drawable.HeraPheri,
            R.drawable.Dhol,
            R.drawable.Dhamal,
            R.drawable.KhattaMeetha
    };

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
