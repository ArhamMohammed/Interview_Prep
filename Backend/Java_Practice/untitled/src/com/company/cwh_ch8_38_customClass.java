package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is ="+id+" and my name is = "+name);
    }

    public int getSalary(){
        return salary;
    }
}

public class cwh_ch8_38_customClass {
    public static void main(String[] args) {

        System.out.println("This is a custom class");

        Employee harry = new Employee();// Instantiating a new class.
        Employee john = new Employee();// Instantiating a new class.

        harry.id=12;
        harry.name="Mir Mohammed Arham";
        harry.salary = 12000;
        harry.printDetails();

        john.id=13;
        john.name="John Tripathi";
        john.salary = 20000;
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);

    }
}
