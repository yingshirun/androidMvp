package com.shirun.androidmvp.pro.essence.presenter;

import android.content.Context;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.shirun.androidmvp.bean.EssecneListBean;
import com.shirun.androidmvp.http.utils.HttpTask;
import com.shirun.androidmvp.pro.base.presenter.BasePresenter;
import com.shirun.androidmvp.pro.essence.model.EssenceAllModel;
import com.shirun.androidmvp.pro.essence.view.IEssenceAllView;

/**
 * Created by ying on 2016/6/15.
 */
public class EssenceAllPresenter extends BasePresenter<IEssenceAllView,EssenceAllModel> {

    private String maxTime;

    public EssenceAllPresenter(Context context) {
        super(context);

    }

    public void getAllEssence(int type){
        getView().showDialog();
        getModel().getAllEssence(maxTime, type, new HttpTask.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                getView().hideDialog();
                if(isDestroy()){
                    return;
                }
                if(TextUtils.isEmpty(result)){
                    getView().error(new Exception("网络异常，稍后再试"));
                    return;
                }
                EssecneListBean bean = JSONObject.parseObject(result, EssecneListBean.class);
                maxTime = bean.getInfo().getMaxtime();
                getView().loadData(bean);
            }
        });
    }

    @Override
    public EssenceAllModel bindModel() {
        return new EssenceAllModel(getContext());
    }
}
