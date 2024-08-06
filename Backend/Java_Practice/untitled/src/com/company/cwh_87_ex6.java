package com.company;

import java.util.Scanner;

class InvalidInputException extends Exception{
    public String toString(){
        return "Input must be valid";
    }
}

class DivideByException extends Exception {
    public String toString() {
        return "Cannot be divided by 0";
    }
}
class MaximumInputException extends Exception {
    public String toString() {
        return "Input is greater than 1,00,000";
    }
}

class MaxMultiplierReachedInputException extends Exception{
        public String toString(){
            return "Multiplication Input must be less than 7000";
}
}


public class cwh_87_ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

                System.out.println("Enter the first number");
                int num1 = sc.nextInt();

                System.out.println("Enter the input for performing the specific operation");
                String ch = sc.next();

                System.out.println("Enter the second number");
                int num2 = sc.nextInt();

                if(num1 > 100000 || num2 > 100000 ){
                    throw new MaximumInputException();
                }
                else {
                    switch (ch){
                        case "+":
                            System.out.println("The sum of "+num1+" and "+num2+" is = "+(num1+num2));
                        case "-":
                            System.out.println("The difference of "+num1+" and "+num2+" is = "+(num1-num2));
                        case "/":
                        {
                            if(num1 == 0 || num2 ==0){
                                throw new DivideByException();
                            }
                            else
                            System.out.println("The sum of "+num1+" and "+num2+" is = "+(num1/num2));
                        }
                        case "*":
                        {
                            if(num1 > 7000 || num2 > 7000)
                                throw new MaxMultiplierReachedInputException();
                            else
                            System.out.println("The sum of "+num1+" and "+num2+" is = "+(num1*num2));
                        }
                        default:
                            throw new InvalidInputException();
                    }
                }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
