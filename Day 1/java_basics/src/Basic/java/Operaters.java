package Basic.java;

public class Operaters {
public static void main(String[] args) {
    int a = 10, b = 3;

// Arithmetic
System.out.println(a + b);   // 13
System.out.println(a - b);   // 7
System.out.println(a * b);   // 30
System.out.println(a / b);   // 3 (integer division)
System.out.println(a % b);   // 1 (remainder)

// Relational
System.out.println(a > b);   // true
System.out.println(a == b);  // false

// Logical
System.out.println(a > 5 && b < 5);  // true
System.out.println(a > 15 || b < 5); // true

// Ternary
String result = (a > b) ? "a is greater" : "b is greater";
System.out.println(result);  // a is greater

}
}
