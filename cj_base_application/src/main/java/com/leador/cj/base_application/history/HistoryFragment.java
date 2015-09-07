package com.leador.cj.base_application.history;

import android.view.View;

import com.github.obsessive.library.eventbus.EventCenter;
import com.leador.cj.base_application.R;
import com.leador.cj.base_application.base.BaseFragment;

public class HistoryFragment extends BaseFragment {
    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_history;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }
}
