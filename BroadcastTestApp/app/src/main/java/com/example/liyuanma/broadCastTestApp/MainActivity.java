package com.example.liyuanma.broadCastTestApp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private IntentFilter intentFilter;

    private NetworkChangeReceiver networkChangeReceiver;

    private LocalReceiver localReceiver;
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.liyuanma.broadCastTestApp.LOCAL_BROADCAST");
                localBroadcastManager.sendBroadcast(intent);//send local broadcast
            }
        });

        intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.liyuanma.broadCastTestApp.LOCAL_BROADCAST");
        localReceiver = new LocalReceiver();
        localBroadcastManager.registerReceiver(localReceiver, intentFilter);//register the local broad reveicer

//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent("com.example.liyuanma.broadCastTestApp.MY_BROADCAST");
//                //sendBroadcast(intent);
//                sendOrderedBroadcast(intent, null);
//            }
//        });
//        intentFilter = new IntentFilter();
//        intentFilter.addAction(
//                "android.net.conn.CONNECTIVITY_CHANGE");//add an intent filter to the broadcast
//        // type need to listen
//        networkChangeReceiver = new NetworkChangeReceiver();
//        registerReceiver(networkChangeReceiver,
//                intentFilter);//the reciever will accept all th connectivity_change
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /**
         * the reciever need to unregister when distory the activity
         */
        //unregisterReceiver(networkChangeReceiver);
        unregisterReceiver(localReceiver);
    }

    /**
     * Dynamic Boardcast Receiver
     */
    class NetworkChangeReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            /*
            connectiveManager is the system service class. Used to manager the network
             */
            ConnectivityManager connectivityManager =
                    (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = connectivityManager.getActiveNetworkInfo();
            if (info != null && info.isAvailable()) {
                Toast.makeText(context, "network is available", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "network is unavailable", Toast.LENGTH_SHORT).show();
            }

        }
    }

    class LocalReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "received local broadcast", Toast.LENGTH_SHORT).show();
        }
    }

}
