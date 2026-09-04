class Employee {
    String id;
    double salary;

    Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void display() {
        System.out.println(id +
                " | Final Salary: Rs " + salary);
    }
}

public class PayrollBonus {
    public static void main(String[] args) {

        double[] salaries = {
                40000, 55000, 62000, 48000
        };

        Employee[] employees = new Employee[4];

        for (int i = 0; i < employees.length; i++) {
            employees[i] =
                    new Employee("E-10" + (i + 1), salaries[i]);
        }

        for (Employee e : employees) {
            e.raiseSalary(5000);
            e.display();
        }
    }
}