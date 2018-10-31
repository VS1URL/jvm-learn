package com.gdou.jvm.learn;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * VM options: -XX:PermSize=10m -XX:MaxPermSize=10m
 * Created by zwchen on 17-3-10.
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args){
        do {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(objOOM.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o, objects);
                }
            });

            enhancer.create();
        } while (true);
    }

    static class objOOM{

    }
}
