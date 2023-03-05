package Java._Pizza;

public class Rectangle implements IShape {
    double width;
    double height;
    public Rectangle (double width,double height){
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea(){
        return width*height;
    }
    public String toString(){
        return "("getArea()+" cm^2)";
    }
}
