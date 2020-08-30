package com.resources.wu.util;

import java.util.Random;

/**
 * 获取可用端口
 * @author wutao
 *  @date 2016/10/31
 */
public class ServerPortUtils {
    /**
     * 获取可用端口
     * @return
     */
    public static int getAvailablePort(){
        int max = 65535;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max)%(max-min+1)+min;
       boolean using = NetUtils.isLocalPortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }

    }
}
