package com.company;

import java.util.Scanner;

public class cwh_16_ifStatement {
    public static void main(String[] args) {

//        float age = 17.2f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>18)
            System.out.println("Yes, you are eligible for driving");
        else
            System.out.println("No, you are not eligible for driving");
    }
}
