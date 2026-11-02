package streams.objects;

import streams.objects.pojo.Employee;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

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

        long start = System.currentTimeMillis();

        List<String> names = employees.stream()
                .map(emp -> {
                    System.out.println(
                            emp.getName() +
                                    " -> " +
                                    Thread.currentThread().getName()
                    );

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    return emp.getName();
                })
                .toList();

        long end = System.currentTimeMillis();

        System.out.println(names);
        System.out.println("Time = " + (end - start) + " ms");
    }
}