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
        this.ID = getMeterID();
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
}
