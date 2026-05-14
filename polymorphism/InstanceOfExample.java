package polymorphism;

class Shape { }
class Circle extends Shape { }

public class InstanceOfExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s instanceof Circle); // true
        System.out.println(s instanceof Shape);  // true
        System.out.println(s instanceof Object); // true (all classes extend Object)
    }
}