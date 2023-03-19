package org.example;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new CanotFly();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(Flyable flyBehavior, Quackable quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display(){
        System.out.println("Rubber Duck");
    }
}
