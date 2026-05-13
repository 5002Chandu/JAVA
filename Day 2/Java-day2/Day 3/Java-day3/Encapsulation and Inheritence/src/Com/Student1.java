package Com;
public class Student1 {
    private int studentId;
    private String studentName;
    private double marks;

    // Setter methods
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }  
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", Marks: " + marks);
    }

    // Main method to test
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setStudentId(101);
        s1.setStudentName("Alice");
        s1.setMarks(95);

        s1.displayInfo();
    }
}