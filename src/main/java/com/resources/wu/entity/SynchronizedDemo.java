package com.resources.wu.entity;

/**
 * synchronized修饰代码块
 *
 * @author
 * @date
 */
public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("synchronized ");
        }
    }
}
