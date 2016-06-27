package com.shirun.androidmvp.pro.base.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pnikosis.materialishprogress.ProgressWheel;
import com.shirun.androidmvp.mvp.presenter.MvpPresenter;
import com.shirun.androidmvp.mvp.presenter.impl.MvpBasePresenter;
import com.shirun.androidmvp.mvp.view.impl.MvpBaseFragment;

import me.drakeet.materialdialog.MaterialDialog;

/**
 * Created by ying on 2016/6/2.
 */
public abstract class BaseFragment<P extends MvpPresenter> extends MvpBaseFragment<P> {

    private View view;
    public  String TAG = getClass().getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(getLayoutId(),container,false);
            initView(view);
            Log.e(TAG,"onCreateView __ initView");
        }
        ViewGroup parent = (ViewGroup) view.getParent();
        if(parent != null){
            parent.removeView(view);
            Log.e(TAG,"onCreateView __ removeView");
        }
        Log.e(TAG,"onCreateView end");
        return view;
    }

    private MaterialDialog dialog;

    public void showLoading(boolean isShow) {

        if (isShow) {
            if (dialog == null) {
                ProgressWheel progressWheel = new ProgressWheel(getActivity());
                progressWheel.setBarColor(Color.BLUE);
                dialog = new MaterialDialog(getActivity());
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
    public void onDestroyView() {
        super.onDestroyView();
        if( dialog != null){
            dialog.dismiss();
            dialog = null;
        }
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
