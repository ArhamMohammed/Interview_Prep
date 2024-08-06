package com.company;

import java.util.Scanner;

public class cwh_ch7_34_Recursion {

//    static int factorial(int n){
//        factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
//        int fact = 1;
//        int i=1;
//        if(n==0||n==1)
//            return 1;
//        else {
//            while(i<=n) {
//                fact = fact * i;
//                i++;
//            }
//        }
//        return fact;
//    }

    static void fibo(int n)
    {
        int []arr= new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        for(int i =0;i<n;i++)
            System.out.print(arr[i]+" ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        fibo(x);


    }
}
