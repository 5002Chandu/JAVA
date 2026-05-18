import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        String data = "Hello, welcome to java file handling class.";
        
        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write(data);
            fw.write("\nThis is written using FileWriter.");
            System.out.println("Data written  successfully to student.txt!");
        } catch (IOException e) {
            System.out.println("An writting  files: " + e.getMessage());
        }
    }
}