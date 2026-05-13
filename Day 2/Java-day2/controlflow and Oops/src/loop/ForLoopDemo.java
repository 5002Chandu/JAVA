package loop;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + i);
        }
        int[] numbers = {10,20,30,40};
        for (int num : numbers) {
            System.out.println( num);
        }
    }

}
