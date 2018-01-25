package com.example.demo.lintcode.easy;

/**
 * Created by longmu on 25/01/2018.
 */
public class SortIntegers {

    public void sortIntegers(int[] A) {
        // write your code here
        if (A != null) {
            int temp = 0;
            for (int i = 0; i < A.length; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] > A[j]) {
                        temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
        }
    }
}
