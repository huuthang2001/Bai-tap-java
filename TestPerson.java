package Java.Person;

public class TestPerson {
    public static void main (String[]args){
        Person s1 = new Student("Thang", 18, "Quang Binh", 6.0);
        Person t1 = new Teacher("Nhan", 30, "Quang Binh", 15000000);
        Person[] list = {s1, t1};
        for (Person p: list){
            p.display();
            System.out.println();
        }
    }
}
