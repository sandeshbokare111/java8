package streams.objects;

import streams.objects.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployeeInEachDepartment {
    static void main() {
        //Highest paid sal of emps in each dept
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
        Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(collect);
    }
}
