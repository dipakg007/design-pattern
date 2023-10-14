package com.design.singleton;

public class Singleton {

    public static Singleton myInstance;
    private String myVariable;

    private Singleton(){}

    public static Singleton getMyInstance(){
        if(myInstance==null) myInstance = new Singleton();
        return myInstance;
    }

    public String getMyVariable() {
        return myVariable;
    }

    public void setMyVariable(String myVariable) {
        this.myVariable = myVariable;
    }
}
