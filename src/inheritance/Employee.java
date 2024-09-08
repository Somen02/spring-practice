package inheritance;

import java.util.Objects;

public class Employee extends Person {
    float salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(salary, employee.salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salary);
    }

    public Employee(int id, String name, float salary){
        super(id,name);
        this.salary=salary;
    }
    public void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
