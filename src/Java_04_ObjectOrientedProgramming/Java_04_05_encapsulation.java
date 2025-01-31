package Java_04_ObjectOrientedProgramming;

public class Java_04_05_encapsulation {
    public static void main(String[] args)
    {
        Area rect = new Area(2, 16);
        rect.getArea();
    }
}
class Area {
    private int l; // this value stores length
    private int b; // this value stores breadth

    // constructor to initialize values
    Area(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    // method to calculate area
    public void getArea()
    {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public void deposit(double amount){
        if (!(amount > 0)){
            return;
        }
        this.balance += amount;
        System.out.println("amount deposited successfully!");
    }
    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("amount exceeding limit!");
            return;
        }
        this.balance = this.balance - amount;
    }

    BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
