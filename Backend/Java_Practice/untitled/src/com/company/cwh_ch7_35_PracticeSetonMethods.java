package com.company;

public class cwh_ch7_35_PracticeSetonMethods {

//    static void multi(int n){
//        for(int i=1;i<=10;i++)
//            System.out.printf("%dx%d = %d \n",n,i,n*i);
//    }

//    static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static int sumOfNatural(int x){
//        if(x==1)
//            return 1;
//             int sum= x+sumOfNatural(x-1);
//
//        return sum;
//    }

//        static void pattern2(int n) {
//        for (int i = n; i>=0; i--) {
//            for (int j = i; j >0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static int fibo(int n)
//    {
//        if(n==1)
//            return 0;
//        else if(n==2)
//            return 1;
//        else
//            return fibo(n-1)+fibo(n-2);
//    }

//    static int avg(int ...arr)
//    {
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//            sum+=arr[i];
//        int average = sum/arr.length;
//
//        return average;
//    }

//    static void pattern3(int n){
//
//    }

//        static void pattern1Rec(int n) {
//            if(n>0){
//                pattern1Rec(n-1);
//                for(int i= 0;i<n;i++)
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    static void pattern2Rec(int n) {
        if(n>0){
            for(int i= 0;i<n;i++)
                System.out.print("*");

            System.out.println();
            pattern2Rec(n-1);
        }
//        System.out.println();
    }

    public static void main(String[] args) {

//    Problem 1
//    multi(5);

//    Problem 2
//    pattern1(5);

//    Problem 3
//        int sum = sumOfNatural(5);
//        System.out.println(sum);

//        Problem 4
//        pattern2(4);

//        Problem 5
//            int result=fibo(5);
//        System.out.println(result);

//        Problem 6
//        System.out.println(avg(1,2,3,4,5));

//        Problem 7
        pattern2Rec(4);
//        Problem 8

//        pattern1Rec(4);

    }
}
