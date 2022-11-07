import java.util.Objects;

public class Employee {
    private int salary;
    private String name;
    private int department;
    private int ID;
    private static int meterID;

    public Employee(int salary, String name, int department) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        meterID += 1;
        this.ID = meterID;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public int getDepartment(){
        return department;
    }

    public int getID(){
        return ID;
    }

    public static int getMeterID(){
        return meterID;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setDepartment (int department){
        this.department = department;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Salary: " + salary + " Department: " + department + " ID: " + ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && ID == employee.ID && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, department, ID);
    }
}
