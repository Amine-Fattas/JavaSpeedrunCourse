package oop.e_interfaces;

import java.util.ArrayList;
import java.util.Arrays;

interface MovingObject {
    public void move();
}
class Vehicle{
    String brandName;
}

class Car extends Vehicle implements MovingObject {
    @Override
    public void move() {
        System.out.println("Drives");
    }
}


class Aircraft extends Vehicle implements MovingObject {
    @Override
    public void move() {
        System.out.println("Flies");
    }
}

class Ship extends Vehicle implements MovingObject {
    @Override
    public void move() {
        System.out.println("Sails");
    }
}


class Person implements MovingObject {
    @Override
    public void move() {
        System.out.println("Walks");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        ArrayList<MovingObject> movingObjects = new ArrayList<>(Arrays.asList(
                new Aircraft(),
                new Ship(),
                new Car(),
                new Person()
        ));

        printMovingObjects(movingObjects);
    }

    static void printMovingObjects(ArrayList<MovingObject> movingObjects) {
        for (MovingObject movingObject: movingObjects) {
            movingObject.move();
        }
    }
}


