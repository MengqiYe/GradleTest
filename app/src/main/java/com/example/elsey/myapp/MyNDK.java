package com.example.elsey.myapp;

/**
 * Created by Elsey on 2017/5/19.
 */

public class MyNDK {
    static {
        System.loadLibrary("MyLibrary");
    }
    public native String getMyString();
}
