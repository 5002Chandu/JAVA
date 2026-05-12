package Basic.java;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening (implicit)
        int marks = 85;
        double percentage = marks;   // int -> double
        System.out.println("Marks     : " + marks);
        System.out.println("Percentage: " + percentage);

        // Narrowing (explicit)
        double price = 199.99;
        int roundedPrice = (int) price;  // double -> int
        System.out.println("Original Price : " + price);
        System.out.println("Rounded Price  : " + roundedPrice);

        // char to int
        char letter = 'A';
        int asciiValue = letter;
        System.out.println("Char: " + letter + " | ASCII: " + asciiValue);
    }
}

