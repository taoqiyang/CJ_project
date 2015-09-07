/*
 * Copyright (c) 2015 [1076559197@qq.com | tchen0707@gmail.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.leador.cj.base_application.base;

import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.obsessive.library.base.BaseAppCompatActivity;
import com.github.obsessive.library.eventbus.EventCenter;
import com.leador.cj.base_application.BaseApplication;
import com.leador.cj.base_application.R;

import butterknife.ButterKnife;

public abstract class BaseActivity extends BaseAppCompatActivity implements BaseView {

    protected Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isApplyStatusBarTranslucency()) {
            setSystemBarTintDrawable(new ColorDrawable(getAttrColor(R.attr.colorPrimary)));
        }
    }

    protected int getAttrColor(int attr) {
        TypedArray a = obtainStyledAttributes(new int[]{attr});
        int color = a.getColor(0, 0);
        a.recycle();
        return color;
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mToolbar = ButterKnife.findById(this, R.id.common_toolbar);
        if (null != mToolbar) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public void onEventMainThread(EventCenter eventCenter) {
        super.onEventMainThread(eventCenter);
    }

    protected BaseApplication getBaseApplication() {
        return (BaseApplication) getApplication();
    }

    @Override
    public void showError(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showException(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showNetError() {
        toggleNetworkError(true, null);
    }

    @Override
    public void showLoading(String msg) {
        toggleShowLoading(true, null);
    }

    @Override
    public void hideLoading() {
        toggleShowLoading(false, null);
    }
}
