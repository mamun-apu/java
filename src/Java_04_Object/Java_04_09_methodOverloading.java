package Java_04_Object;


//if the parameters do not match
public class Java_04_09_methodOverloading {
    public static void main(String[] args) {
        byte a = 25;
        Demo obj = new Demo();

        // it will go to
        // byte argument
        obj.show(a);

        // String
        obj.show("hello");

        // Int
        obj.show(250);

        // Since char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.
        obj.show('A');

        // String
        obj.show("A");

        // since float datatype
        // is not available and so it's higher
        // datatype, so at this step their
        // will be an error.
//        obj.show(7.5);
    }
}

class Demo{
    public void show(int x){
        System.out.println("In int " + x);
    }
    public void show(String s){
        System.out.println("In string " + s);
    }
    public void show(byte b){
        System.out.println("In byte " + b);
    }

}
