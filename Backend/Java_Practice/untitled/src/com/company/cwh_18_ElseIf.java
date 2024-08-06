package com.company;

import java.util.Scanner;

public class cwh_18_ElseIf {
    public static void main(String[] args) {
//        int age;
//        System.out.println("Enter the age");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//
//        switch(age){
//            case 18:
//                System.out.println("You are going to become an adult");
//                break;
//            case 23:
//                System.out.println("You are going to join a Job");
//                break;
//            case 60:
//                System.out.println("You are going to be retired");
//                break;
//            default:
//                System.out.println("Enjoy you life!!");
//        }
//        System.out.println("Thanks for using my Java Code");

        char var = 'r';

        switch (var) {
            case 'r' -> System.out.println("You are going to become an adult");
            case 's' -> System.out.println("You are going to join a Job");
            case 'a' -> System.out.println("You are going to be retired");
            default -> System.out.println("Enjoy you life!!");
        }
        System.out.println("Thanks for using my Java Code");

        String var1 = "Arham";

        switch (var1) {
            case "Shubam" -> System.out.println("You are going to become an adult");
            case "Arham" -> System.out.println("You are going to join a Job");
            case "Rihaam" -> System.out.println("You are going to retire");
            default -> System.out.println("Enjoy you life!!");
        }
        System.out.println("Thanks for using my Java Code");


    }
}
