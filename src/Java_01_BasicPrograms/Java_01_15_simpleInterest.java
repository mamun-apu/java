package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_15_simpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter P: ");
        int p = sc.nextInt();
        System.out.print("enter T: ");
        int t = sc.nextInt();
        System.out.print("enter R: ");
        int r = sc.nextInt();
        double result = (double)(p*t*r)/100;
        System.out.println(result);
    }
}
