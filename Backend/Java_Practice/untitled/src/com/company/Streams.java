package com.company;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class EmployeeWithStreams{
    int it;
    String name;
    String dept;
    String designation;

    public EmployeeWithStreams(int it,String name, String dept,String designation){
        super();
        this.it = it;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
    }

    public String toString() {
        return "Employee [it = "+it+", Name = "+name+", Department = "+dept+", Designation = "+designation+"]";
    }
}

public class Streams {
    public static void main(String args[]){
        System.out.println("Original List:...");
        List<Integer> numLst = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(numLst);

        //select * from Employee where id = 20;
        System.out.println("\nFiltered even data:");
        List<Integer> filteredLst = numLst.stream().filter(data -> data%2 ==0).collect(Collectors.toList());
        System.out.println(filteredLst);

        System.out.println("\nPredicate Lst");
        Predicate<Integer> p1 = data -> data % 2 == 1;
        List<Integer> predLst = numLst.stream().filter(p1).collect(Collectors.toList());
        System.out.println(predLst);

        //Update Employee set salary = salary+ salary * 0.5;
        System.out.println("\nMap Data....");
        List<Integer> mapLst = numLst.stream().map(data -> data*2).collect(Collectors.toList());
        System.out.println(mapLst);

        System.out.println("\nLimit Data....");
        List<Integer> limitLst = numLst.stream().limit(7).collect(Collectors.toList());
        System.out.println(limitLst);

        System.out.println("\nLimit + Skip Data....");
        List<Integer> limitSkipLst = numLst.stream().limit(7).skip(2).collect(Collectors.toList());
        System.out.println(limitSkipLst);

        System.out.println("\nCount()");
        int count = (int) numLst.stream().filter(p1).count();
        System.out.println("The count is : "+count);

        System.out.println("\nReduce Function");
        int result = numLst.stream().reduce(10, (d1,d2) -> d1+d2);
        System.out.println(result);

        System.out.println("\n");
        IntStream inStream = numLst.stream().mapToInt(Integer::intValue);
        IntSummaryStatistics intSum = inStream.summaryStatistics(); //sum, avg, count, min, max of the data
        System.out.println(intSum);

        System.out.println("\nFlat Map");
        List<Integer> lst1 = Arrays.asList(10,11,12,13,14,15);
        List<Integer> lst2 = Arrays.asList(20,21,22,23,24,25);
        List<Integer> lst3 = Arrays.asList(30,31,32,33,34,35);

        List<List<Integer>> finalLst = Arrays.asList(lst1,lst2,lst3);
        System.out.println("\nFinal List: "+finalLst);

        List<Integer> flatMapLst = finalLst.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("After flat map "+flatMapLst);

        System.out.println("\nPartition By");
        Map<Boolean,List<Integer>> partitionLst = numLst.stream().collect(Collectors.partitioningBy(data -> data > 15));
        System.out.println(partitionLst);

        System.out.println("\nGroup By");
        List<EmployeeWithStreams> empLst = new ArrayList<EmployeeWithStreams>();
        empLst.add(new EmployeeWithStreams(101,"Charan","IT","Full Stack Developer"));
        empLst.add(new EmployeeWithStreams(102,"Arham","IT","Java Full Stack Developer"));
        empLst.add(new EmployeeWithStreams(103,"Mir","IT","Python Full Stack Developer"));
        empLst.add(new EmployeeWithStreams(104,"Mohammed","IT","DBA Developer"));
        empLst.add(new EmployeeWithStreams(105,"Vivek","IT","Network Engineer"));
        empLst.add(new EmployeeWithStreams(106,"Oberoi","IT","System Engineer"));

        Map<String,List<EmployeeWithStreams>> grpLst = empLst.stream().collect(Collectors.groupingBy(emp -> emp.designation));
        System.out.println("\nGroup by of designation : \n"+grpLst);

        Map<Object, Long> grpLst1 = empLst.stream().collect(Collectors.groupingBy(emp -> emp.designation, Collectors.counting()));
        System.out.println("\nGroup based on designation : \n"+grpLst);

        System.out.println("\nDistinct Data");
        List<Integer> disData = numLst.stream().distinct().collect(Collectors.toList());
        System.out.println(disData);




    }
}
