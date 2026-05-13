package method;
class Student{
    String name;
    Student()
    {
        name ="Unknown";

    }
    void display ()
    {
        System.out.println(name);
    }
}

public class main {
     
    public static void main (String[] args) {
        
    Student s1= new Student();
    s1.display();
    } 
            
}

