package Java_04_ObjectOrientedProgramming;

public class Java_04_04_interface {
    public static void main(String[] args) {
        Phone p = new Phone();
        Radio r = new Radio();
    }
}
    /*
    interface is a true beauty of OOP. let's understand why and how. What is interface?
    an interface is a reference type that that defines a contract objects
    method ideas(method name) -> method signature and public static final properties.

    for example:
    let's say,charging. we have some objects such as phone, laptop, smartWatch
    which need charging capacity but those devices: phone, laptop, smartWatch
    are not related to each other. now if we want to implement charging capability
    on those devices we will have to write all the properties and methods one bye one
    on every device. which is okay but the problem is if you forget any of properties
    or methods to implement at that time there will be problem. So what we can do is
    we can create separate construct(interface) and implement(define all methods)
    of that interface to all the classes that need that capability. Now there can be
    multiple features for example display weather. we can create and DisplayWeather
    interface and implement to all classes that need.

 In Java, an **interface** is a contract defining method signatures (what to do)
 without implementation (how to do it). Unlike abstract classes, interfaces enable
 **polymorphism** and **multiple inheritance**, allowing unrelated classes
 (e.g., `Phone`, `Drone`, `PowerBank`) to share behaviors (e.g., `charge()`).
 Java’s **single inheritance rule** restricts classes to one parent, making
 interfaces indispensable for adding capabilities to unrelated classes.
 For instance, a `Chargable` interface ensures all devices implement
 `charge()`, avoiding redundant code while maintaining flexibility.
 Interfaces also evolve gracefully: **`default` methods** (Java 8+)
 let you add new features (e.g., `getBatteryLevel()`) without breaking
 existing implementations. While abstract classes share code/state in a
 hierarchy, interfaces focus on **defining capabilities** across diverse
 objects, making them vital for decoupled, scalable design. Together,
 interfaces and abstract classes balance code reuse (via inheritance) and
 flexible contracts (via interfaces), empowering robust, maintainable OOP.

     */


interface chargingCapacity{
    final int chargingPort = 1;
    final int TRANSMETER = 1;
    int calculateCharge();
    void showCharge();
    default boolean isCharging(){
        return true;
    }
}

interface displayWeather{
    void show();
}

class Phone implements chargingCapacity, displayWeather{

    @Override
    public int calculateCharge() {
        return 0;
    }

    @Override
    public void showCharge() {

    }

    @Override
    public void show() {

    }
}

class Radio implements chargingCapacity, displayWeather {

    @Override
    public int calculateCharge() {
        return 0;
    }

    @Override
    public void showCharge() {

    }

    @Override
    public void show() {

    }
}

