package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_02_multiplyToFloatingPointNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter floating point number 1: ");
        float a = s.nextFloat();
        System.out.println("enter floating point number2: ");
        float b = s.nextFloat();
        float result = a*b;
        System.out.println(a + " * " + b + " = " + result);

    }
}
