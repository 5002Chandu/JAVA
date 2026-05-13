package Com.training.encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Pavan");
        s1.setMarks(85);

        System.out.println("Student ID : " + s1.getStudentId());
        System.out.println("Student Name : " + s1.getStudentName());
        System.out.println("Marks : " + s1.getMarks());
    }
}
