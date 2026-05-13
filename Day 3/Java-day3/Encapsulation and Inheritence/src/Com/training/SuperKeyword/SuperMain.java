package Com.training.SuperKeyword;

public class SuperMain {

    // Parent class
    static class Person {
        String name = "Parent Name";

        Person() {
            System.out.println("Parent Constructor Called");
        }

        void display() {
            System.out.println("Display Method from Parent");
        }
    }

    // Child class
    static class Employee extends Person {
        String name = "Child Name";

        Employee() {
            super(); // calls parent constructor
            System.out.println("Child Constructor Called");
        }

        void show() {
            System.out.println("Child Name : " + name);
            System.out.println("Parent Name : " + super.name);
            super.display(); // calling parent method
        }
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.show();
    }
}
