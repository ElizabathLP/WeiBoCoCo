package top.elizabath.weibococo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.activity.login.LoginActivity;
import top.elizabath.weibococo.ui.util.ActivityManager;

public class ActivityBase extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ActivityBase ===> ", getClass().getSimpleName());
        ActivityManager.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.removeActivity(this);
    }

}
