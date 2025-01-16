package designPattern.abstractFactoryDp;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDevEmployee();
    }
}
