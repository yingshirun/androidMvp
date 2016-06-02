package com.shirun.androidmvp.mvp.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shirun.androidmvp.mvp.presenter.MvpPresenter;

/**
 * Created by ying on 2016/6/2.
 */
public abstract class MvpBaseFragment<M,P extends MvpPresenter> extends Fragment implements MvpImplView<M> {

    private P presenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = bindPresenter();
        if(presenter != null){
            presenter.attach(this);
        }

    }
    protected abstract P bindPresenter();

    public P getPresenter() {
        if(presenter == null){
            throw new NullPointerException("请先绑定presenter在使用");
        }
        return presenter;
    }

}
