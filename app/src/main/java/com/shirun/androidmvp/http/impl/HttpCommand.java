package com.shirun.androidmvp.http.impl;

import com.shirun.androidmvp.http.IHttpCommand;
import com.shirun.androidmvp.http.IHttpRequestParam;
import com.shirun.androidmvp.http.utils.HttpUtils;

import java.util.HashMap;

/**
 * Created by ying on 2016/6/16.
 */
public class HttpCommand implements IHttpCommand {

    @Override
    public String execute(String url, IHttpRequestParam requestParam) {
        return HttpUtils.post(url,requestParam);
    }
}
