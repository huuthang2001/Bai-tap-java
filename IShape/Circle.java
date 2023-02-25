package Java.Shape;

public class Circle implements IShape{
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius*radius;
    }
    @Override
    public double getPerimeter(){
        return radius*radius*3.14;
    }
}
