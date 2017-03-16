package com.jvm.learn;

/**
 * VM Options: -Xss128k
 * Created by zwchen on 17-3-8.
 */
public class VMStackSOF {
    private int stackLength=1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        VMStackSOF oom=new VMStackSOF();
        try{
            oom.stackLeak();
        }catch (Throwable ex){
            System.out.printf("stack length:"+oom.stackLength);
            throw ex;
        }
    }
}
