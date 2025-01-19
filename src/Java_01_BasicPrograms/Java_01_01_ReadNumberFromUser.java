package Java_01_BasicPrograms;
import java.util.Scanner;

public class Java_01_01_ReadNumberFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        System.out.print("you entered: ");
        System.out.println(num);
        float num2 = sc.nextFloat();

    }
}
