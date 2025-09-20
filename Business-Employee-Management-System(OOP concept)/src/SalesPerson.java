public class SalesPerson extends Employee {
    // Additional attribute for SalesPerson
    
    private double commission;

    public SalesPerson(int id, String name, double baseSalary, double commission) {
        super(id, name, baseSalary);
        this.commission = commission;
    }

    // Getter and Setter for commission
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + commission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Commission: " + commission);
        System.out.println("Total Salary: " + calculateSalary());
    }
    
}
