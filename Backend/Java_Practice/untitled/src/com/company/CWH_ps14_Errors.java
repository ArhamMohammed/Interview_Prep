package com.company;

import java.util.Scanner;

class MaxReTriesException extends Exception{

    public String toString(){
        return getMessage();
    }

    public String getMessage(){
        return "Your maximum tries are over";
    }

}

public class CWH_ps14_Errors {
    public static void main(String[] args) throws MaxReTriesException {

//        Problem1
//        Syntax Error
//        int a = 7
//        System.out.println(arham);

//        Logical Error
//        int age = 78;
//        int yearBorn = 2000 -78;

//        Runtime Error
//        System.out.println(6/0);


//        Problem 2
//        try{
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println("Hehehehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Hahahahaha");
//        }

//        Problem 3
            boolean flag = true;
            int count = 0;
            Scanner sc = new Scanner(System.in);
            int[] array = new int[3];

            array[0] = 1;
            array[1] = 2;
            array[2] = 3;

            while(flag && count <5){
                try{
                System.out.println("Enter a valid index");
                int index = sc.nextInt();
                System.out.println("The value is = "+array[index]);
                break;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please enter a valid index between 1 and 3");
                    count++;
                }
            }
        if(count > 5){
            throw new MaxReTriesException();
    }
    }
}
