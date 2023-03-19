package org.example;

public class TuckeyAdaptor implements Ducklike, Tuckeylike {
    public Tuckeylike tuckeylike;
    public void TurkeyAdaptor(Tuckeylike tk){
        this.tuckeylike = (TuckeyAdaptor) tk;
    }

    @Override
    public void quack(){
        tuckeylike.gobble();
    }

    @Override
    public void gobble() {

    }

    @Override
    public void fly(){
        tuckeylike.fly();
    }
}
