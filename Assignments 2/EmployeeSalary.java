package Assignments;

public class EmployeeSalary {

    double grossSalary;
    double netSalary;

    double calculateSalary(double basicSalary, double allowance) {
        return basicSalary + allowance;
    }

    double calculateNetSalary(double grossSalary, double deductions) {
        return grossSalary - deductions;
    }

    void displayDetails() {
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {

        EmployeeSalary emp = new EmployeeSalary();

        double basicSalary = 25000;
        double allowance = 5000;
        double deductions = 2000;

        emp.grossSalary = emp.calculateSalary(basicSalary, allowance);

        emp.netSalary = emp.calculateNetSalary(
                emp.grossSalary, deductions);

        emp.displayDetails();
    }
}

