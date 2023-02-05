package Java;

public class Quat {
    String hang;
    String model;
    Float gia;
    Integer congSuat;
    Integer soHienTai;
    Boolean dangQuay;
    public Quat(String hang, String model, Float gia, Integer congSuat , Integer soHienTai, Boolean dangQuay){
        this.hang = hang;
        this.model = model;
        this.gia = gia;
        this.congSuat = congSuat;
        this.soHienTai = 0;
        this.dangQuay = false;
    }
    public void bat(){
        this.soHienTai = 1;
        System.out.println("Thuc hien chuc nang bat");
    }
    public void tat () {
        this.soHienTai = 0;
        System.out.println("Tat quat");
    }
    public void chuyenSo(int so){
        this.soHienTai = so ;
        System.out.println("Chuyen toi so: " +so);
    }
    public void chuyenQuay(){
        if  (this.dangQuay){
            this.dangQuay = false;
        System.out.println("Chuyen qua trang thai dung yen");
    }else{
        this.dangQuay = true;
        System.out.println("Chuyen qua trang thai quay");
        }
        
    }
}
public public static void main(String[]args) {
    Quat quat1 = newQuat(hang:"SamSung", model: "SLQ-23", gia: 1999,songSuat:60);
    quat1.bat();
    quat1.chuyenSo(3);
    quat1.chuyenQuay();
    System.out.println(quat1);
    
}