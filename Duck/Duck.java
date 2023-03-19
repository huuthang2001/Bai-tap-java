package org.example;

import java.awt.*;

public class Duck implements Ducklike {
    Flyable flyBehavior;
    Quackable quackBehavior;
    public void Duck(){};
    public void display(){}{

    }

    @Override
    public void fly() {

    }

    @Override
    public void  quack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(Flyable FlyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(Quackable quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("Tat ca deu noi");
    }

    public void dispaly(){
        fly();
        quack();
    }

}
