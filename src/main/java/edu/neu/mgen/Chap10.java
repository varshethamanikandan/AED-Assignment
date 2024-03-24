package edu.neu.mgen;

// Abstract class Vehicle
abstract class Vehicle {
    // Attributes
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method to start the vehicle
    public abstract void start();

    // Abstract method to accelerate the vehicle
    public abstract void accelerate(double acceleration);

    // Abstract method to stop the vehicle
    public abstract void stop();

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived class Car
class Car extends Vehicle {
    // Constructor
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    // Implementation of abstract methods
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void accelerate(double acceleration) {
        System.out.println("Accelerating the car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car...");
    }
}

// Derived class Motorbike
class Motorbike extends Vehicle {
    // Constructor
    public Motorbike(String brand, String model, int year) {
        super(brand, model, year);
    }

    // Implementation of abstract methods
    @Override
    public void start() {
        System.out.println("Starting the motorbike...");
    }

    @Override
    public void accelerate(double acceleration) {
        System.out.println("Accelerating the motorbike...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorbike...");
    }
}

// Derived class Aircraft
class Aircraft extends Vehicle {
    // Constructor
    public Aircraft(String brand, String model, int year) {
        super(brand, model, year);
    }

    // Implementation of abstract methods
    @Override
    public void start() {
        System.out.println("Starting the aircraft...");
    }

    @Override
    public void accelerate(double acceleration) {
        System.out.println("Accelerating the aircraft...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the aircraft...");
    }
}

// Derived class Ship
class Ship extends Vehicle {
    // Constructor
    public Ship(String brand, String model, int year) {
        super(brand, model, year);
    }

    // Implementation of abstract methods
    @Override
    public void start() {
        System.out.println("Starting the ship...");
    }

    @Override
    public void accelerate(double acceleration) {
        System.out.println("Accelerating the ship...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the ship...");
    }
}

// Main class to test the program
public class Chap10 {
    public static void main(String[] args) {
        // Creating objects of different vehicles
        Vehicle car = new Car("Jaquar", "Grammy", 2021);
        Vehicle motorbike = new Motorbike("Benz", "CBR600RR", 20223);
        Vehicle aircraft = new Aircraft("Boeing", "747", 2019);
        Vehicle ship = new Ship("Royal Navy", "Passenger Ship", 1930);

        // Displaying information about vehicles
        System.out.println("Car Information:");
        car.displayInfo();
        car.start();
        car.accelerate(60);
        car.stop();
        System.out.println();

        System.out.println("Motorbike Information:");
        motorbike.displayInfo();
        motorbike.start();
        motorbike.accelerate(80);
        motorbike.stop();
        System.out.println();

        System.out.println("Aircraft Information:");
        aircraft.displayInfo();
        aircraft.start();
        aircraft.accelerate(800);
        aircraft.stop();
        System.out.println();

        System.out.println("Ship Information:");
        ship.displayInfo();
        ship.start();
        ship.accelerate(20);
        ship.stop();
    }
}