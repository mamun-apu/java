package Java_04_ObjectOrientedProgramming;

public class Java_04_18_SOLIDPrinciple6 {
    public static void main(String[] args) {
        Restaurant vegRestaurant = new Restaurant(new VegBurgerFactory());
        vegRestaurant.takeOrder();

        Restaurant chickenRestaurant = new Restaurant(new ChickenBurgerFactory());
        chickenRestaurant.takeOrder();
    }
}
interface Burger {
    void makeType();
}
//Step 2: Implement Specific Burger Types
class VegBurger implements Burger {
    @Override
    public void makeType() {
        System.out.println("Vegetable burger ready!");
    }
}

class ChickenBurger implements Burger {
    @Override
    public void makeType() {
        System.out.println("Chicken burger ready!");
    }
}
//Step 3: Create a Factory Interface
interface BurgerFactory {
    Burger prepareBurger();
}
//Step 4: Implement Concrete Factories
class VegBurgerFactory implements BurgerFactory {
    @Override
    public Burger prepareBurger() {
        System.out.println("Making veg burger!");
        return new VegBurger();
    }
}

class ChickenBurgerFactory implements BurgerFactory {
    @Override
    public Burger prepareBurger() {
        System.out.println("Making chicken burger!");
        return new ChickenBurger();
    }
}
//Step 5: Implement Restaurant Class Using Factory
class Restaurant {
    private BurgerFactory burgerFactory;

    Restaurant(BurgerFactory factory) {
        this.burgerFactory = factory;
    }

    void takeOrder() {
        Burger burger = burgerFactory.prepareBurger();
        burger.makeType();
    }
}

