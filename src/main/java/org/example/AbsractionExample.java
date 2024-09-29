package org.example;

// Absract class vehicle with relevant abstract methods.

abstract class vehicle{
    // Abstract methods.
    abstract void start();  // Method to start the vehicle
    abstract void acclelerate(); // Method to speedUp the vehicle.
    abstract void stop(); // Method to stop the vehicle.
    abstract void fuelUp(); // Method to refuel the vehicle.

    // It is not necessary that in abstract class all methods should be abstract. Even if
    // a single is absract then also it's an abstract class.

}

// Concrete class Car that extends the abstract class vehicle.
class Car extends vehicle{
    @Override
    void start(){
        System.out.println("Car's engine has been started");
    }
    @Override
    void acclelerate(){
        System.out.println("Car's engine has been accelerated");
    }

    @Override

    void fuelUp(){
        System.out.println("Car's tank has been fuel up");
    }

    @Override
    void stop(){
        System.out.println("Car's engine has been stopped");
    }
}

class Truck extends vehicle{
    @Override
    void start(){
        System.out.println("Truck's engine has been started");
    }
    @Override
    void acclelerate(){
        System.out.println("Truck's engine has been accelerated");
    }

    @Override

    void fuelUp(){
        System.out.println("Truck's tank has been fuel up");
    }

    @Override
    void stop(){
        System.out.println("Truck's engine has been stopped");
    }
}

class Bike extends vehicle{
    @Override
    void start(){
        System.out.println("Bike's engine has been started");
    }
    @Override
    void acclelerate(){
        System.out.println("Bike's engine has been accelerated");
    }

    @Override

    void fuelUp(){
        System.out.println("Bike's tank has been fuel up");
    }

    @Override
    void stop(){
        System.out.println("Bike's engine has been stopped");
    }
}

public class AbsractionExample {
    public static void main(String[] args) {
       // vehicle vehicle = new vehicle(); // Error
        vehicle car = new Car();
        car.start();
        vehicle truck = new Truck();
        truck.start();
        vehicle bike = new Bike();
        bike.start();

        bike.stop(); // bike will be stopped.
        truck.fuelUp(); // diesel would be filled in truck
        car.acclelerate(); // car would be speed-up.
    }
}
