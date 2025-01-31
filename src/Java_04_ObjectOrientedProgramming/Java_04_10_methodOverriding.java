package Java_04_ObjectOrientedProgramming;

public class Java_04_10_methodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
        d.eat();
        d.bark();
    }
}
/*
    Overriding in Java occurs when a subclass implements a
    method which is already defined in the superclass or
    Base Class. The method in the subclass must have the
    same signature as in the superclass. It allows the subclass
    to modify the inherited methods.
 */

class Animal{
    void move(){
        System.out.println("Animal is moving");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    @Override
    void move(){
        System.out.println("Dog is running");
    }
    void bark(){
        System.out.println("Dog is barking.");
    }

}
