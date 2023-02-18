package oop.b_inheritance;

class ParentClass {
    protected int id;

    void method() {
        System.out.println("Hello Parent");
    }
}

class ChildClass extends ParentClass {
    String name = "NAem";

    @Override
    void method() {
        super.method();
        System.out.println("Hello Child " + name);
    }
}


class ClassInheritance {
    public static void main(String[] args) {
        ChildClass subClass = new ChildClass();
        subClass.method();
    }
}
