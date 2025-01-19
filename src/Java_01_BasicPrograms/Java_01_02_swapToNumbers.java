package Java_01_BasicPrograms;

public class Java_01_02_swapToNumbers {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        System.out.println(x + " : " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " : " + y);
    }
}
