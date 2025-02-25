package Java_06_OOPDesignPattern;

// 1. Product Interfaces
interface Car {
    void drive();
}

// 2. Abstract Factory
interface CarFactory {
    Car createMuscleCar();
    Car createFamilyCar();
}

// 3. Concrete Factories
class USCarFactory implements CarFactory {
    @Override
    public Car createMuscleCar() {
        return new USMuscleCar();
    }

    @Override
    public Car createFamilyCar() {
        return new USFamilyCar();
    }
}

class EuropeCarFactory implements CarFactory {
    @Override
    public Car createMuscleCar() {
        return new EuropeMuscleCar();
    }

    @Override
    public Car createFamilyCar() {
        return new EuropeFamilyCar();
    }
}

// 4. Concrete Products (US)
class USMuscleCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a US Muscle Java_06_OOPDesignPattern.Car");
    }
}

class USFamilyCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a US Family Java_06_OOPDesignPattern.Car");
    }
}

// 5. Concrete Products (Europe)
class EuropeMuscleCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a European Muscle Java_06_OOPDesignPattern.Car");
    }
}

class EuropeFamilyCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a European Family Java_06_OOPDesignPattern.Car");
    }
}

// 6. Client Code
public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory usFactory = new USCarFactory();
        CarFactory europeFactory = new EuropeCarFactory();

        Car usMuscleCar = usFactory.createMuscleCar();
        Car usFamilyCar = usFactory.createFamilyCar();
        Car europeMuscleCar = europeFactory.createMuscleCar();
        Car europeFamilyCar = europeFactory.createFamilyCar();

        usMuscleCar.drive();
        usFamilyCar.drive();
        europeMuscleCar.drive();
        europeFamilyCar.drive();
    }
}
