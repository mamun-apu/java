package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_06_largestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x, y, z: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int largest = z > ((x > y) ? x : y) ? z : (x > y) ? x : y;

        System.out.println("entered numbers: " + x +", " + y + ", " + z);
        System.out.println("The largest number: " + largest);
    }
}
