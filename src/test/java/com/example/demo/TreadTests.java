package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

/**
 * Created by longmu on 16/01/2018.
 */

@SpringBootTest
public class TreadTests {
    class MyTread extends Thread {
        @Override
        public void run() {
            for (int i = 0;i<15;i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

    @Test
    public void testNewThread() {
        Thread myThread1 = new MyTread();
        myThread1.start();

        Thread myThread2 = new MyTread();
        myThread2.start();

        Assert.assertTrue(true);
    }

    @Test
    public void testCallable() {

        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 100;
            }
        };

        FutureTask<Integer> future = new FutureTask<Integer>(call);
        Thread tread = new Thread(future);
        tread.start();
        try {
            System.out.println(future.get());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
        }
        Assert.assertTrue(true);
    }

    private String findChar(String str) {
        String result = "a";
        int count = 0;

        for (int i=0;i<str.length();i++) {
            String tempStr = str;
            int num = 0;
            char a = str.charAt(i);
            int pos = str.indexOf(a);

            while (pos != -1) {
                num++;
                tempStr = tempStr.substring(pos+1);
                pos = tempStr.indexOf(a);
            }

            if (num >= count) {
                count = num;
                result = Character.toString(a);
            }
        }

        return result;
    }

    @Test
    public void testString() {
        String str = "abbadeeefggh";
        System.out.println(findChar(str));
        Assert.assertTrue(true);
    }


    //共计9个苹果，有2只猴子，一个猴子每次拿2个苹果，一个猴子每次拿3个苹果
    //如果剩余的苹果不够猴子每次拿的数量，则2只猴子停止拿苹果，请用java多线程模拟上面的描述。

    private static volatile int appleNum = 9;
    public class MonkeyThread extends Thread {

        private int oneGetNum ;
        public MonkeyThread(int num) {
            this.oneGetNum = num;
        }

        @Override
        public void run() {
            synchronized (this) {
                while (appleNum >= this.oneGetNum) {
                    appleNum = appleNum - this.oneGetNum;
                    System.out.println("每次拿" + oneGetNum + "个苹果成功");
                }
                System.out.println("苹果不足" + oneGetNum + "个");
            }
        }
    }


    @Test
    public void testMonkeyThread() {
        Thread thread1 = new MonkeyThread(2);
        Thread thread2 = new MonkeyThread(3);

        thread1.start();
        thread2.start();

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });

        Assert.assertTrue(true);
    }

}

