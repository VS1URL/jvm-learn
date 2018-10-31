package com.gdou.jvm.learn.cglib;


import net.sf.cglib.core.KeyFactory;

/**
 * Created by zwchen on 17-3-10.
 */
public class DynamicCreateObject {
    public interface MyPo{
        public Object newInstance(String id);
    }

    public static void main(String[] args){
        MyPo po= (MyPo) KeyFactory.create(MyPo.class);
        Object obj1 = po.newInstance("sz0001");
        Object obj2 = po.newInstance("sz0001");
        Object obj3 = po.newInstance("sz0002");

        System.out.print(obj1.equals(obj2));
        System.out.print(obj2.equals(obj3));
    }
}
