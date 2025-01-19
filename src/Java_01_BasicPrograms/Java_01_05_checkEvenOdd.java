package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_05_checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is a even number!");
        }else{
            System.out.println(num + " is a odd number!");
        }


    }
}
