package com.zx.aop.aop.service;

public class TcpMessage implements Message {
    public void sendMessage() {
        System.out.println("send a TcpMessage!");
    }

    public void receiveMessage() {
        System.out.println("receive a TcpMessage!");
    }
}
