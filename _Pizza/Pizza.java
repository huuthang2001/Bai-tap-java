package Java._Pizza;

import java.util.function.DoubleToIntFunction;

public class Pizza {
    double price;
    IShape _shape;
    double Pizza (double p, IShape s){
        this.price = p;
        _shape = s;
    }
    public double getPrice(){
        return price;
    }
    public IShape get_shape(){
        return _shape;
    }
    public String toString(){
        return "Pizza(price = " +price+", size = " + get_shape() +")";
    }
}
