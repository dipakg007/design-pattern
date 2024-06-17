package org.example.strategy;

public class MallardDuck extends Duck {

    MallardDuck() {
    }

    MallardDuck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
