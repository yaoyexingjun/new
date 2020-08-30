package com.resources.wu.util;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 验证端口是否被占用
 * @author wutao
 *  @date 2016/10/31
 */
@Slf4j
public class NetUtils {
    /**
     * 测试本机段口是否被使用
     * @param port
     * @return
     */
    public static boolean isLocalPortUsing(int port){
        boolean flag =  true;
        try {
            flag = isPortUsing("127.0.0.1",port);
        } catch (Exception e) {

        }
        return flag;
    }

    /**
     * 测试主机的端口是否被占用
     * @param host
     * @param port
     * @return
     */
    public static boolean isPortUsing(String host,int port){
        boolean flag =  false;
        try {
            InetAddress Address = InetAddress.getByName(host);
            //建立一个socket链接
            Socket socket = new Socket(Address,port);
            flag =  true;

        } catch (IOException e) {
           //log.info(e.getMessage(),e);
        }
        return flag;
    }

    //start--end是索要检测的端口范围
    static int start =0;
    static int end = 1024;

    /***
     * 由于本机安装了MySQL。采用3306端口去验证
     * @param args
     */
    public static void main(String[] args) {
        int testPost = 9999;
        if (isLocalPortUsing(testPost)) {
            System.out.println("端口" + testPost + "已被占用");
        } else {
            System.out.println("端口" + testPost + "未使用");
        }
    }
}
