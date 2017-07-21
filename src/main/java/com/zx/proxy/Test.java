package com.zx.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String [] args)
    {
        int [] a = {1,3,6,4,5};
        SortService s = (SortService) Proxy.newProxyInstance(SortService.class.getClassLoader(),
                new Class[] {SortService.class},
                new ProxyHandler(new SortServiceImpl()));
        //必须是Interface.class
        s.sort(a);
        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
