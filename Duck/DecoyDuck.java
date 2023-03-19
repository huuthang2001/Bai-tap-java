package org.example;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior((new CanotFly()));
        setQuackBehavior(new CannotQuack());
    }
    @Override
    public void display(){
        System.out.println("Decoy Duck");
    }
}
