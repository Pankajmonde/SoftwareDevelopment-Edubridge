package Task;

abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void calculateSalary();
}

// Full Time Employee
class FullTimeEmployee extends Employee {

    int monthlySalary;

    FullTimeEmployee(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Full Time Salary: ₹" + monthlySalary);
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    int ratePerHour;

    PartTimeEmployee(String name, int hoursWorked, int ratePerHour) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        int salary = hoursWorked * ratePerHour;

        System.out.println("Employee Name: " + name);
        System.out.println("Part Time Salary: ₹" + salary);
    }
}

// Intern
class Intern extends Employee {

    int stipend;

    Intern(String name, int stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    void calculateSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Intern Stipend: ₹" + stipend);
    }
}

public class EmployeeSalarySystem {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahul", 50000);
        Employee e2 = new PartTimeEmployee("Priya", 80, 300);
        Employee e3 = new Intern("Amit", 10000);

        e1.calculateSalary();
        System.out.println();

        e2.calculateSalary();
        System.out.println();

        e3.calculateSalary();
    }
}
