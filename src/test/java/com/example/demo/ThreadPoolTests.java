package com.example.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by longmu on 16/03/2018.
 */

@SpringBootTest
public class ThreadPoolTests {

    @Test
    public void testCreateThreadPool() {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue
            <Runnable>(5));

        //ExecutorService executor = Executors.newFixedThreadPool(10);



        for (int i = 0; i < 20; i++) {
            MyTask task = new MyTask(i);
            executor.execute(task);

            System.out.println("已经创建第"+ i+"个线程，当前线程数"+ executor.getPoolSize() + ",当前等待的线程数" + executor.getQueue().size()+",已经完成的线程数"+ executor.getCompletedTaskCount());
        }

        executor.shutdown();

        Assert.assertTrue(true);
    }

    public class MyTask implements Runnable {

        private int taskNum;

        public MyTask (int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {
            try {
                System.out.println("正在执行第" + this.taskNum + "个线程");
                Thread.sleep(4000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}


