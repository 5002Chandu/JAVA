package ackage VoterRegistrationSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class VoterService {
   private static final String VOTER_FILE = "registered_voters.txt";

   public VoterService() {
   }

   public void registerVoter(String var1, int var2) throws UnderAgeException, IOException {
      if (var1 != null && !var1.trim().isEmpty()) {
         if (var2 < 18) {
            throw new UnderAgeException(var1 + " is under 18 years old. Registration denied.");
         } else if (var2 > 150) {
            throw new IllegalArgumentException("Invalid age entered!");
         } else {
            Voter var3 = new Voter(var1, var2);
            BufferedWriter var4 = new BufferedWriter(new FileWriter("registered_voters.txt", true));
            Throwable var5 = null;

            try {
               var4.write(var3.toString() + " | Registered on: " + LocalDate.now());
               var4.newLine();
            } catch (Throwable var14) {
               var5 = var14;
               throw var14;
            } finally {
               if (var4 != null) {
                  if (var5 != null) {
                     try {
                        var4.close();
                     } catch (Throwable var13) {
                        var5.addSuppressed(var13);
                     }
                  } else {
                     var4.close();
                  }
               }

            }

            System.out.println(" Voter registered: " + var3);
            FileLogger.logMessage("Voter registered: " + var1);
         }
      } else {
         throw new IllegalArgumentException("Name cannot be empty!");
      }
   }

   public void displayAllVoters() {
      System.out.println("\n=== REGISTERED VOTERS LIST ===");

      try {
         BufferedReader var1 = new BufferedReader(new FileReader("registered_voters.txt"));
         Throwable var2 = null;

         try {
            String var3;
            boolean var4;
            for(var4 = false; (var3 = var1.readLine()) != null; var4 = true) {
               System.out.println(var3);
            }

            if (!var4) {
               System.out.println("No voters registered yet.");
            }
         } catch (Throwable var13) {
            var2 = var13;
            throw var13;
         } finally {
            if (var1 != null) {
               if (var2 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var12) {
                     var2.addSuppressed(var12);
                  }
               } else {
                  var1.close();
               }
            }

         }
      } catch (IOException var15) {
         System.out.println("Error reading voter file.");
         FileLogger.logException(var15, "Reading Voter File");
      }

   }
}