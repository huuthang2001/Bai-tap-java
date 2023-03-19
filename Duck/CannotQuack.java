package org.example;

public class CannotQuack implements Quackable{
    @Override
    public void quack(){
        System.out.println("no quack");
    }

}
