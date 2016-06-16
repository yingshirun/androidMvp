package com.shirun.androidmvp.http;

/**
 * Created by ying on 2016/6/16.
 */
public interface IHttpCommand<T> {
    public void execute(String url,IHttpRequestParam<T> requestParam);
}
