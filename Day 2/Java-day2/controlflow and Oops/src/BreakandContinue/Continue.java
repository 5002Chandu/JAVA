package BreakandContinue;

public class Continue {

    public static void main(String[] args) {

        // Example 1 - continue statement
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }
    }
}