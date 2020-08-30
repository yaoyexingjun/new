package com.resources.wu.util;


/**
 * 去掉字符串尾部的空字符，工具
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class TrimTool {

    /**
     * 截取字符串中空字符之前的字符串。
     *
     * @param s:尾部带有空字符的java字符串
     * @return
     *
     */
    public static String trim(String s){
        //1、判断传进来的字符串是否为空，为空返回null否则继续执行
        if (s == null){
            return  null;
        }

        //2、把传进来的字符串转换成char类型的数组
        char[] chars = s.toCharArray();

        //3、创建一个StringBuffer对象用来存放去除空字符的字符串
        StringBuffer sb = new StringBuffer();

        for (char c:
             chars) {
            Character ch = c;
            //4、如果到了字符串结束，则跳出循环
            if (0 == ch.hashCode()) {
                break;
            }else {
                sb.append(c);
            }
        }

        //5、转换成字符串
        return sb.toString();
    }

}
