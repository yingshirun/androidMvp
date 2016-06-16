package com.shirun.androidmvp.http.utils;

import com.shirun.androidmvp.http.IHttpRequestParam;

import java.util.Map;
import java.util.Set;

/**
 * Created by ying on 2016/6/16.
 */
public class HttpUtils {

    public static String psot(String url, IHttpRequestParam<Map<String,Object>,Map<String,Object>> requestParam){
        Map<String, Object> requestParam1 = requestParam.getRequestParam();
        String paramToString = paramToString(requestParam1);
        return "";
    }

    private static String paramToString(Map<String,Object> map){
        StringBuilder sb = new StringBuilder();
        Set<String> set = map.keySet();
        for (String s : set) {
            sb.append(s);
            sb.append("=");
            sb.append(map.get(s));
            sb.append("&");
        }
        String substring = sb.substring(0, sb.length() - 1);
        return substring;
    }
}
