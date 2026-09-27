abstract class Employee {

    static String company = "Live Wire";

    String department;
    private double salary;
    protected String designation;
    String location;

    Employee(String department, double salary,
             String designation, String location) {

        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Company: " + company);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Location: " + location);
    }

    abstract void displayRole();
}

class Developer extends Employee {

    Developer(String department, double salary,
              String designation, String location) {

        super(department, salary, designation, location);
    }

    void displayRole() {
        System.out.println("Role: Software Developer");
    }
}

public class EmployeeManagement
 {
    public static void main(String[] args) {

        Developer emp = new Developer(
            "Computer",
            50000,
            "Software Engineer",
            "Chennai"
        );

        System.out.println("Employee Details");
        System.out.println("----------------");

        emp.displayDetails();
        emp.displayRole();
    }
}