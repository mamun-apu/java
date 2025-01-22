package Java_02_PatternPrograms;

import java.util.Scanner;

public class Java_02_03_printPyramidNumberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n-i-1; j >= 0; j--){
                System.out.print("  ");
            }
            for(int j = i+1; j <= i*2+1; j++){
                System.out.print(" " + j );
            }
            for(int j = i*2; j>i; j--){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
