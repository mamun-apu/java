package Java_04_ObjectOrientedProgramming;

public class Java_04_16_SOLIDPrinciple4 {
}
/*
    The Interface Segregation Principle (ISP) is one of the SOLID principles of
    object-oriented design. It states that "clients should not be forced to
    depend on interfaces they do not use." In other words, rather than having
    one large, monolithic interface (often called a “fat” interface), you should
    break it down into smaller, more specific interfaces so that implementing
    classes only need to be concerned with the methods that are relevant to them.
 */

interface IWorker {
    void work();
    void eat();
}
class HumanWorker implements IWorker {
    @Override
    public void work() {
        System.out.println("Human working...");
    }

    @Override
    public void eat() {
        System.out.println("Human eating...");
    }
}

class RobotWorker implements IWorker {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        // Robots don't eat. They might throw an exception or do nothing.
        throw new UnsupportedOperationException("Robots do not eat!");
    }
}
