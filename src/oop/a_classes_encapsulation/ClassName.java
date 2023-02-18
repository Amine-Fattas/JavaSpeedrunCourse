package oop.a_classes_encapsulation;

import java.awt.*;

class ClassName {

    int property1 = 1;
    double property2;
    String property3;

    ItemClassName itemClassName;

    //Constructor
    ClassName(int property1, ItemClassName itemClassName) {
        this.property1 = 1;
        this.itemClassName = itemClassName;
    }

    void methodName() {
        // Code to execute
    }

    @Override
    public String toString() {
        return "This is a className: property1 = " + property1;
    }
};

class ItemClassName {

    String name;
    ItemClassName() {
        this.name = "ItemClassName";
    }

    @Override
    public String toString() {
        return name;
    }
}

class ClassTest {
    public static void main(String[] args) {
        ClassName className = new ClassName(12, new ItemClassName());
        System.out.println(className.property1);
        System.out.println(className);
    }
}