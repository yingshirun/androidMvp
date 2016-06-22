package com.shirun.androidmvp.http.utils;

import android.os.Handler;
import android.os.Message;

import com.shirun.androidmvp.http.IHttpRequestParam;
import com.shirun.androidmvp.http.IHttpThreadExecutor;
import com.shirun.androidmvp.http.impl.HttpCommand;

/**
 * Created by ying on 2016/6/21.
 */
public class HttpTask {
    static IHttpThreadExecutor executor = ThreadPoolUtils.getInstance();
    public static void requestPost(String url, IHttpRequestParam requestParam, final OnHttpResultListener listener){
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                listener.onResult(msg.obj.toString());
            }
        };
        HttpCommand httpCommand = new HttpCommand();
        Runnable httpRunnable = new HttpRunnable(url, httpCommand, requestParam, handler);
        //添加到线程池中 线程池待实现
        executor.addTask(httpRunnable);
    }
    interface OnHttpResultListener{
        void onResult(String result);
    }
}
