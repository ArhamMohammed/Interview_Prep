package com.company;

import java.util.Scanner;

class Subject
{
    int max=100;
    int obtd;
}
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        Subject s2 = new Subject();
        Subject s3 = new Subject();
        Subject s4 = new Subject();
        Subject s5 = new Subject();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sub1 marks");
        s1.obtd = s.nextInt();
        System.out.println("Enter sub2 marks");
        s2.obtd= s.nextInt();
        System.out.println("Enter sub3 marks");
        s3.obtd = s.nextInt();
        System.out.println("Enter sub4 marks");
        s4.obtd = s.nextInt();
        System.out.println("Enter sub5 marks");
        s5.obtd = s.nextInt();
        float percent = (s1.obtd+s2.obtd+s3.obtd+s4.obtd+s5.obtd)/5;
        System.out.println("The percentage is = "+percent);
    }
}
