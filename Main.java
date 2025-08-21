abstract class Employee {
    String name;
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double payPerHour;

    PartTimeEmployee(String name, int hours, double rate) {
        this.name = name;
        this.hoursWorked = hours;
        this.payPerHour = rate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * payPerHour;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Aalu", 40000);
        PartTimeEmployee pte = new PartTimeEmployee("Kathir", 50, 200);

        System.out.println("Full Time Employee Salary: " + fte.calculateSalary());
        System.out.println("Part Time Employee Salary: " + pte.calculateSalary());
    }
}
