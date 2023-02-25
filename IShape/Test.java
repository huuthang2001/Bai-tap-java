package Java.Shape;

public class Test {
    public static void main(String[]args){
        IShape a = new Circle(20);
        IShape b = new Rectangle(20, 15);
        IShape c = new Circle(30);
        IShape[] list = {a, b, c};
        for(IShape shape: list){
            System.out.println("Dien tich:" + shape.getArea());
            System.out.println("Chu vi:" + shape.getPerimeter());
        }
    }
}
