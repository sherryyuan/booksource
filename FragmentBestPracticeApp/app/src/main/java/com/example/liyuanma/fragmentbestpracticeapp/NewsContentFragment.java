package com.example.liyuanma.fragmentbestpracticeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by liyuanma on 2017-12-12.
 */

public class NewsContentFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_fragment,container, false);
        return view;
    }

    public void refresh(String newsTitle, String newsContent){
        View visibilityLayout = view.findViewById(R.id.vidibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleView = view.findViewById(R.id.news_title);
        TextView newsContentView = view.findViewById(R.id.news_content);
        newsTitleView.setText(newsTitle);
        newsContentView.setText(newsContent);
    }
}
