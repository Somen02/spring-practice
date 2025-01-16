package designPattern.factoryDp;

public class WebDevEmployee implements Employee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {
        return "Web Developer";
    }
}
