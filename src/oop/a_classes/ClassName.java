package oop.a_classes;

class ClassName {

    int property1;
    double property2;
    String property3;

    ItemClassName itemClassName;

    ClassName(int property1, double property2, String property3, ItemClassName itemClassName) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
        this.itemClassName = itemClassName;
    }

    @Override
    public String toString() {
        return property1 +
                property2 +
                property3 +
                itemClassName.toString();
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
        ClassName className = new ClassName(0, 0.0, "000", new ItemClassName());
        System.out.println(className);
    }
}