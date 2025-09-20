public abstract class Employee {

    
    // encapsulation
    private int id;
    private String name;
    private double baseSalary;
    
    // Bonus
    private static int employeeCount = 0;
    
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++; // Increment count when employee is created
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    

    public static int getEmployeeCount() {
        return employeeCount;
    }
  
    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();
    
    // Concrete method to display employee information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
    
    
}
