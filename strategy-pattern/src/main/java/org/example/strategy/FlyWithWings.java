package org.example.strategy;

public class FlyWithWings implements IFlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
