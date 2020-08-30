package com.resources.wu.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyRunnable implements Runnable {
    private   SimpleDateFormat dateFormat = ThreadLocals.formatter.get();
    private String command;
    public MyRunnable(String s) {
        this.command=s;
    }
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Start.Time = "+ dateFormat.format(new Date()) );
        processCommand();
        System.out.println(Thread.currentThread().getName() +" End.Time = "+dateFormat.format(new Date()));
    }
}
