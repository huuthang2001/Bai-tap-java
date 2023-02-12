public class Rec extends Shape{
    double chieudai;
    double chieurong;
    public Rec(double chieudai,double chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public double getArea(){
        return chieudai*chieurong;
    }
}