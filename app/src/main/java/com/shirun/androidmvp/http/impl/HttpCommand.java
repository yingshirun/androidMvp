package com.shirun.androidmvp.http.impl;

import com.shirun.androidmvp.http.IHttpCommand;
import com.shirun.androidmvp.http.IHttpRequestParam;

import java.util.HashMap;

/**
 * Created by ying on 2016/6/16.
 */
public class HttpCommand implements IHttpCommand<HashMap<String,Object>> {

    @Override
    public void execute(String url, IHttpRequestParam requestParam) {

    }
}
