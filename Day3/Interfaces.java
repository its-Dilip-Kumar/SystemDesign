public class Interfaces {
    public static void main(String[] args){
        Car car=new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

interface Car{
    void start();
    void accelerate();
    void brake();
}

class ElectricCar implements Car{
    @Override 
    public void start(){
        System.out.println("Electric car has started");
    }

    @Override
    public void accelerate(){
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void brake(){
        System.out.println("Electric car is stopping");
    }
}


class FuelCar implements Car{
    @Override 
    public void start(){
        System.out.println("FuelCar car has started");
    }

    @Override
    public void accelerate(){
        System.out.println("FuelCar car is accelerating");
    }

    @Override
    public void brake(){
        System.out.println("FuelCar car is stopping");
    }
}
