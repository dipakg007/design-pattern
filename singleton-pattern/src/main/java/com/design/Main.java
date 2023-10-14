package com.design;

import com.design.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // Create a instance of a singleton class using getMyInstance
        Singleton myInstance = Singleton.getMyInstance();
        // printing the memory where myInstance is occupied
        System.out.println(myInstance);

        // Other variables
        myInstance.setMyVariable("Dipak");
        System.out.println(myInstance.getMyVariable());

        Singleton otherInstance = Singleton.getMyInstance();
        // printing the memory where otherInstance is occupied it will show the same result w.r.t myInstance object
        System.out.println(otherInstance);
    }
}