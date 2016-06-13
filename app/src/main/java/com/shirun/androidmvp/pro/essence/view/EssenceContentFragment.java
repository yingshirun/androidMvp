package com.shirun.androidmvp.pro.essence.view;

import android.view.View;

import com.shirun.androidmvp.mvp.presenter.MvpPresenter;
import com.shirun.androidmvp.pro.base.view.BaseFragment;

/**
 * Created by ying on 2016/6/13.
 */
public abstract class EssenceContentFragment<P extends MvpPresenter> extends BaseFragment<P> {
    private int mType;
    private String mTitle;

    public int getType() {
        return mType;
    }

    public void setType(int mType) {
        this.mType = mType;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
