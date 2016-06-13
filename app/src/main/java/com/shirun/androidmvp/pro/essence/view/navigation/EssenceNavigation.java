package com.shirun.androidmvp.pro.essence.view.navigation;

import android.content.Context;

import com.shirun.androidmvp.R;
import com.shirun.androidmvp.pro.base.view.navigation.NavigationBuilderAdapter;

/**
 * Created by ying on 2016/6/13.
 */
public class EssenceNavigation extends NavigationBuilderAdapter {
    public EssenceNavigation(Context mContext) {
        super(mContext);
    }

    @Override
    public int getLyoutId() {
        return R.layout.toolbar_essence_layout;
    }

    @Override
    public int getRightId() {
        return R.id.iv_right;
    }

    @Override
    public int getLeftId() {
        return R.id.iv_left;
    }

    @Override
    public int getTitleId() {
        return R.id.iv_title;
    }
}
