package Java.Person;

public class Teacher extends Person {
    int salary;
    public Teacher(String name,int age,String address,int salary){
        super(name,age,address);
        this.salary = salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Ho va ten: " +name);
        System.out.println("Tuoi: "+age);
        System.out.println("Dia chi: " +address);
        System.out.println("Salary: "+salary);
    }
}
