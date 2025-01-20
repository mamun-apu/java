package Java_01_BasicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Java_01_08_displayAllPrimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        System.out.println("Entered limit: " + n);

        showPrime(n);

    }

    public static void showPrime(int n){
        Boolean[] pArray = new Boolean[n];
        for(int i = 0; i < n; i++){
            pArray[i] = true;
        }

        for(int i = 2; i*i < n; i++){
            if(pArray[i]){
                for(int j = i*i; j < n; j+=i){
                    pArray[j] = false;
                }
            }
        }
        System.out.println("All prime numbers until limit..");
        for(int i = 2; i < n; i++){
            if(pArray[i]){
                System.out.print(i + ", ");
            }
        }
    }
}
