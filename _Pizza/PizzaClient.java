package Java._Pizza;

public class PizzaClient {
    public void run(){
        Pizza a1 = new Pizza(12, new Circle(4));
        Pizza a2 = new Pizza(16, new Rectangle(4, 7));
        PizzaDeal deal = new PizzaDeal();

        System.out.println(a1 + "lua chon tot hon" + a2 + ":"+ deal.betterDeal(a1, a2));
    }
    public static void main(String[]args){
        new PizzaClient().run();
    }
}
