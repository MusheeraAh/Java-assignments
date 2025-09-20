// BusinessSystem.java

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessSystem {

    public static void main(String[] args) {
        // Create a list of employees (Using Collections - Bonus)
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display menu
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add new employee");
            System.out.println("2. View all employees");
            System.out.println("3. View total payroll");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewEmployee(employees, scanner);
                    break;
                case 2:
                    viewAllEmployees(employees);
                    break;
                case 3:
                    viewTotalPayroll(employees);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Method to add a new employee
    private static void addNewEmployee(List<Employee> employees, Scanner scanner) {
        System.out.println("\nSelect employee type:");
        System.out.println("1. Manager");
        System.out.println("2. Sales Person");
        System.out.println("3. Intern");
        System.out.print("Enter choice: ");

        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Base Salary: ");
        double baseSalary = scanner.nextDouble();

        Employee employee = null;

        switch (type) {
            case 1:
                System.out.print("Enter Bonus: ");
                double bonus = scanner.nextDouble();
                employee = new Manager(id, name, baseSalary, bonus);
                break;
            case 2:
                System.out.print("Enter Commission: ");
                double commission = scanner.nextDouble();
                employee = new SalesPerson(id, name, baseSalary, commission);
                break;
            case 3:
                employee = new Intern(id, name, baseSalary);
                break;
            default:
                System.out.println("Invalid employee type.");
                return;
        }

        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    // Method to view all employees
    private static void viewAllEmployees(List<Employee> employees) {
        System.out.println("\n--- All Employees ---");
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee emp : employees) {
            emp.displayInfo();

            // Use instanceof to check specific type (Bonus)
            if (emp instanceof Manager) {
                System.out.println("Role: Manager");
                System.out.println("Bonus: " + ((Manager) emp).getBonus());
            } else if (emp instanceof SalesPerson) {
                System.out.println("Role: Sales Person");
                System.out.println("Commission: " + ((SalesPerson) emp).getCommission());
            } else if (emp instanceof Intern) {
                System.out.println("Role: Intern");
            }

            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println("-------------------");
        }

        // Display total employee count (Bonus)
        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }

    // Method to view total payroll
    private static void viewTotalPayroll(List<Employee> employees) {
        System.out.println("\n--- Total Payroll ---");
        double totalPayroll = 0;

        for (Employee emp : employees) {
            totalPayroll += emp.calculateSalary();
        }

        System.out.println("Total Payroll: $" + totalPayroll);
    }
}
