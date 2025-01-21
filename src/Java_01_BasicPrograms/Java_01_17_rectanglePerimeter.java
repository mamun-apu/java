package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_17_rectanglePerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter length L: ");
        double l = sc.nextDouble();

        System.out.print("enter width W: ");
        double w = sc.nextDouble();

        double rectangle = 2*(l+w);
        System.out.println("the rectangle is: " + rectangle);
    }
}
