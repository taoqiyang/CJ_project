
package com.leador.cj.base_application.base;

import android.view.View;

import com.github.obsessive.library.base.BaseLazyFragment;

public abstract class BaseFragment extends BaseLazyFragment implements BaseView {

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

    /**
     * activity中的onCreateOptionMenu回调此方法,如果返回不为null，则会把返回的view设置到actionbar的customview上
     * @return  要显示到actionbar上的customview
     */
    public View getCustomView(){return null;}

}
