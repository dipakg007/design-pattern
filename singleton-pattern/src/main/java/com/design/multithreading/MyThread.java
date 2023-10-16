package com.design.multithreading;

import com.design.singleton.Singleton;

public class MyThread extends Thread{

    @Override
    public void run(){
        Singleton myInstance = Singleton.getMyInstance();
        System.out.println(myInstance.getCount());
    }
}
