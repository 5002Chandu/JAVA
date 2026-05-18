import java.util.ArrayList;
import java.util.Scanner;

// Custom Exception
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class VoterList {
    
    static ArrayList<String> voterList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Voter Registration System ===\n");
        
        System.out.print("Enter number of voters to register: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Voter " + i + " ---");
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Age: ");

            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            
            try {
                registerVoter(name, age);
                System.out.println("Yes "  + name + " registered successfully!");
            } catch (UnderAgeException e) {
                System.out.println("NO Registration Failed: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("NO Unexpected Error: " + e.getMessage());
            }
        }
        
        // Display final voter list
        System.out.println("\n=================================");
        System.out.println("FINAL VOTER LIST (" + voterList.size() + " voters)");
        System.out.println("=================================");
        if (voterList.isEmpty()) {
            System.out.println("No eligible voters registered yet.");
        } else {
            for (String voter : voterList) {
                System.out.println(voter);
            }
        }
        
        sc.close();
    }

    // Method with Exception Handling
    public static void registerVoter(String name, int age) throws UnderAgeException {
        
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        
        if (age < 18) {
            throw new UnderAgeException("Age must be 18 or above. " + name + " is only " + age + " years old.");
        }
        
        if (age > 150) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
        
        // Add to voter list
        voterList.add(name + " (Age: " + age + ")");
    }
}