package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EmployeeHitesh {
    private int id;
    private String name;
    private double salary;
    private int departmentId;

    // Constructor
    public EmployeeHitesh(int id, String name, double salary, int departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departmentId=" + departmentId + "]";
    }
}

class CustomStream<T> {
    private List<T> elements;

    private CustomStream(List<T> elements) {
        this.elements = elements;
    }

    public static <T> CustomStream<T> of(List<T> elements) {
        return new CustomStream<>(elements);
    }

    public CustomStream<T> filter(Predicate<T> predicate) {
        List<T> filteredElements = new ArrayList<>();
        for (T element : elements) {
            if (predicate.test(element)) {
                filteredElements.add(element);
            }
        }
        return new CustomStream<>(filteredElements);
    }

    public <R> CustomStream<R> map(Function<T, R> mapper) {
        List<R> mappedElements = new ArrayList<>();
        for (T element : elements) {
            mappedElements.add(mapper.apply(element));
        }
        return new CustomStream<>(mappedElements);
    }

    public List<T> collect() {
        return elements;
    }

    public <K, V> Map<K, V> groupAndAggregate(Function<T, K> keyExtractor, Function<List<T>, V> aggregator) {
        Map<K, List<T>> groupedElements = elements.stream()
                .collect(Collectors.groupingBy(keyExtractor));

        Map<K, V> result = new HashMap<>();
        for (Map.Entry<K, List<T>> entry : groupedElements.entrySet()) {
            List<T> group = entry.getValue();
            V aggregate = aggregator.apply(group);
            result.put(entry.getKey(), aggregate);
        }
        return result;
    }
}
public class Assignment3_Hitesh {
    public static void main(String args[]) {
        List<EmployeeHitesh> employees = new ArrayList<>();
        employees.add(new EmployeeHitesh(101, "Arham", 75000.0, 101));
        employees.add(new EmployeeHitesh(102, "Mir", 90000.0, 102));
        employees.add(new EmployeeHitesh(103, "Mohammed", 60000.0, 101));
        employees.add(new EmployeeHitesh(104, "Hitesh", 85000.0, 103));
        employees.add(new EmployeeHitesh(105, "Guru", 50000.0, 103));

        // Calculate the sum of salaries per department
        Map<Integer, Double> sumOfSalariesByDepartment = CustomStream.of(employees)
                .groupAndAggregate(EmployeeHitesh::getDepartmentId,
                        group -> group.stream().mapToDouble(EmployeeHitesh::getSalary).sum());

        // Print the result
        System.out.println("Sum of Salaries per Department:");
        sumOfSalariesByDepartment.forEach((departmentId, sumSalary) -> {
            System.out.println("Department ID: " + departmentId);
            System.out.println("Total Salary: $" + sumSalary);
            System.out.println();
        });
    }
    }