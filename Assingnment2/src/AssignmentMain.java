import com.thiruselvan.assignment.employees.*;
import com.thiruselvan.assignment.utilities.EmployeeUtilities;
import java.util.ArrayList;
import java.util.List;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Thiru", 101, 100000, "HR");
        Developer developer = new Developer("Thiru", 102, 50000, "Java");

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(developer);

        EmployeeUtilities.printEmployeeDetails(employees);
        double totalSalary = EmployeeUtilities.calculateTotalSalary(employees);
        System.out.println("Total Salary: " + totalSalary);
    }
}

