package interview;

public class Employee {

    private int empId;
    private String department;
    private String Email;

    public Employee(int empId, String department, String email) {
        this.empId = empId;
        this.department = department;
        Email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "interview.Employee{" +
                "empId=" + empId +
                ", department='" + department + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
