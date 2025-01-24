package Java_02_PatternPrograms;
import java.util.Scanner;

public class Java_02_06_mirrorUpperStarTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n*2; i++){

            if(i < n){
                for(int j = n-i; j > 1; j--){
                    System.out.print(" ");
                }

                for(int j = 0; j < i+1; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }


            //14-8 = 6
            // i = 7
//            8-7 = 1

            if(i >= n){
                for(int j = 0; j < i-n; j++){
                    System.out.print(" ");
                }
                for(int j = 0; j < 2*n-i; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
