public class Intern extends Employee {
    // Constructor
    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary); // Call parent constructor
    }
    
    // Override calculateSalary method (Polymorphism)
    @Override
    public double calculateSalary() {
        // Intern gets a fixed salary of 3000
        return 3000;
    }
}
    

