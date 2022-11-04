import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(126790, "Иванов Максим", 1);
        Employee employee2 = new Employee(136756, "Королев Андрей",2);
        Employee employee3 = new Employee(140800, "Миронова Анна", 3);
        Employee employee4 = new Employee(143560, "Силин Егор", 4);
        Employee employee5 = new Employee(128900, "Зотов Алексей", 5);
        Employee employee6 = new Employee(120000, "Пономарева Мария", 3);
        Employee employee7 = new Employee(136700, "Сафонов Никита", 2);
        Employee employee8 = new Employee(129000, "Лиходеев Александр", 1);
        Employee employee9 = new Employee(149000, "Романова Елена", 4);
        Employee employee10 = new Employee(139000, "Баранов Денис", 5);

        EmployeeBook listOfAllEmployee = new EmployeeBook(new Employee[15]);
        listOfAllEmployee.putInFreeIndex(employee1);
        listOfAllEmployee.putInFreeIndex(employee2);
        listOfAllEmployee.putInFreeIndex(employee3);
        listOfAllEmployee.putInFreeIndex(employee4);
        listOfAllEmployee.putInFreeIndex(employee5);
        listOfAllEmployee.putInFreeIndex(employee6);
        listOfAllEmployee.putInFreeIndex(employee7);
        listOfAllEmployee.putInFreeIndex(employee8);
        listOfAllEmployee.putInFreeIndex(employee9);
        listOfAllEmployee.putInFreeIndex(employee10);

        listOfAllEmployee.printAllEmployee();

        int sumSalary = listOfAllEmployee.calcSumSalary();

        System.out.println("Сумма затрат на зарплаты в месяц = " + sumSalary);
        System.out.println("Сотрудник с максимальной зарплатой: " +  listOfAllEmployee.getEmployees()[listOfAllEmployee.calcMaxSalary()]);
        System.out.println("Сотрудник с минимальной зарплатой: " + listOfAllEmployee.getEmployees()[listOfAllEmployee.calcMinSalary(sumSalary)]);
        int averageSalary = listOfAllEmployee.calcSumSalary() / Employee.getMeterID();
        System.out.println("Среднее значение зарплат: " + averageSalary);
        String[] nameAllEmployee = new String[Employee.getMeterID()];
        nameAllEmployee = listOfAllEmployee.allNameEmployee();
        System.out.println("Список всех сотрудников: " + Arrays.toString(nameAllEmployee));
        listOfAllEmployee.toIndexSalary(15);
        System.out.println("Сумма затрат на зарплаты после индексации на 15% в месяц: " + listOfAllEmployee.calcSumSalary());

        EmployeeBook listOfDepartment = new EmployeeBook(new Employee[15]);
        listOfDepartment=listOfAllEmployee.showDepartment(2);

        listOfDepartment.printAllEmployee();
        int sumInDepartment = listOfDepartment.calcSumSalary();
        System.out.println("Затраты на зарплаты в месяц по отделу: " + sumInDepartment);
        System.out.println("Сотрудник с минимальной зарплатой по отделу: " + listOfDepartment.getEmployees()[listOfDepartment.calcMinSalary(sumInDepartment)]);
        System.out.println("Сотрудник с максимальной зарплатой по отделу: " + listOfDepartment.getEmployees()[listOfDepartment.calcMaxSalary()]);
        averageSalary = listOfDepartment.calcSumSalary() / EmployeeBook.getMeterEmployeeFromDepartment();
        System.out.println("Среднее значение зарплат по отделу: " + averageSalary);
        listOfDepartment.toIndexSalary(10);
        System.out.println("Сумма затрат на зарплаты в отделе после индексации на 10% в месяц: " + listOfDepartment.calcSumSalary());

        listOfDepartment.writeWithoutDepartment();
        System.out.println("-----------------------");
        int sumForSearch = 150000;
        listOfAllEmployee.findMinSalary(sumForSearch);
        System.out.println("-----------------------");
        listOfAllEmployee.findMaxSalary(sumForSearch);
    }
}