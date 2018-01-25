package com.example.demo.lintcode.easy;

/**
 * Created by longmu on 25/01/2018.
 */
public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    private int width;
    private int height;

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    public Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here

    public int getArea() {
        return this.width * this.height;
    }
}
