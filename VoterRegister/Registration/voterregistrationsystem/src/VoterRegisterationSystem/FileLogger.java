package VoterRegistrationSystem;

import java.io.*;
import java.time.LocalDateTime;

public class FileLogger {

    private static final String LOG_FILE = "error_log.txt";

    public static void logException(Exception e, String operation) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bw.write("=== ERROR LOG [" + LocalDateTime.now() + "] ===");
            bw.newLine();
            bw.write("Operation: " + operation);
            bw.newLine();
            bw.write("Exception: " + e.getClass().getName());
            bw.newLine();
            bw.write("Message: " + e.getMessage());
            bw.newLine();
            bw.write("----------------------------------------");
            bw.newLine();
            qSystem.out.println(" Error logged to " + LOG_FILE);
        } catch (IOException io) {
            System.out.println("Failed to write log: " + io.getMessage());
        }
    }

    public static void logMessage(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bw.write("[INFO] " + LocalDateTime.now() + " - " + message);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Log write failed: " + e.getMessage());
        }
    }
}