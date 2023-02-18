package oop.d_abstraction;


import java.util.ArrayList;
import java.util.Arrays;

// School example
abstract  class Person {
    int id;
    String Name;
}

class Student {
    Level level;
}

enum Level { cp1, cp2 }

class Teacher {
    Subject Subject;
}

enum Subject { java, cpp }

class ClassAbstraction {
    public static void main(String[] args) {
//        Person person = new Person(); // abstract classes cannot be instantiated
        Teacher teacher = new Teacher();
        Student student = new Student();
    }
}