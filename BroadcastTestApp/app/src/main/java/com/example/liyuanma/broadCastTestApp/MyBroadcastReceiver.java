package com.example.liyuanma.broadCastTestApp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "reveived in MyBroadcastReceiver", Toast.LENGTH_SHORT).show();
        /**
         * Sets the flag indicating that this receiver should abort the
         * current broadcast; only works with broadcasts sent through
         * {@link Context#sendOrderedBroadcast(Intent, String)
         * Context.sendOrderedBroadcast}.
         */
        abortBroadcast();
    }
}
