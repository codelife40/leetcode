package com.example.demo.service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by longmu on 05/02/2018.
 */
public class HelloAOP {

    public HelloAOP() {}

    public void sayHello() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        HelloAOP aop = new HelloAOP();
        aop.sayHello();
    }
}

