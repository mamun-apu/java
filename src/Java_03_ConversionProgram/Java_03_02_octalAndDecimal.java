package Java_03_ConversionProgram;

public class Java_03_02_octalAndDecimal {
    public static void main(String[] args){
        String octalNum = "3223";
//        int num = Integer.parseInt(octalNum, 8);
//        System.out.println(num);
//        System.out.println(Integer.parseInt("3223", 8) );
        System.out.println(3224);
        System.out.println(octalToDecimal(3224));
        int result = octalToDecimal(3224);
        System.out.println(decimalToOctal(result));
        System.out.println(((Object) octalNum).getClass().getSimpleName());
        System.out.println(((Object) result).getClass().getSimpleName());

    }
    public static int octalToDecimal(int octal){
        int result = 0;
        int i = 0;
        while(octal > 0){
            result += (octal%10) * (int)Math.pow(8, i++);
            octal = octal / 10;
        }
        return result;
    }
    public static StringBuilder decimalToOctal(int decimal){
        int result = 0;
        StringBuilder str = new StringBuilder();
        while(decimal > 0){
            str.append(decimal%8);
            decimal/=8;
        }
        return str.reverse();
    }
}
