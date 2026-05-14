package polymorphism;

public class MethodOverloadingExample {
    // Overloaded methods: same name, different parameters
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        // Calls the int version
        System.out.println("Sum (int): " + add(5, 7));        // 12
        // Calls the double version
        System.out.println("Sum (double): " + add(3.5, 2.1)); // 5.6
    }
}
