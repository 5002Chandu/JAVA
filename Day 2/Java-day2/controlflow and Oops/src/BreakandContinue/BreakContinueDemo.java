package BreakandContinue;

public class BreakContinueDemo {

    public static void main(String[] args) {

        // Example 3 - break and continue together
        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                continue; // skip 3
            }

            if (i == 8) {
                break; // stop at 8
            }

            System.out.println(i);
        }
    }
}