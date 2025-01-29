package Java_04_Object;


public class Java_04_02_abstractClass {

    public static void main(String[] args){
        Areas a = new Areas(10, 20);
        a.draw();
    }

}


/*

1. An instance of an abstract class can not be created.
2. Constructors are allowed.
3. We can have an abstract class without any abstract method.
4. There can be a final method in abstract class but any abstract method in
    class(abstract class) can not be declared as final  or in simpler terms
    final method can not be abstract itself as it will yield an error:
    “Illegal combination of modifiers: abstract and final”
5. We can define static methods in an abstract class
6. We can use the abstract keyword for declaring top-level classes
    (Outer class) as well as inner classes as abstract
7. If a class contains at least one abstract method then compulsory
    should declare a class as abstract
8. If the Child class is unable to provide implementation to all abstract
    methods of the Parent class then we should declare that Child class as
    abstract so that the next level Child class should provide implementation
    to the remaining abstract method

    #Java Abstract class is used to provide common method implementation
     to all the subclasses or to provide default implementation.

     if we know we obviously need one or more method, but we are unaware of
     the definition in that case we need abstract method

* */
abstract class Shape{
    int color;
    abstract void draw();
}
abstract class Size{
    int color;

    void calculate() {

    }
    public Size(int color){
        this.color = color;
    }
    static void nothing(){
        System.out.println("hello world");
    }
}

class Areas extends Shape{
    int width;
    int height;
    Areas(int width, int height){
        this.width = width;
        this.height = height;
    }
    void draw(){
        System.out.println("width is: " + width +" and height is: " + height);
    }
}
