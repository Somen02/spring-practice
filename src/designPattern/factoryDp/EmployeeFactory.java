package designPattern.factoryDp;

public class EmployeeFactory {

    public static Employee getEmployee(String empName) {
        if (empName.equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDevEmployee();
        } else if (empName.equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDevEmployee();
        } else {
            return null;
        }
    }
}
