package com.bosssoft.hr.javase.HttpFileDownloader;/*
 *
 * @author DELL
 * @date 2022/06/240022
 **/

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

class HttpFileDownloader{
/**
 *  平台提供的存放user.xml文件的地址
 */
    public Boolean download(String url){
        try {
            URL urlString = new URL(url);
            URLConnection connection = urlString.openConnection();
            connection.setConnectTimeout(5*1000);
            InputStream inputStream = connection.getInputStream();
            byte[] byteArr = new byte[1024];
            int len;
            File localFile= new File("D:\\test_download.exe");
            File dir = localFile.getParentFile();
            if (dir.exists() == false) {
                dir.mkdirs();
            }
            OutputStream outputStream = new FileOutputStream(localFile);
            while ((len = inputStream.read(byteArr)) != -1) {
                outputStream.write(byteArr, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        // 使用线程池下载文件如果成功返回true 否则失败
        // 将下载下来的文件解析打印输出
        return true;
        }
}

