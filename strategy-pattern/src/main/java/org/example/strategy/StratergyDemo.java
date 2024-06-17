package org.example.strategy;

public class StratergyDemo {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());
        Duck modelDuck = new ModelDuck(new FlyNoWay(), new Squeak());

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println(" ---------------- ");

        modelDuck.display();;
        modelDuck.performQuack();
        modelDuck.performFly();

    }
}
