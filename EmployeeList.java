package cafeteria_system;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employees;

    EmployeeList() {
        employees = new ArrayList<>();
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
