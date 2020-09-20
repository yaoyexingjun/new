package com.resources.wu.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Demo class
 * 获取昨天的现在时间
 *
 * @author
 * @date 2020/9/13
 */
public class Calendarwu {
    public static void main(String[] args) {
        Calendar   cal   =   Calendar.getInstance();
        cal.add(Calendar.DATE,  0);
        String yesterday = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss").format(cal.getTime());
        System.out.println(yesterday);

    }
}
