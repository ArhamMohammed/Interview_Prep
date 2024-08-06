package com.company;

import java.util.Scanner;

class MyException extends Exception{

    public String toString(){
        return "I am toString()";
    }


    public String getMessage(){
        return "I am getMessage()";
    }

}

public class cwh_83_exception {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a<9){

            try{
//            throw new MyException();
            throw new ArithmeticException("This is an Exception");
        }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }

    }
}
