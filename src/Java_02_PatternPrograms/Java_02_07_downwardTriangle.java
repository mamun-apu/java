package Java_02_PatternPrograms;
import java.util.Scanner;

public class Java_02_07_downwardTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
