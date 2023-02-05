package Java;

import javax.swing.plaf.TreeUI;

public class Xemay {
    String hang;
    String model;
    Float gia;
    Boolean dangChay;
    public Xemay(String hang, String model, float gia, boolean dangChay){
        this.hang = hang;
        this.model = model;
        this.gia = gia;
        this.dangChay = false;
    }
    public void dangChay(){
        if (this.dangChay){
            this.dangChay = false;
            System.out.println("Tat may");
        }else{
            this.dangChay = true;
            System.out.println("Dang chay");
        }
    }
    public static void main (String[]args){
        Xemay xemay1 = new Xemay(hang: "honda",model: "CX", 15000 );
        xemay1.dangChay();
        System.out.println(xemay1);
    }
}
