package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_10_checkArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter low: ");
        int low = sc.nextInt();
        System.out.print("enter high: ");
        int high = sc.nextInt();
        System.out.println("down limit: " + low);
        System.out.println("up limit: " + high);
        for(int i = low; i <= high; i++){
            int num = i;
            int digit = 0;
            while(num != 0){
                num /= 10;
                digit++;
            }
            num = i;
            int x, y, sum = 0;
            for(int j = 0; j < digit; j++){
                x = num % 10;
                num = num / 10;
                double p = Math.pow(x, digit);
                sum += (int) p;
            }
           if(sum == i){
               System.out.println("Armstrong number between " + low + " and " + high + " is: " + sum);
           }
        }


    }
}
