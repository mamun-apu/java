package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_16_compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter P: ");
        double p = sc.nextDouble();

        System.out.print("enter T: ");
        double t = sc.nextDouble();

        System.out.print("enter R: ");
        double r = sc.nextDouble();

        double interest = p * Math.pow((1 + r/100), t);
        System.out.println("interests are: " + interest);
    }
}
