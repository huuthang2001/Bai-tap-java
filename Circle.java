public class Circle extends Shape {
    double radius;
    public Circle(double raidius){
        this.radius = raidius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
        }
}