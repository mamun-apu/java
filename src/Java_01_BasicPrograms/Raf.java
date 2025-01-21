package Java_01_BasicPrograms;

public class Raf {
    public static void main(String[] args) {
        int num = 154;
        int digit = 3;
        int x, y, sum = 0;
        for(int j = 0; j < digit; j++){
            x = num % 10;
            num = num / 10;
            double p = Math.pow(x, digit);
            sum += (int) p;
        }
        System.out.println(sum);
    }
}
