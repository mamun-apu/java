package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_13_factorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int fact = 1;
        int num2 = num;
        while(num > 0){
            fact = fact * num--;
        }
        System.out.println("factorial is: " + fact);
        int score = findFacto(num2);
        System.out.println("factorial is: " + score);

    }
    public static int findFacto(int n){
        if(n == 0){
            return 1;
        }
        return n * findFacto(n-1);
    }
}
