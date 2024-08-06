package com.company;

import java.util.*;
import java.util.stream.Collectors;

class Emp1{
    int id;
    String name;
    String dept;
    String designation;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Emp1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", designation='" + designation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
    public Emp1(int id, String name, String dept, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
        this.salary = salary;
    }

}
public class StreamsOnEmployeeDomain {
    public static void main (String args[]){
        List<Emp1> empLstStreams = new ArrayList<Emp1>();
        empLstStreams.add(new Emp1(101,"Charan","IT","Full Stack Developer",8000));
        empLstStreams.add(new Emp1(102,"Arham","IT","Java Full Stack Developer",90000));
        empLstStreams.add(new Emp1(103,"Mir","IT","Python Full Stack Developer",100000));
        empLstStreams.add(new Emp1(104,"Mohammed","IT","DBA Developer",200000));
        empLstStreams.add(new Emp1(105,"Vivek","IT","Network Engineer",150000));
        empLstStreams.add(new Emp1(106,"Oberoi","IT","System Engineer",130000));

        //Filter
        List<Emp1> filteredList = empLstStreams.stream().filter(emp -> emp.getSalary() >30000).collect(Collectors.toList());
        System.out.println("Filtered List Employee whose salary is greater than 30,000INR ");
        filteredList.forEach(emp -> System.out.println(emp));

        //Sorting
        List<Emp1> sortedList = empLstStreams.stream().sorted(Comparator.comparing(Emp1::getName)).collect(Collectors.toList());
        System.out.println("Sorting on the basis of name");
        sortedList.forEach(emp -> System.out.println(emp));

        //FindFirst
        Optional<Emp1> empOpObj = empLstStreams.stream().filter(emp -> emp.getSalary() > 40000).findFirst();
        System.out.println(empOpObj);
        Emp1 empObj = empOpObj.get();
        System.out.println("\nFind the first occurrence of the employee whose salary is greater than 40000");
        System.out.println(empObj);

        List<Emp1> empLstStreams2 = new ArrayList<Emp1>();
        empLstStreams2.add(new Emp1(201,"Reddy","IT","Full Stack Developer",8000));
        empLstStreams2.add(new Emp1(202,"Ramalingam","IT","Java Full Stack Developer",90000));
        empLstStreams2.add(new Emp1(203,"Guru","IT","Python Full Stack Developer",100000));
        empLstStreams2.add(new Emp1(204,"Murthy","IT","DBA Developer",200000));
        empLstStreams2.add(new Emp1(205,"Arumugam","IT","Network Engineer",150000));
        empLstStreams2.add(new Emp1(206,"Modi","IT","System Engineer",130000));

        List<List<Emp1>> combinedLst = Arrays.asList(empLstStreams,empLstStreams2);
        System.out.println("\nAfter combing two lists");
        combinedLst.forEach(emplst1 -> System.out.println(emplst1));

        //Summary Statistics
        IntSummaryStatistics intSummaryStatistics = empLstStreams.stream().collect(Collectors.summarizingInt(Emp1::getSalary));
        System.out.println("\n\nSummary statistics on Employee salaries : ");
        System.out.println(intSummaryStatistics);

        //Working on Streams with HashMap.
        Map<Integer,Emp1> hm = new HashMap<Integer,Emp1>();
        hm.put(101,new Emp1(101,"Charan","IT","Full Stack Developer",8000));
        hm.put(102,new Emp1(102,"Arham","IT","Java Full Stack Developer",90000));
        hm.put(103,new Emp1(103,"Mir","IT","Python Full Stack Developer",100000));

        Map<Integer,Emp1> filteredMap = hm.entrySet().stream().filter(emp -> emp.getValue().getId()>101).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("\nStreams on HashMap and filtering whose employee ids are 102");
        filteredMap.forEach((k,v) -> System.out.println(v));


    }
}
