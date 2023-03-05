package Java.IEmployee;

public class TestEmployee {
    public static void main(String[] args){
        IEmployee a = new Employee("A",20);
        System.out.println("Name = "+ a.getName()+", Salary = "+a.calculateSalary()+",000d/nam");
        IEmployee b = new PartTimeEmployee("B",20,8);
        System.out.println("Name = "+ b.getName()+", Salary = "+b.calculateSalary()+",000d");
        IEmployee c = new FullTimeEmployee("C",20);
        System.out.println("Name = "+ c.getName()+", Salary = "+c.calculateSalary()+",000d");
    }
}
