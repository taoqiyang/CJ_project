package com.leador.cj_project;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.View;

import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.library.netstatus.NetUtils;
import com.leador.cj.base_application.base.BaseActivity;
import com.leador.cj_project.temp.TestFragment;

public class MainActivity extends BaseActivity {
    private TestFragment fragment;

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {
        fragment = new TestFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.content, fragment).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(fragment.getCustomView() != null){
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(fragment.getCustomView());
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return true;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }
}
