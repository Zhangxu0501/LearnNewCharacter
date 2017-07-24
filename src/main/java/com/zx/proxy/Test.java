package com.zx.proxy;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;

public class Test {
    @Resource
    private SortService s1;
    public static void main(String [] args)
    {
        int [] a = {1,3,6,4,5};
        SortService s = (SortService) Proxy.newProxyInstance(SortService.class.getClassLoader(),
                new Class[] {SortService.class},
                new ProxyHandler(new SortServiceImpl()));
        s.sort(a);
        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
