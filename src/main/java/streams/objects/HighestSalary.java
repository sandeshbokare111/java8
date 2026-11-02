package streams.objects;

import streams.objects.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestSalary {
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
        Optional<Employee> first = employees.stream().filter(e -> e.getSalary() > 50000).findFirst();
        if (first.isPresent()) System.out.println("First emps sal more than 50k " + first.get());

        //Top 2 highest paid employees
        /*1*/
        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).toList();
        /*2*/
        List<Employee> list = employees.stream().sorted(Comparator.comparingInt(e -> -1 * e.getSalary())).toList();
        System.out.println("Sorted 1 approach: " + collect);
        System.out.println("Sorted 2 approach: " + list);
    }
}
