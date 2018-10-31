package com.gdou.jvm.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Options: -Xmx100M -Xms100M -XX:+PrintGCDetails -XX:UseSerialGC
 * Created by zwchen on 17-3-22.
 */
public class FillHeap {

    static class OOMObject{
        public byte[] placeholder = new byte[64 * 1024 * 1024];
    }

    public static void fillHead() throws InterruptedException{
        List<HeapOOM.OOMObject> list = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            Thread.sleep(20L);
            list.add(new HeapOOM.OOMObject());
        }
        System.gc();
    }

    public static void main(String[] agrs) throws InterruptedException {
        fillHead();
    }
}
