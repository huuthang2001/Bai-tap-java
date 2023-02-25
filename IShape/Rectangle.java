package Java.Shape;

public class Rectangle implements IShape{
    public double length;
    public double width;
    public Rectangle (double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return length*2+width*2;
    }

}
