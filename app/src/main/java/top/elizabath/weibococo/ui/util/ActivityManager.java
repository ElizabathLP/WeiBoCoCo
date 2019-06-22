package top.elizabath.weibococo.ui.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityManager {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void removeAllActivity(){
        for (Activity activity : activities) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
        killAppProgess();
    }

    public static void killAppProgess(){
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
