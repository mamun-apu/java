package Java_04_ObjectOrientedProgramming;

public class Java_04_15_SOLIDPrinciple3 {
}

interface Bird {
    void eat();
    void sleep();
}

interface Flyable {
    void fly();
}

class Sparrow implements Bird, Flyable {
    @Override
    public void eat() {
        // Sparrow eating behavior
    }

    @Override
    public void sleep() {
        // Sparrow sleeping behavior
    }

    @Override
    public void fly() {
        // Sparrow flying behavior
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        // Penguin eating behavior
    }

    @Override
    public void sleep() {
        // Penguin sleeping behavior
    }
}
