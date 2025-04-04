package Chapter04FunctionsAndClass;

public class Ex04EmployeeData {

    String name;
    double gross_salary;
    double tax;

    public double NetSalary() {
        return gross_salary - tax;
    }

    public void IncreaseSalary(double percentage) {
        double increase = gross_salary * (percentage / 100.0);
        gross_salary += increase;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f%n", NetSalary());
    }

}