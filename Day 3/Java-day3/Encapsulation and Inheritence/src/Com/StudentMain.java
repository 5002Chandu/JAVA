package Com;

public class StudentMain {

   public static void main(String[] args) {

       Student1 s1 = new Student1();

       s1.setStudentId(003  );
       s1.setStudentName("Chandhu");
       s1.setMarks(85);
       System.out.println("Student ID : " + s1.getStudentId());
       System.out.println("Student Name : " + s1.getStudentName());
       System.out.println("Marks : " + s1.getMarks());

       s1.displayInfo();
   }
}