package streams.objects;

import streams.objects.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

//Count how many emps in each dept
public class EmployeeIneachDepartment {
    static void main() {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Abhishek", "IT", 50000),
                new Employee("Ankit", "IT", 70000),
                new Employee("Rahul", "HR", 40000),
                new Employee("Tina", "HR", 45000),
                new Employee("Esha", "Finance", 60000),
                new Employee("Naman", "Finance", 55000),
                new Employee("Sachit", "IT", 80000),
                new Employee("Pushp", "Marketing", 50000),
                new Employee("Sumit", "Marketing", 52000)
        ));
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);
    }
}
