package streams.objects;

import streams.objects.pojo.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Sort emp by Sal then By name for that use if else then compareTo method
public class SortByNameAndSalary {
    static void main() {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("pushp", "IT", 50000),
                new Employee("Ankit", "IT", 70000),
                new Employee("Rahul", "HR", 40000),
                new Employee("Tina", "HR", 45000),
                new Employee("Esha", "Finance", 60000),
                new Employee("Naman", "Finance", 55000),
                new Employee("Sachit", "IT", 80000),
                new Employee("Abhishek", "Marketing", 50000),
                new Employee("Sumit", "Marketing", 52000)
        ));

        List<Employee> list1 = employees.stream().sorted((emp1, emp2) -> {
            if (emp1.getSalary() > emp2.getSalary()) {
                return 1;
            } else if (emp1.getSalary() < emp2.getSalary()) {
                return -1;
            } else {
                return emp1.getName().compareTo(emp2.getName());
            }
        }).toList();
        System.out.println(list1);
    }
}
