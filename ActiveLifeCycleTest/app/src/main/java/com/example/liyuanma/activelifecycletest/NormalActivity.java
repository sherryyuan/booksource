package com.example.liyuanma.activelifecycletest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class NormalActivity extends BaseActivity {

    public static void actionStart(Context context, String para1, String para2){
        Intent intent = new Intent(context, NormalActivity.class);
        intent.putExtra("param1", para1);
        intent.putExtra("param2", para2);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

    }

}
