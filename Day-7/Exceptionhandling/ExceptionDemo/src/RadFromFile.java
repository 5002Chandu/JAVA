import java.io.FileReader;
import java.io.IOException;
public class RadFromFile {
    public static void main(String[] args) {
        String filePath = "student.txt";
        
        try (FileReader fr = new FileReader("student.txt")) {
            int ch;
            System.out.println("======Contents of " + "student.txt=====");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}