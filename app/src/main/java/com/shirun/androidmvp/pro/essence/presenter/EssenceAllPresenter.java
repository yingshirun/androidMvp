package com.shirun.androidmvp.pro.essence.presenter;

import android.content.Context;

import com.shirun.androidmvp.mvp.model.MvpModel;
import com.shirun.androidmvp.pro.base.presenter.BasePresenter;
import com.shirun.androidmvp.pro.essence.model.EssenceAllModel;
import com.shirun.androidmvp.pro.essence.view.IEssenceView;

/**
 * Created by ying on 2016/6/15.
 */
public class EssenceAllPresenter extends BasePresenter<IEssenceView,EssenceAllModel> {
    public EssenceAllPresenter(Context context) {
        super(context);
    }


    @Override
    public EssenceAllModel bindModel() {
        return null;
    }
}
