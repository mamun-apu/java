package Java_01_BasicPrograms;
import java.util.Scanner;

public class Java_01_07_findLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();

        int s = Math.min(num1, num2);
        int lcm = s;
        int i = 2;
        while (lcm % num1 != 0 || lcm % num2 != 0) {
            lcm = s * i;
            i++;
        }
        System.out.println("LCM: " + lcm);
    }
}
