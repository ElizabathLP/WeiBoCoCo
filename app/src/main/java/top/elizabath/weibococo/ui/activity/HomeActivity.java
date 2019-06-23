package top.elizabath.weibococo.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.gson.reflect.TypeToken;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.activity.login.LoginActivity;
import top.elizabath.weibococo.ui.entity.WeiBoSearchResult;
import top.elizabath.weibococo.ui.util.HttpUtil;
import top.elizabath.weibococo.ui.util.JsonUtil;
import top.elizabath.weibococo.ui.view.SearchBarEditText;

public class HomeActivity extends ActivityBase
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(this);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        initView();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            RelativeLayout search_bar = findViewById(R.id.search_layout);
            search_bar.setVisibility(View.VISIBLE);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab:
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void getWeiBoList() {
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        params.put("containerid", "100103type%3D61%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91%26t%3D0");
        params.put("page_type", "searchall");
        params.put("page", "1");
        LinkedHashMap<String, String> headers = new LinkedHashMap<>();
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Mobile Safari/537.36");
//        headers.put("MWeibo-Pwa", "1");
//        headers.put("Referer", "https://m.weibo.cn/search?containerid=100103type%3D1%26q%3D%E7%99%BE%E5%BA%A6%E4%BA%91");
//        headers.put("X-Requested-With", "XMLHttpRequest");
//        headers.put("X-XSRF-TOKEN", "1a727e");
        HttpUtil.sendOkHttpGetRequest("https://m.weibo.cn/api/container/getIndex", params, headers, new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // 异常处理
                Log.d(TAG, "请求失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                // 返回数据
                String responseData = response.body().string();
                WeiBoSearchResult result = JsonUtil.gson.fromJson(responseData, WeiBoSearchResult.class);
                Log.d(TAG, result.getData().getCards().get(0).getCard_group().get(0).getMblog().getText());
            }
        });
    }

    private void initView() {
        SearchBarEditText search = findViewById(R.id.search_edit_text);
        search.setOnDrawableLeftListener(new SearchBarEditText.OnDrawableLeftListener() {
            @Override
            public void onDrawableLeftClick() {
                //左侧Drawable点击监听
                RelativeLayout search_bar = findViewById(R.id.search_layout);
                search_bar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "取消搜索", Toast.LENGTH_SHORT).show();
            }
        });
        search.setOnDrawableRightListener(new SearchBarEditText.OnDrawableRightListener() {
            @Override
            public void onDrawableRightClick() {
                //右侧Drawable点击监听
                getWeiBoList();
                Toast.makeText(getApplicationContext(), "点击了右侧按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
