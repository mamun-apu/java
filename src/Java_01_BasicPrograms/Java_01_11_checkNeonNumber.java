package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_11_checkNeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();
        int square = (int)Math.pow(number, 2);
        int sum = 0;
        while(square != 0){
            int d = square % 10;
            square = square / 10;
            sum += d;
        }
        if(sum == number){
            System.out.println("The given number " + number + " is a neon number");
        }else {
            System.out.println("The given number " + number + " is not a neon number");
        }
    }
}
