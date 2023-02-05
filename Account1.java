import java.util.Scanner;
import java.time.chrono.ThaiBuddhistChronology;
public class zzz {
    public static void main(String[] args) {
        
class Account {
    int id;
    String name;
    int balance;
    double Account;
    public Account(int id, String name, int balance){
    this.id = id;
    this.name = name;
    this.balance = 0;
    }
    public int getId(){
        return this.id;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public void deposit (double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
    public void withdraw(double d) {
    }
}
    class main {
    public static void Account(String[] args) {
        Account account = new Account(123, "thang", 0);
        account.display();
        account.deposit(1000.0);
        account.display();
        account.withdraw(500.0);
        account.display();
    }
}
}
}
