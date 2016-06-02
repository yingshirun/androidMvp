package com.shirun.androidmvp.pro.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shirun.androidmvp.mvp.presenter.MvpPresenter;
import com.shirun.androidmvp.mvp.view.impl.MvpBaseFragment;

/**
 * Created by ying on 2016/6/2.
 */
public abstract class BaseFragment<P extends MvpPresenter> extends MvpBaseFragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(getLayoutId(),container,false);
            initView(view);
        }
        ViewGroup parent = (ViewGroup) view.getParent();
        if(parent != null){
            parent.removeView(view);
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
    }

    protected  void initData(){

    }

    @Override
    protected P bindPresenter() {
        return null;
    }

    protected abstract void initView(View view);

    protected abstract int getLayoutId();
}
