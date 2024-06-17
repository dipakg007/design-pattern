package org.example.strategy;

public class MuteQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Can't Quack");
    }
}
