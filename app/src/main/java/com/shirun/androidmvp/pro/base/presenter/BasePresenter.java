package com.shirun.androidmvp.pro.base.presenter;

import android.content.Context;

import com.shirun.androidmvp.mvp.model.MvpModel;
import com.shirun.androidmvp.mvp.presenter.impl.MvpBasePresenter;
import com.shirun.androidmvp.mvp.view.MvpView;

/**
 * Created by ying on 2016/6/2.
 */
public abstract class BasePresenter<V extends MvpView,M extends MvpModel> extends MvpBasePresenter<V,M> {

    private Context mContext;

    public BasePresenter(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return mContext;
    }
}
