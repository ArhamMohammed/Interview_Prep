package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee_SQL implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee_SQL(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare employees based on their IDs
        return Integer.compare(this.id, other.id);
    }
}

public class Employee_SQLClass {
        public static void main(String[] args) {
            List<Employee_SQL> employeeSQLS = new ArrayList<>();
            employeeSQLS.add(new Employee_SQL(101, "John", 60000.0, "HR"));
            employeeSQLS.add(new Employee_SQL(102, "Alice", 55000.0, "IT"));
            employeeSQLS.add(new Employee_SQL(103, "Bob", 65000.0, "Finance"));
            employeeSQLS.add(new Employee_SQL(104, "Carol", 62000.0, "Sales"));

            // Sort by salary using Java 8 streams
            List<Employee_SQL> sortedBySalary = employeeSQLS.stream()
                    .sorted(Comparator.comparingDouble(Employee_SQL::getSalary))
                    .toList();

            // Sort by name using a custom comparator
            List<Employee_SQL> sortedByName = new ArrayList<>(employeeSQLS);
            sortedByName.sort(Comparator.comparing(Employee_SQL::getName));

            // Sort by ID using Comparable interface
            List<Employee_SQL> sortedById = new ArrayList<>(employeeSQLS);
            sortedById.sort(null); // Using natural ordering (compareTo method)

            // Display the sorted lists
            System.out.println("Sorted by Salary:");
            sortedBySalary.forEach(employeeSQL -> System.out.println(employeeSQL.getName() + ": " + employeeSQL.getSalary()));

            System.out.println("\nSorted by Name:");
            sortedByName.forEach(employeeSQL -> System.out.println(employeeSQL.getName() + ": " + employeeSQL.getId()));

            System.out.println("\nSorted by ID:");
            sortedById.forEach(employeeSQL -> System.out.println(employeeSQL.getId() + ": " + employeeSQL.getName()));
        }
    }
