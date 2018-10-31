package com.gdou.jvm.learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by zwchen on 17-3-23.
 */
public class ThreadMonitor {
    /**
     * 线程死循环演示
     */
    public static void createBusyThread(){
        Thread thread = new Thread(new Runnable() {
            public void run() {
                do {
                    System.out.println("1");
                } while (true);
            }
        }, "testBusyThread");
        thread.start();
    }

    /**
     * 线程等待演示
     */
    public static void createLockThread(final Object lock){
        Thread thread = new Thread(new Runnable() {
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        createBusyThread();
        reader.readLine();
        Object obj = new Object();
        createLockThread(obj);
    }
}
