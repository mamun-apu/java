package Java_06_OOPDesignPattern;

public class Java_06_02_builderMethodPattern {
    public static void main(String[] args) {
        Director director = new Director();

        // Construct a Vegan Meal
        VeganMealBuilder veganBuilder = new VeganMealBuilder();
        director.constructVeganMeal(veganBuilder);
        Meal veganMeal = veganBuilder.build();

        System.out.println("Vegan Meal constructed:");
        System.out.println("Starter: " + veganMeal.getStarter());
        System.out.println("Main: " + veganMeal.getMain());
        System.out.println("Dessert: " + veganMeal.getDessert());
        System.out.println("Drink: " + veganMeal.getDrink());
        System.out.println();

        // Construct a Healthy Meal
        HealthyMealBuilder healthyBuilder = new HealthyMealBuilder();
        director.constructHealthyMeal(healthyBuilder);
        Meal healthyMeal = healthyBuilder.build();

        System.out.println("Healthy Meal constructed:");
        System.out.println("Starter: " + healthyMeal.getStarter());
        System.out.println("Main: " + healthyMeal.getMain());
        System.out.println("Dessert: " + healthyMeal.getDessert());
        System.out.println("Drink: " + healthyMeal.getDrink());
    }
}
// Product class representing a meal
class Meal {
    private String starter;
    private String main;
    private String dessert;
    private String drink;

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getStarter() {
        return starter;
    }

    public String getMain() {
        return main;
    }

    public String getDessert() {
        return dessert;
    }

    public String getDrink() {
        return drink;
    }
}

// Builder Interface
interface MealBuilder {
    void buildStarter();
    void buildMain();
    void buildDessert();
    void buildDrink();
    Meal build();
}

// Concrete Builder for a Vegan Meal
class VeganMealBuilder implements MealBuilder {
    private Meal meal;

    public VeganMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Vegan Salad");
    }

    @Override
    public void buildMain() {
        meal.setMain("Grilled Tofu with Quinoa");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Vegan Chocolate Cake");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Fresh Orange Juice");
    }

    @Override
    public Meal build() {
        return meal;
    }
}

// Concrete Builder for a Healthy Meal
class HealthyMealBuilder implements MealBuilder {
    private Meal meal;

    public HealthyMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Greek Yogurt with Honey");
    }

    @Override
    public void buildMain() {
        meal.setMain("Grilled Chicken with Steamed Vegetables");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Fresh Mixed Berries");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Green Smoothie");
    }

    @Override
    public Meal build() {
        return meal;
    }
}

// Director Class to construct meals
class Director {
    public void constructVeganMeal(MealBuilder builder) {
        builder.buildStarter();
        builder.buildMain();
        builder.buildDessert();
        builder.buildDrink();
    }

    public void constructHealthyMeal(MealBuilder builder) {
        builder.buildStarter();
        builder.buildMain();
        builder.buildDessert();
        builder.buildDrink();
    }
}


