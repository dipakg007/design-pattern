package com.design;

import com.design.multithreading.MyThread;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MyThread mythread = new MyThread();
            mythread.start();
        }
    }
}