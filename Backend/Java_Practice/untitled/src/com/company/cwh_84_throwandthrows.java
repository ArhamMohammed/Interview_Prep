package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class NegativeRadiusException extends Exception{

    public String toString(){
        return "Radius cannot be negative";
    }

    public String getMessage(){
        return "Radius cannot be negative";
    }

}



public class cwh_84_throwandthrows {


    public static double area(int r) throws NegativeRadiusException {
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r *r;
        return result;
    }

   public static int divide (int a,int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {

       try{
//           int c = divide(6,0);
//           System.out.println(c);

           Scanner sc = new Scanner(System.in);

           System.out.println("Enter the radius");
           int a = sc.nextInt();

           double ar = area(a);
           System.out.println("The area is = "+ar);
       }
       catch (Exception e){
//           System.out.println("Exception");
           System.out.println(e);
       }
    }
}
