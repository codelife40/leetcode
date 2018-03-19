package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by longmu on 23/02/2018.
 */

@SpringBootTest
public class HelloTests {

    @Test
    public void testHashCode() {
        String s = "ok";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(s.hashCode());
        System.out.println(sb.hashCode());

        String t = new String("ok");

        if (s.equals(t)) {
            System.out.println("s = t");
        }

        StringBuffer tb = new StringBuffer(t);
        System.out.println(tb.hashCode());

        Assert.assertTrue(true);
    }
}
