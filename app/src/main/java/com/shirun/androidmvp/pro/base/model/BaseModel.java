package com.shirun.androidmvp.pro.base.model;

import android.content.Context;

import com.shirun.androidmvp.mvp.model.impl.MvpBaseModel;

/**
 * Created by ying on 2016/6/2.
 */
public abstract class BaseModel extends MvpBaseModel{

    private String serverUrl = "http://api.budejie.com";

    private Context mContext;

    public BaseModel(Context context) {
        this.mContext = context;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public Context getContext() {
        return mContext;
    }
}
