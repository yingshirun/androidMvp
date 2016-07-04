package com.shirun.androidmvp.pro.base.view;

import com.shirun.androidmvp.mvp.view.MvpView;

/**
 * Created by ying on 2016/6/16.
 */
public interface IBaseView<T> extends MvpView{
    void showDialog();
    void hideDialog();
    void loadData(T data,boolean isDownRefresh);
    void error(Exception e);
}
