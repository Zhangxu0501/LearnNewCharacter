package com.zx.aop.aop.service;

public class UdpMessage implements Message {
    public void sendMessage() {
        System.out.println("send a UdpMessage!");
    }

    public void receiveMessage() {
        System.out.println("receive a UdpMessage!");

    }
}
