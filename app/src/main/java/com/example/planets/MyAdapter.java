package com.example.planets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Planet> data;

    public MyAdapter(Context context, ArrayList<Planet> data) {
        this.inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Planet item = data.get(i);
        view = inflater.inflate(R.layout.planets_list_layout, null);

        TextView textView = view.findViewById(R.id.textViewItem);
        ImageView imageView = view.findViewById(R.id.imageView);

        textView.setText(item.getName());
        imageView.setImageResource(item.getImage());

        return view;
    }
}
