package com.shirun.androidmvp.mvp.presenter;

import com.shirun.androidmvp.mvp.model.MvpModel;
import com.shirun.androidmvp.mvp.view.MvpView;

/**
 * Created by ying on 2016/6/2.
 */
public interface MvpPresenter<V extends MvpView,M extends MvpModel> {
    void attach(V view);
    void destroy();

    M bindModel();
    M getModel();
}
