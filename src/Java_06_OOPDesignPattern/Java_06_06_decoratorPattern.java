package Java_06_OOPDesignPattern;

public class Java_06_06_decoratorPattern {// Step 5: Test the Decorator Pattern
    public static void main(String[] args) {
        // Start with a simple coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.cost());

        // Add milk
        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.cost());

        // Add sugar
        myCoffee = new Sugar(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.cost());

        // Add an extra shot
        myCoffee = new ExtraShot(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.cost());
    }
}
// Step 1: Define the Coffee interface
interface Coffee {
    String getDescription();
    double cost();
}

// Step 2: Create the base Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

// Step 3: Create an Abstract Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}

// Step 4: Implement Concrete Decorators

// Add Milk
class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}

// Add Sugar
class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2;
    }
}

// Add Extra Shot
class ExtraShot extends CoffeeDecorator {
    public ExtraShot(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Extra Shot";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }
}


