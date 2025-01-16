package designPattern.factoryDp;

public class Client {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("ANDROID DEVELOPER");

        System.out.println("Employee Salary is: " + emp.getSalary());
        System.out.println(emp.getName());
    }
}
