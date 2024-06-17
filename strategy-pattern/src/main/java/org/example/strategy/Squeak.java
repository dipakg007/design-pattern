package org.example.strategy;

public class Squeak implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
