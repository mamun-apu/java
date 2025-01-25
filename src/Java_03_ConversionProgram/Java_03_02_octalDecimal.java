package Java_03_ConversionProgram;

public class Java_03_02_octalDecimal {
    public static void main(String[] args){
        String onum = "3223";
        int num = Integer.parseInt(onum, 8);
        System.out.println(num);
        System.out.println(Integer.parseInt("3223", 8) );
        System.out.println(octalToDecimal(3224));
    }
    public static int octalToDecimal(int octal){
        int result = 0;
        int i = 0;
        int p = 1;
        while (octal > 0){
            int digit = octal%10;
            result += digit*p;
            p = p*8;
            octal/=10;
        }
        return result;
    }
}
