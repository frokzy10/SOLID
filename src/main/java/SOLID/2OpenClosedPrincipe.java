package SOLID;


interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    private final double salary;

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class ContractEmployee implements Employee {
    private final double salary;

    public ContractEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary * 0.70;
    }
}

class Freelancer implements Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public Freelancer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class CalculatorSalary {
    public double calculateSalary(Employee employee) {
        return employee.calculateSalary();
    }
}
class Main2 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(5000);
        Employee contractEmployee = new ContractEmployee(4000);
        Employee freelancerEmployee = new Freelancer(40, 100);

        CalculatorSalary calculatorSalary = new CalculatorSalary();

        System.out.println("Full Time salary: " + calculatorSalary.calculateSalary(fullTimeEmployee));
        System.out.println("Contract salary: " + calculatorSalary.calculateSalary(contractEmployee));
        System.out.println("Freelance salary: " + calculatorSalary.calculateSalary(freelancerEmployee));
    }
}