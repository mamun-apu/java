package Java_02_PatternPrograms;
import java.util.Scanner;

public class Java_02_05_upperStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
