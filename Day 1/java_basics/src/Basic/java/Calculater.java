package Basic.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculater {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        // Map operators to their corresponding operations
        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> b != 0 ? a / b : Double.NaN);

        // Map operators to descriptive messages
        Map<String, String> messages = new HashMap<>();
        messages.put("+", "Sum of two numbers is ");
        messages.put("-", "Difference of two numbers is ");
        messages.put("*", "Product of two numbers is ");
        messages.put("/", "Quotient of two numbers is ");

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        String operator = scanner.next();

        BiFunction<Double, Double, Double> operation = operations.get(operator);
        String message = messages.get(operator);

        if (operation != null && message != null) {
            double result = operation.apply(num1, num2);
            if (Double.isNaN(result)) {
                System.out.println("Error! Division by zero.");
            } else {
                System.out.println(message + result);
            }
        } else {
            System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}