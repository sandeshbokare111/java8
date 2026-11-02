package streams.objects;

import streams.objects.pojo.Employee;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamSumOfSalary {
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee("Abhishek", "IT", 50000),
                new Employee("Ankit", "IT", 70000),
                new Employee("Rahul", "HR", 40000),
                new Employee("Tina", "HR", 45000),
                new Employee("Esha", "Finance", 60000),
                new Employee("Naman", "Finance", 55000),
                new Employee("Sachit", "IT", 80000),
                new Employee("Pushp", "Marketing", 50000),
                new Employee("Sumit", "Marketing", 52000)
        );
        Integer reduce = employees.parallelStream().map(e -> e.getSalary()).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
