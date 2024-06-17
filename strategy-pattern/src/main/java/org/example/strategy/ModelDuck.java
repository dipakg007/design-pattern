package org.example.strategy;

public class ModelDuck extends Duck{

    ModelDuck() {
    }

    ModelDuck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
