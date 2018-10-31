package com.gdou.jvm.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Options: -XX:PermSize=10m -XX:MaxPermSize=10m
 * HotSpot:ignoring option PermSize10m; support was removed in 8.0
 * 1.8
ed by zwchen on 17-3-8.
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        int i=0;
        do {
            list.add(String.valueOf(i++).intern());
        } while (true);

//        interestingForIntern();
    }


//    public static void interestingForIntern(){
//        String str1=new StringBuilder("计算机").append("软件").toString();
//        System.out.printf(str1.intern()==str1);
//
//        String str2=new StringBuilder("ja").append("va").toString();
//        System.out.printf(str2.intern()==str2);
//    }
}
