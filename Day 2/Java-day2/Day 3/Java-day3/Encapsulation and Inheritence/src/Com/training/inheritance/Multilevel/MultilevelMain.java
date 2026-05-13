package Com.training.inheritance.Multilevel;

public class MultilevelMain {

    // Base class
    static class Vehicle {
        void start() {
            System.out.println("Vehicle Started");
        }
    }

    // Derived class from Vehicle
    static class Car extends Vehicle {
        void drive() {
            System.out.println("Car is Driving");
        }
    }

    // Derived class from Car (multi-level inheritance)
    static class SportsCar extends Car {
        void speed() {
            System.out.println("Sports Car Running at High Speed");
        }
    }

    // Main method
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();   // inherited from Vehicle
        sc.drive();   // inherited from Car
        sc.speed();   // defined in SportsCar
    }
}
