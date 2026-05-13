package Com.training.inheritance.Singlelevel;

public class SingleinheritanceMain {

    // Parent class
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Child class
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // Main method
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // defined in Dog
    }
}
