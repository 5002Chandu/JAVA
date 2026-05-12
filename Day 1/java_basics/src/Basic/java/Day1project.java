package Basic.java;
import java.util.Scanner;


public class Day1project {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Salary components
        double hra = 0.20 * basicSalary;   // House Rent Allowance = 20%
        double da = 0.10 * basicSalary;    // Dearness Allowance = 10%
        double ta = 0.05 * basicSalary;    // Travel Allowance = 5%
        double pf = 0.12 * basicSalary;    // Provident Fund = 12%

        double grossSalary = basicSalary + hra + da + ta;
        double netSalary = grossSalary - pf;

        // Print Salary Slip
        System.out.println("\n-----------------------------");
        System.out.println("        SALARY SLIP          ");
        System.out.println("-----------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("TA (5%)       : " + ta);
        System.out.println("PF (12%)      : " + pf);
        System.out.println("-----------------------------");
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Net Salary    : " + netSalary);
        System.out.println("-----------------------------");

        scanner.close();
    }
}

