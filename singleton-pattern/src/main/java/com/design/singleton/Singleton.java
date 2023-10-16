package com.design.singleton;

public class Singleton {

    public static Singleton myInstance;
    private int count;

    private Singleton(){
        this.count = 0;
        System.out.println("Singleton Object instantiated");
    }

    synchronized public static Singleton getMyInstance(){
        if(myInstance==null) {
            myInstance = new Singleton();
        }
        return myInstance;
    }

    public int getCount() {
        this.count++;
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
