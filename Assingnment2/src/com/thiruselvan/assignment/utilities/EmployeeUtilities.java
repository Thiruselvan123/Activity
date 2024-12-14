package com.thiruselvan.assignment.utilities;

import com.thiruselvan.assignment.employees.Employee;
import java.util.List;

public class EmployeeUtilities {
    public static double calculateTotalSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    public static void printEmployeeDetails(List<Employee> employees) {
        employees.forEach(System.out::println);
    }
}
