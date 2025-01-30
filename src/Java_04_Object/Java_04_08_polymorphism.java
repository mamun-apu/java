package Java_04_Object;


public class Java_04_08_polymorphism {

    public static void main(String[] args) {
        // 1. Compile-Time Polymorphism (Method Overloading)
        Calculator calculator = new Calculator();
        System.out.println("Compile-Time Polymorphism:");
        System.out.println("Sum (2 + 3): " + calculator.add(2, 3));           // Calls int add(int, int)
        System.out.println("Sum (2 + 3 + 4): " + calculator.add(2, 3, 4));    // Calls int add(int, int, int)
        System.out.println("Sum (2.5 + 3.7): " + calculator.add(2.5, 3.7));   // Calls double add(double, double)
        System.out.println();

        // 2. Runtime Polymorphism (Method Overriding)
        System.out.println("Runtime Polymorphism:");
        Animal myAnimal;

        myAnimal = new Dog();  // Animal reference to Dog object
        myAnimal.sound();      // Calls Dog's sound()

        myAnimal = new Cat();  // Animal reference to Cat object
        myAnimal.sound();      // Calls Cat's sound()
    }

    // Compile-Time Polymorphism Example: Calculator Class
    static class Calculator {
        // Method 1: Add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Method 2: Add three integers (overloaded)
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method 3: Add two doubles (overloaded)
        double add(double a, double b) {
            return a + b;
        }
    }

    // Runtime Polymorphism Example: Animal Hierarchy
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks: Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows: Meow!");
        }
    }
}