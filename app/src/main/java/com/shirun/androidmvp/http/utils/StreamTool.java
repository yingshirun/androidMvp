package com.shirun.androidmvp.http.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by ying on 2016/6/21.
 */
public class StreamTool {

    public static void outputStream(OutputStream out,String string) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(out);
        bos.write(string.getBytes());
        bos.flush();
        bos.close();
    }

    public static byte[] inputStream(InputStream in) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        while ( (bis.read(buf)) !=-1){
            bos.write(buf,0,buf.length);
        }
        bos.close();
        byte[] data = bos.toByteArray();
        return data;
    }
}
