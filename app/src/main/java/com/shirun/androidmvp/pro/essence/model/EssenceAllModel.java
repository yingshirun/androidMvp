package com.shirun.androidmvp.pro.essence.model;

import android.content.Context;
import android.text.TextUtils;

import com.shirun.androidmvp.http.impl.HttpRequestParam;
import com.shirun.androidmvp.http.utils.HttpTask;
import com.shirun.androidmvp.http.utils.HttpUtils;
import com.shirun.androidmvp.pro.base.model.BaseModel;

/**
 * Created by ying on 2016/6/15.
 */
public class EssenceAllModel extends BaseModel {
    private String getUrl(){
        return super.getServerUrl()+"/api/api_open.php";
    }
    public EssenceAllModel(Context context) {
        super(context);
    }
    public void getAllEssence(String maxtime,int type,HttpTask.OnHttpResultListener callback){
        HttpRequestParam param = new HttpRequestParam();
        param.put("a","list");
        param.put("c","data");
        if(!TextUtils.isEmpty(maxtime)){
            param.put("maxtime",maxtime);
        }
        HttpTask.requestPost(getUrl(),param,callback);
    }
}
