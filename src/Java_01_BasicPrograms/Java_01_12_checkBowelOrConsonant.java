package Java_01_BasicPrograms;

import java.util.Scanner;

public class Java_01_12_checkBowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the letter: ");
        char c = sc.next().trim().charAt(0);
        System.out.println("you entered: " + c);
        if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u'){
            System.out.println("It is a vowel.");
        }else{
            System.out.println("It is a consonant.");
        }
    }
}
