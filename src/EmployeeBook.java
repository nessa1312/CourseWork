import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;
    private static int meterEmployeeFromDepartment;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public static int getMeterEmployeeFromDepartment() {
        return meterEmployeeFromDepartment;
    }

    public static void setMeterEmployeeFromDepartment(int meterEmployeeFromDepartment) {
        EmployeeBook.meterEmployeeFromDepartment = meterEmployeeFromDepartment;
    }

    public void putInFreeIndex(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                employees[i] = employee;
                return;
            }
            if (i == this.employees.length - 1) {
                System.out.println("Не удалось добавить всех сторудников. В массиве нет свободного места");
                return;
            }
            continue;
        }
    }

    public void printAllEmployee() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                System.out.println(this.employees[i]);
            }
        }
    }

    public int calcSumSalary() {
        int sum = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                sum += this.employees[i].getSalary();
            }
        }
        return sum;
    }

    public int calcMaxSalary() {
        int maxSalary = 0;
        int indexMaxSalary = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                if (this.employees[i].getSalary() > maxSalary) {
                    maxSalary = this.employees[i].getSalary();
                    indexMaxSalary = i;
                }
            }
        }
        return indexMaxSalary;
    }

    public int calcMinSalary(int minSalary) {
        int indexMinSalary = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                if (this.employees[i].getSalary() < minSalary) {
                    minSalary = this.employees[i].getSalary();
                    indexMinSalary = i;
                }
            }
        }
        return indexMinSalary;
    }

    public String[] allNameEmployee() {
        String[] allNameEmployee = new String[Employee.getMeterID()];
        for (int i = 0; i < Employee.getMeterID(); i++) {
            if (this.employees[i] != null) {
                allNameEmployee[i] = this.employees[i].getName();
            }
        }
        return allNameEmployee;
    }

    public void toIndexSalary(int per) {
        int x = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                x = this.employees[i].getSalary() / 100 * per;
                this.employees[i].setSalary(x + this.employees[i].getSalary());
            }
        }
    }

    public EmployeeBook showDepartment(int numDepartment) {
        Employee[] employeesInDepartment = new Employee[15];
        int y = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                if (this.employees[i].getDepartment() == numDepartment) {
                    employeesInDepartment[y] = this.employees[i];
                    y++;
                    meterEmployeeFromDepartment++;
                }
            }
        }
        EmployeeBook department = new EmployeeBook(employeesInDepartment);
        return department;
    }

    public void writeWithoutDepartment() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                System.out.print("Name: " + this.employees[i].getName() + " Salary: " + this.employees[i].getSalary() + " ID: " + this.employees[i].getID());
                System.out.println();
            }
        }
    }

    public void findMinSalary(int minSalary) {
        ArrayList<Employee> temporaryArrayForEmployees = new ArrayList<Employee>();
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                if (this.employees[i].getSalary() < minSalary) {
                    temporaryArrayForEmployees.add(this.employees[i]);
                }
            }
        }
        for (int i = 0; i < temporaryArrayForEmployees.size(); i++) {
            System.out.print("Name: " + temporaryArrayForEmployees.get(i).getName() + " Salary: " + temporaryArrayForEmployees.get(i).getSalary() + " ID: " + temporaryArrayForEmployees.get(i).getID());
            System.out.println();
        }
    }

    public void findMaxSalary (int maxSalary){
        ArrayList<Employee> tempArrayForEmployees = new ArrayList<Employee>();
        for (int i = 0; i < this.employees.length; i++){
            if (this.employees[i] != null){
                if (this.employees[i].getSalary() > maxSalary){
                    tempArrayForEmployees.add(this.employees[i]);
                }
            }
        }
        for (int i = 0; i < tempArrayForEmployees.size(); i++){
            System.out.println("Name: " + tempArrayForEmployees.get(i).getName() + " Salary: " + tempArrayForEmployees.get(i).getSalary() + " ID: " + tempArrayForEmployees.get(i).getID());
            System.out.println();
        }
    }

}
