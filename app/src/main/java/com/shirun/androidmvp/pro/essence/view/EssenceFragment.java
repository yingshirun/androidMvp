package com.shirun.androidmvp.pro.essence.view;

import android.view.View;

import com.shirun.androidmvp.R;
import com.shirun.androidmvp.pro.base.view.BaseFragment;
import com.shirun.androidmvp.pro.essence.presenter.EssencePresenter;

/**
 * Created by ying on 2016/6/12.
 */
public class EssenceFragment extends BaseFragment<EssencePresenter> implements IEssenceView {
    @Override
    protected void initView(View view) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_essence;
    }

    @Override
    protected EssencePresenter bindPresenter() {
        return new EssencePresenter(getContext());
    }
}
