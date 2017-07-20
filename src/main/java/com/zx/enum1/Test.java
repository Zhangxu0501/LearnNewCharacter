package com.zx.enum1;

/**
 * Created by zx142489 on 2017/7/18.
 */
public class Test {
    public static void main(String [] args)
    {
        StateEnum a = StateEnum.INITIAL;
        System.out.println(a.getIndex());
        System.out.println(a.getDescription());
    }
}
