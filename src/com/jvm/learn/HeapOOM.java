package com.jvm.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * VM options: -Xmx20m -Xms20m -XX:+HeapDumpOnOutOfMemoryError
 * Created by zwchen on 17-3-8.
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list=new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
