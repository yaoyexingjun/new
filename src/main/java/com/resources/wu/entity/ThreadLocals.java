package com.resources.wu.entity;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ThreadLocal用法:多线程时格式化时间
 *
 * @author
 * @date
 */
public class ThreadLocals implements Runnable{
    public static final java.lang.ThreadLocal<SimpleDateFormat> formatter =
            new java.lang.ThreadLocal<SimpleDateFormat>(){

                @Override
                protected SimpleDateFormat initialValue()
                {
                    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                }
            };

//    private static final ThreadLocal<SimpleDateFormat>formatter=
//            ThreadLocal.withInitial(() ->new SimpleDateFormat("yyyyMMdd HHmm"));
//
//    public static void main(String[] args) throws Exception
//    {
//        ThreadLocals obj=new ThreadLocals();
//    }
public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat dateFormat = formatter.get();
    System.out.println(dateFormat.format(date));
}
    @Override
    public void run() {

    }
}
