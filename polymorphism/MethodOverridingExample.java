package polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // Polymorphic reference
        a.sound();             // Calls Dog's sound(): "Dog barks"
    }
} 