package Java.Person;

public class Student extends Person {
    double gpa;
    public Student(String name,int age,String address,double gpa){
        super(name,age,address);
        this.gpa = gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void display(){
        System.out.println("Ho va ten: " +name);
        System.out.println("Tuoi: "+age);
        System.out.println("Dia chi: " +address);
        System.out.println("Gpa: " +gpa);
    }
}
