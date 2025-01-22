package Java_02_PatternPrograms;
import java.util.Scanner;

public class Java_02_02_leftTriangleStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
