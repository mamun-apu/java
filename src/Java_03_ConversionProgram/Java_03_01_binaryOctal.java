package Java_03_ConversionProgram;
import java.util.Scanner;

public class Java_03_01_binaryOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        long binary = sc.nextLong();

        int decimal = 0, i = 0;
        while (binary > 0) {
            decimal += (int) (Math.pow(2, i++) * (binary % 10));
            binary = binary / 10;
        }
        System.out.println("decimal: " + decimal);

        String octal = Integer.toOctalString(decimal);
        int octalNumber = Integer.parseInt(octal);
        System.out.println("Octal: " + octalNumber);

    }
}
