package Java._Pizza;

public class PizzaDeal {
    public double deal(Pizza p){
        return p.getPrice()/p.get_shape().getArea();
    }
    public boolean betterDeal(Pizza p1, pizza p2){
        return deal(p1)<deal(p2);
    }
}
