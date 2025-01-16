package designPattern.abstractFactoryDp;

public class client {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println("Employee Salary is: " + emp.getSalary());
        System.out.println(emp.getName());
    }
}
