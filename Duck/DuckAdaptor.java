package org.example;

public class DuckAdaptor implements Tuckeylike{
    public Duck duck;
    @Override
    public void gobble(){

    }
    public void DuckAdaptor(Duck Ducklike){
        this.duck=Ducklike;
    }
    @Override
    public void fly(){
        for (int i=0;i<5;i++){
            duck.fly();
        }
    }
}
