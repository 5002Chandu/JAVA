 // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package controlflow;

public class SwtichDemo {
   public SwtichDemo() {
   }

   public static void main(String[] var0) {
      switch ("Monday") {
         case "Monday":
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
         case "Friday":
            System.out.println("Weekday - Training Time!");
            break;
         case "Saturday":
         case "Sunday":
            System.out.println("Weekend - Practice Projects");
            break;
         default:
            System.out.println("Invalid day");
      }

   }
}