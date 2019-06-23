package top.elizabath.weibococo.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.widget.RelativeLayout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import okhttp3.Call;

import okhttp3.Response;
import top.elizabath.weibococo.R;
import top.elizabath.weibococo.ui.activity.login.LoginActivity;
import top.elizabath.weibococo.ui.adapter.WeiBoAdapter;
import top.elizabath.weibococo.ui.entity.PopularWeiBoResult;
import top.elizabath.weibococo.ui.entity.WeiBoBean;
import top.elizabath.weibococo.ui.entity.WeiBoSearchResult;
import top.elizabath.weibococo.ui.util.GsonUtil;
import top.elizabath.weibococo.ui.util.HttpUtil;
import top.elizabath.weibococo.ui.util.ToastUtil;
import top.elizabath.weibococo.ui.util.URLHelper;
import top.elizabath.weibococo.ui.view.SearchBarEditText;

public class HomeActivity extends ActivityBase
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private final String TAG = getClass().getSimpleName();
    private final int UPDATE_WEIBO_LIST = 1;

    private SearchBarEditText search;
    private RelativeLayout search_bar;
    private DrawerLayout drawer;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private FloatingActionButton fab;
    private RecyclerView weibolist;
    private GridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        layoutManager = new GridLayoutManager(this, 1);
        searchPopularWeiBo(null);
        setSupportActionBar(toolbar);
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

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        search.setOnDrawableLeftListener(() -> {
            //左侧Drawable点击监听
            search_bar.setVisibility(View.GONE);
            search.setText("");
            ToastUtil.showToast(HomeActivity.this, "取消搜索");
        });
        search.setOnDrawableRightListener(() -> {
            //右侧Drawable点击监听
            searchRealTimeWeiBo(search.getText().toString(), null);
            Log.i(TAG, "点击了右侧按钮");
        });

    }

    @Override
    public void onBackPressed() {
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

    public void searchRealTimeWeiBo(String searchKey, String pageNumber) {
        if (null == pageNumber || "".equals(pageNumber.trim())) {
            pageNumber = "1";
        }
        if (Integer.valueOf(pageNumber) < 1) {
            ToastUtil.showToast(HomeActivity.this, "没有更多了哦");
        }
        if (null == searchKey || "".equals(searchKey.trim())) {
            return;
        }
        searchKey = URLHelper.encode(searchKey);
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        params.put("containerid", "100103type%3D61%26q%3D" + searchKey + "%26t%3D0");
        params.put("page_type", "searchall");
        params.put("page", pageNumber);
        LinkedHashMap<String, String> headers = new LinkedHashMap<>();
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Mobile Safari/537.36");
        getWeiBoList(params, headers, WeiBoSearchResult.class);
    }

    public void searchPopularWeiBo(String pageNumber) {
        if (null == pageNumber || "".equals(pageNumber.trim())) {
            pageNumber = "1";
        }
        if (Integer.valueOf(pageNumber) < 1) {
            ToastUtil.showToast(HomeActivity.this, "没有更多了哦");
        }
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        params.put("containerid", "102803");
        params.put("openApp", "0");
        params.put("since_id", pageNumber);
        LinkedHashMap<String, String> headers = new LinkedHashMap<>();
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Mobile Safari/537.36");
        getWeiBoList(params, headers, PopularWeiBoResult.class);
    }

    public <T> void getWeiBoList(LinkedHashMap<String, String> params, LinkedHashMap<String, String> headers, Class clazz) {
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
                List<WeiBoBean> data = new ArrayList<>();
                if ("top.elizabath.weibococo.ui.entity.PopularWeiBoResult".equals(clazz.getName())) {
                    PopularWeiBoResult result = GsonUtil.fromJson(responseData, PopularWeiBoResult.class);
                    data = result.getData().getCards();
                } else if ("top.elizabath.weibococo.ui.entity.WeiBoSearchResult".equals(clazz.getName())) {
                    WeiBoSearchResult result = GsonUtil.fromJson(responseData, WeiBoSearchResult.class);
                    try {
                        data = result.getData().getCards().get(0).getCard_group();
                    } catch (Exception e) {
                        data = new ArrayList<>();
                    }
                    if (null == data) {
                        data = new ArrayList<>();
                    }
                } else {
                    return;
                }
                Message message = new Message();
                message.what = UPDATE_WEIBO_LIST;
                message.obj = data;
                handler.sendMessage(message);
            }
        });
    }

    private void initView() {
        search = findViewById(R.id.search_edit_text);
        search_bar = findViewById(R.id.search_layout);
        toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        fab = findViewById(R.id.fab);
        weibolist = findViewById(R.id.weibolist);
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            switch (msg.what) {
                case UPDATE_WEIBO_LIST:
                    List<WeiBoBean> weiBoList = (List<WeiBoBean>) msg.obj;
                    weibolist.setLayoutManager(layoutManager);
                    WeiBoAdapter weiBoAdapter = new WeiBoAdapter(weiBoList);
                    weibolist.setAdapter(weiBoAdapter);
                    break;
                default:
                    break;
            }
        }
    };
}
