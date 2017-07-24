package com.zx.aop;

import com.zx.aop.aop.service.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String [] args)
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Message tcpMessage =(Message)context.getBean("tcpMessage");

        Message udpMessage=(Message)context.getBean("udpMessage");

        tcpMessage.sendMessage();
        System.out.println("=========================================");
        udpMessage.sendMessage();
    }
}
