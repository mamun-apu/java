package Java_04_Object;

public class Java_04_05_encapsulation {
    public static void main(String[] args)
    {
        Area rect = new Area(2, 16);
        rect.getArea();
    }
}
class Area {
    private int l; // this value stores length
    private int b; // this value stores breadth

    // constructor to initialize values
    Area(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    // method to calculate area
    public void getArea()
    {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}
