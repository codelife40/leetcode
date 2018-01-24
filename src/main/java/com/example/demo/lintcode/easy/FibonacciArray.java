package com.example.demo.lintcode.easy;

/**
 * Created by longmu on 24/01/2018.
 */
public class FibonacciArray {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0;i< n - 1;i ++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(41));
    }
}


