package com.zx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler{
    private Object invokeObject;

    public ProxyHandler(Object invokeObject) {
        this.invokeObject = invokeObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before method run");
        Object o =method.invoke(this.invokeObject,args);
        System.out.println("atfer method run");
        return o;
    }
}
