package BreakandContinue;

public class Break {

    public static void main(String[] args) {

        // Example 1 - break in for loop
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}