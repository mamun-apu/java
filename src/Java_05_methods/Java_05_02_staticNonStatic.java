package Java_05_methods;

/*
    A static method is a method that belongs to a class, but it does not
    belong to an instance of that class and this method can be called
    without the instance or object of that class. Every method in java
    defaults to a non-static method without static keyword proceeding it.
    Non-static methods can access any static method and static variable,
    without creating an instance of the object

*/

public class Java_05_02_staticNonStatic {
    public static int sum(int a, int b)
    {
        // Simply returning the sum
        return a + b;
    }
}
class Helper {

    // Static method

    public static void main(String[] args)
    {
        // Custom values for integer
        // to be summed up
        int n = 3, m = 6;

        // Calling the static method of above class
        // and storing sum in integer variable
        int s = Java_05_02_staticNonStatic.sum(n, m);

        // Print and display the sum
        System.out.print("sum is = " + s);
        System.out.println("hello");
    }
}
