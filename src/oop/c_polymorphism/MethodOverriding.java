package oop.c_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

class Vehicle {
    public void move() {
        System.out.println("Moves");
    }
}

class Car extends  Vehicle {
    @Override
    public void move() {
        System.out.println("Drives");
    }
}


class Aircraft extends  Vehicle {
    @Override
    public void move() {
        System.out.println("Flies");
    }
}

class Ship extends  Vehicle {
    @Override
    public void move() {
        System.out.println("Sails");
    }
}


class MethodOverriding {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>(Arrays.asList(
                new Vehicle(),
                new Aircraft(),
                new Ship(),
                new Car()
        ));

        printVehicles(vehicles);
    }

    static void printVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }
}


