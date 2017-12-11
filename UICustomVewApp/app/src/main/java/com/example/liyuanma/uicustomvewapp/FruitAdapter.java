package com.example.liyuanma.uicustomvewapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liyuanma.uicustomvewapp.layout.Fruit;

import java.util.List;

/**
 * Created by liyuanma on 2017-12-11.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(@NonNull Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);//get current fruit item
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView imageView = view.findViewById(R.id.fruit_image);
        TextView textView = view.findViewById(R.id.fruit_name);
        imageView.setImageResource(fruit.getImageId());
        textView.setText(fruit.getName());
        return view;
    }
}
