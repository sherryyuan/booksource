package com.example.liyuanma.broadcastbestpracticeapp;


/**
 * Created by liyuanma on 2017-12-13.
 */

import android.app.Activity;

import java.util.ArrayList;

/**
 * create a action list. Put all in here.
 */
public class ActivityCollector {

    private static ArrayList<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void removeAll(){
        for(Activity activity : activities){
            if(activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
