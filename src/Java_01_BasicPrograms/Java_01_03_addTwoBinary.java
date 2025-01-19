package Java_01_BasicPrograms;
import java.util.Scanner;

public class Java_01_03_addTwoBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("enter string 2: ");
        String s2 = sc.nextLine();

        System.out.println("input 1: " + s1);
        System.out.println("input 2: " + s2);

        int i = s1.length() - 1;
        int j = s2.length() - 1;

        int rem = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0){
            int sum = rem;

            if(i >= 0){
                sum += s1.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += s2.charAt(j) - '0';
                j--;
            }
            if(sum == 0 || sum == 1){
                result.append(sum);
                rem = 0;
            }
            else if(sum == 2){
                result.append('0');
                rem = 1;
            }else{
                result.append('1');
                rem = 1;
            }

        }
        if(rem == 1){
            result.append("1");
        }
        System.out.print("The result is: ");
        System.out.println(result.reverse().toString());
    }

}
