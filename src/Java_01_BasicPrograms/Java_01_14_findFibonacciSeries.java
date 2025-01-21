package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_14_findFibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int N = sc.nextInt();

        int[] arr = new int[2*N+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= N*2; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int x: arr){
            System.out.print(x + ", ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i <= N*2; i+=2){
            sum+=arr[i];
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
