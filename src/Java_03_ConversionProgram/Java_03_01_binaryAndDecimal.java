package Java_03_ConversionProgram;
import java.util.Scanner;

public class Java_03_01_binaryAndDecimal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter binary: ");
       long binary = sc.nextLong();
       int decimal = 0;
       int pow = 1;
       int i = 0;
       while(binary > 0){

//           decimal = Math.pow(2, i++) * binary%10;
           decimal += (int)(binary%10)*pow;
           pow = pow*2;
           binary /= 10;

       }
        System.out.println("decimal: "+decimal);
        StringBuilder str = new StringBuilder();
       while(decimal > 0){
           str.append(decimal % 2);
           decimal = decimal / 2;
       }
        System.out.println(str.reverse());
    }
}
