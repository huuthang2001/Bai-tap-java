package Java.Person;

public class Person {
    String name;
    int age;
    String address;
    public Person (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public void display(){
        System.out.println("Ho va ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
    }
}
