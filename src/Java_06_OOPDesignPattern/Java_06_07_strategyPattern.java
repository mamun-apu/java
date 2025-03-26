package Java_06_OOPDesignPattern;

public class Java_06_07_strategyPattern {
    public static void main(String[] args) {
        // Create a door and assign behaviors
        Door door = new ClosetDoor();
        door.setOpenBehavior(new Standard());    // Standard open behavior
        door.setLockBehavior(new NonLocking());  // Initially, it cannot lock

        door.performOpen();
        door.performClose();

        door.performLock();
        door.performUnlock();

        // Upgrade the door to use password-based locking
        door.setLockBehavior(new Password());
        door.performLock();
        door.performUnlock();
    }
}

// Lockable behavior interface
interface Lockable {
    void lock();
    void unlock();
}

// Non-lockable door behavior
class NonLocking implements Lockable {
    @Override
    public void lock() {
        System.out.println("This door does not support locking.");
    }

    @Override
    public void unlock() {
        System.out.println("Cannot unlock as this door doesn't lock.");
    }
}

// Password-based locking
class Password implements Lockable {
    @Override
    public void lock() {
        System.out.println("Door locked using a password!");
    }

    @Override
    public void unlock() {
        System.out.println("Door unlocked using a password!");
    }
}

// KeyCard-based locking (behavior placeholder)
class KeyCard implements Lockable {
    @Override
    public void lock() {
        System.out.println("Door locked using a keycard!");
    }

    @Override
    public void unlock() {
        System.out.println("Door unlocked using a keycard!");
    }
}

// Openable behavior interface
interface Openable {
    void open();
    void close();
}

// Standard opening behavior
class Standard implements Openable {
    @Override
    public void open() {
        System.out.println("Pushing the door open.");
    }

    @Override
    public void close() {
        System.out.println("Pulling the door closed.");
    }
}

// Revolving door behavior (placeholder)
class Revolving implements Openable {
    @Override
    public void open() {
        System.out.println("Opening revolving door...");
    }

    @Override
    public void close() {
        System.out.println("Closing revolving door...");
    }
}

// Sliding door behavior (placeholder)
class Sliding implements Openable {
    @Override
    public void open() {
        System.out.println("Sliding door open.");
    }

    @Override
    public void close() {
        System.out.println("Sliding door closed.");
    }
}

// Abstract Door class that allows setting lock and open behaviors dynamically
abstract class Door {
    private Lockable lockBehavior;
    private Openable openBehavior;

    public void setLockBehavior(Lockable lockBehavior) {
        this.lockBehavior = lockBehavior;
    }

    public void setOpenBehavior(Openable openBehavior) {
        this.openBehavior = openBehavior;
    }

    public void performLock() {
        lockBehavior.lock();
    }

    public void performUnlock() {
        lockBehavior.unlock();
    }

    public void performOpen() {
        openBehavior.open();
    }

    public void performClose() {
        openBehavior.close();
    }

    public float getDimensions() {
        return 5;  // Placeholder for door dimensions
    }
}

// Concrete door types
class ClosetDoor extends Door { }
class ExternalDoor extends Door { }
class SafeDepositDoor extends Door { }
class SlidingDoor extends Door { }
