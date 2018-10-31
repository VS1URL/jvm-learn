package com.gdou.jvm.learn;

/**
 *
 * VM options: -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:PretenureSizeThreshold=3145728
 * Created by zwchen on 17-3-20.
 */
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold(){
        byte[] arr;
        arr = new byte[4*_1MB];
    }

    public static void main(String[] args){
        testPretenureSizeThreshold();
    }
}
