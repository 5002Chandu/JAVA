package Com.training.ConstructorOrder;

public class ConstructorMain {

    // GrandParent class
    static class GrandParent {
        GrandParent() {
            System.out.println("GrandParent Constructor");
        }
    }

    // Parent class extending GrandParent
    static class Parent extends GrandParent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    // Child class extending Parent
    static class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }
    }

    // Main method
    public static void main(String[] args) {
        Child childObj = new Child();  // variable name changed from 'c' to 'childObj'
    }
}
