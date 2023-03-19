package org.example;

public class DuckTestDrive {
    public static void main(String[]args){
        Duck mallard = new MallardDuck();
        Duck redHead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();
        Duck[] list = {mallard,rubber,redHead,decoy};
        for(Duck i:list){
            System.out.println();
            i.display();
            i.quack();
            i.swim();
            i.fly();
        }
    }
}
