package Java_01_BasicPrograms;
import java.util.Scanner;

public class Java_01_09_checkLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0){
            isLeap = true;
            if(year % 100 == 0){
                isLeap = year % 400 == 0;
            }
        }
        if(isLeap){
            System.out.println(year + " is a leap year!");
        }else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
