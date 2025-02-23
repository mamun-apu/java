public class CarCompany{
    MuscleCarFactory muscleCarFactory = new MuscleCarFactory();
    Car muscleCar = muscleCarFactory.createCar();

    FamilyCarFactory familyCarFactory = new FamilyCarFactory();
    Car familyCar = familyCarFactory.createCar();
}

abstract class CarFactory{
    public abstract Car createCar();
}

class MuscleCarFactory extends CarFactory{
    @Override
    public Car createCar(){
        return new MuscleCar();
    }
}

class FamilyCarFactory extends CarFactory{
    @Override
    public Car createCar(){
        return new FamilyCar();
    }
}

interface Car{
// common Car fields and methods
}

class FamilyCar implements Car{
    //code...
}
class MuscleCar implements Car{
    //code...
}