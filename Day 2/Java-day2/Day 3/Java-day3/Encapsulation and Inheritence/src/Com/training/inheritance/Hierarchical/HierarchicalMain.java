package Com.training.inheritance.Hierarchical;

public class HierarchicalMain {

    // Base class
    static class Employee {
        void company() {
            System.out.println("Working at TCS");
        }
    }

    // Derived class 1
    static class Developer extends Employee {
        void code() {
            System.out.println("Developer writes code");
        }
    }

    // Derived class 2
    static class Tester extends Employee {
        void test() {
            System.out.println("Tester tests applications");
        }
        
    }

    // Main method
    public static void main(String[] args) {
        Developer d = new Developer();
        d.company();  // inherited from Employee
        d.code();     // defined in Developer

        System.out.println();

        Tester t = new Tester();
        t.company();  // inherited from Employee
        t.test();     // defined in Tester
    }
}
