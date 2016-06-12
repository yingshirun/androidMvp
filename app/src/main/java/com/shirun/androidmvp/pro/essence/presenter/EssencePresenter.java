package com.shirun.androidmvp.pro.essence.presenter;

import android.content.Context;

import com.shirun.androidmvp.pro.base.presenter.BasePresenter;
import com.shirun.androidmvp.pro.essence.model.EssenceModel;
import com.shirun.androidmvp.pro.essence.view.EssenceFragment;
import com.shirun.androidmvp.pro.essence.view.IEssenceView;

/**
 * Created by ying on 2016/6/12.
 */
public class EssencePresenter extends BasePresenter<IEssenceView,EssenceModel> {


    public EssencePresenter(Context context) {
        super(context);
    }

    @Override
    public EssenceModel bindModel() {
        return new EssenceModel(getContext());
    }
}
