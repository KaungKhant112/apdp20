package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    String name;
    String dept;
    float salary;
    List<Employee> subordinates=new ArrayList<>();
    public void addSubordinate(Employee emp)
    {
        subordinates.add(emp);
    }

    public void remove(Employee e)
    {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public Employee(String name, String dept, float salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
