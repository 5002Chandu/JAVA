public class ExceptionDemo {
    public static void main(String[] args) {
        // Test 1: ArithmeticException
        try {
            int result = 100 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }

        // Test 2: ArrayIndexOutOfBoundsException
        try {
            int[] scores = {90, 85, 78};
            System.out.println("Score at index 5: " + scores[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        }

        // Test 3: NumberFormatException
        try {
            String input = "abc123";
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Format Error: Cannot convert '" + e.getMessage() + "' to int");
        }

        // Test 4: NullPointerException
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Error: Variable is null");
        }

        System.out.println("Program continues after handling all exceptions.");
    }
}