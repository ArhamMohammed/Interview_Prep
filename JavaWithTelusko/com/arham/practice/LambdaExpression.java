package com.arham.practice;

@FunctionalInterface
interface A{
  void add(int i, int j);
}

public class LambdaExpression {

    public static void main(String[] a){

        A obj = (i,j) -> {
            int sum = i+j;
            System.out.println("The sum is = "+sum);
        };
        obj.add(5,10);

    }

}
