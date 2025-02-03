package Java_04_ObjectOrientedProgramming;

public class Java_04_14_SOLIDPrinciple {
    public static void main(String[] args) {

        PaymentProcess p = new PaymentProcess(100, new DiscountRegular("regular"));
        System.out.println(p.getNetPay());

        PaymentProcess p2 = new PaymentProcess(120, new DiscountVIP("VIP"));
        System.out.println(p2.getNetPay());
    }

}

// ************************####################*********************
/*
SOLID->
    Single Responsibility Principle (SRP)
    Open/Closed Principle (OCP)
    Liskov's Substitution Principle (LSP)
    Interface Segregation Principle (ISP)
    Dependency Inversion Principle (DIP)
 */
/*
    Single Responsibility Principle
    A class can only be changed by one reason. Meaning a class
    will encapsulate only one responsibility. It doesn't mean that
    class will always only have one function, but they will serve only
    purpose.
    For example:

 */

class User{
    public int takeInput(){
        //doing some work related to system.in
        return 0;
    }
    public void saveToDatabase(){
        //doing some work related to database
    }
}
/*
    In the above example the class can be broken by
    two ways. One is any change or bug while taking input
    and another one is database related change

    That violates SRP. SRP says make two class out of it. so that
    one feature can't be a reason of failure for another feature.
 */
class TakeInput{
    int takeInputFromUser(){
        return 0;
    }
}
class DatabaseConnection{
    void storeInDatabase(){

    }
}
// According to SRP this solution is okay

// ************************####################*********************

/*
 Open/Closed Principle: Software entities should be open for extension
 closed for modification. For example if any class needed to add more
 feature with should be possible without editing the existing class.

 check this example:
 */

class PaymentProcess{
    private double price;
    private double discount;
    private double NetPay;
    PaymentProcess(double price,Discount d){
        this.price = price;
        this.discount = d.calculateDiscount();
        this.NetPay = price * d.calculateDiscount();
    }
    private double getPrice(){
        return price;
    }
    public double getNetPay(){
        return getPrice()-NetPay;
    }
}

class Discount{
    private String category;
    private double percentage;
    Discount(String category, double percentage){
        this.category = category;
        this.percentage = percentage;
    }
    public double calculateDiscount(){
        return percentage;
    }
}
class DiscountRegular extends Discount{
    private String category;
    private double percentage;
    DiscountRegular(String category){
        super(category, 0.3);
    }

}
class DiscountVIP extends Discount{
    private String category;
    private double percentage;
    DiscountVIP(String category){
        super(category, 0.7);
    }
}




