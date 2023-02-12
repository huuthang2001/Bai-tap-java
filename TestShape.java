public class TestSape {
    public static void main(String[]args){
        Shape r1 = new Rec(20,30);
        Shape c1 = new Circle(30);
        Shape r2 = new Rec(15,25);
        Shape c2 = new Circle(250);
        Shape[] list  = {r1, c1 ,r2 ,c2};
        for (Shape s:list) {
            System.out.println("Dien tich la : " + s.getArea());
        }
    }
}
