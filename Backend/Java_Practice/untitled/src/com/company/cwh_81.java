package com.company;

import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number to be divided with");
        int number = sc.nextInt();

        try{
            System.out.println("Entered video number 82");

            try{
                System.out.println("The value at the array index which you entered is = "+marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter the value between 1 and 3");
                System.out.println("Exception occurred at Level 2");
            }
//            System.out.println("The value of array/value is = "+marks[ind]/number);
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Please enter the value between 1 and 3");
//        }
//
//        catch(ArithmeticException e){
//            System.out.println("Please enter a number which can be divided by with the number");
//        }

        catch(Exception e){
            System.out.println("Some exception occurred");
        }


    }
}
