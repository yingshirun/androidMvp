package com.shirun.androidmvp.pro.base.view;

import android.graphics.Color;

import com.pnikosis.materialishprogress.ProgressWheel;
import com.shirun.androidmvp.mvp.presenter.MvpPresenter;
import com.shirun.androidmvp.mvp.view.impl.MvpBaseActivity;

import me.drakeet.materialdialog.MaterialDialog;

/**
 * Created by ying on 2016/6/2.
 */
public class BaseActivity<M, P extends MvpPresenter> extends MvpBaseActivity<M, P> {


    private MaterialDialog dialog;

    public void showLoading(boolean isShow) {

        if (isShow) {
            if (dialog == null) {
                ProgressWheel progressWheel = new ProgressWheel(this);
                progressWheel.setBarColor(Color.BLUE);
                dialog = new MaterialDialog(this);
                dialog.setContentView(progressWheel);
            }
            dialog.show();
        } else {
            if (dialog != null) {
                dialog.dismiss();
            }
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }
    }

    @Override
    protected P bindPresenter() {
        return null;
    }


}
