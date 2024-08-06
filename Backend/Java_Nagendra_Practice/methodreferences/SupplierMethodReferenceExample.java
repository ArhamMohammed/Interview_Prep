package com.nagendra.practice.methodreferences;

import java.util.function.Supplier;

import com.nagendra.practice.com.nagendra.practice.Student;

public class SupplierMethodReferenceExample {

    Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println("Supplier method example");

    }
}
