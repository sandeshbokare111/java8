package streams.objects;

import streams.objects.pojo.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryOfEmployeeInEachDept {
    static void main() {
        //Find avg sal of emps in each dept
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
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(e -> e.getSalary())));
        System.out.println(collect);
    }
}
