// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Age Validator Class
public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to proceed.");
        } else if (age > 100) {
            throw new InvalidAgeException("Age seems unrealistic. Please enter a valid age.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    // Main Method
    public static void main(String[] args) {
        try {
            validateAge(15);  // Example: invalid age
            validateAge(25);  // Example: valid age
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
