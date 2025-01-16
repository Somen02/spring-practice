package designPattern.factoryDp;

public class AndroidDevEmployee implements Employee{
    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public String getName() {
        return "Adroid Developer";
    }
}
