public class Abstraction {
    public static void main(String[] args) {
        Car c=new ElectricCar();
        c.accelerate();
        c.brake();
    }
}

abstract class Car {
    void start() {
        System.out.println("Car started");
    }

    abstract void accelerate();

    abstract void brake();
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric Car is Accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric Car is Stop");
    }
}

class Fuel extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel Car is Accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fule Car is Stop");
    }
}
