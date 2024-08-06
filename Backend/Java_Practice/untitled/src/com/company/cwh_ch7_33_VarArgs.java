package com.company;

public class cwh_ch7_33_VarArgs {

//    static int sum(int a,int b)
//    {
//        return(a+b);
//    }
//    static int sum(int a,int b,int c)
//    {
//        return(a+b+c);
//    }
//    static int sum(int a,int b,int c,int d)
//    {
//        return(a+b+c+d);
//    }

    static int sum(int ...arr){
//        arr is available as an integer array;
        int result = 0;
        for(int ele:arr)
            result += ele;
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to VarArgs tutorial");

        System.out.println("The sum of 4 nd 5 is = "+sum());
        System.out.println("The sum of 4,3 and 5 is = "+sum(4,3,5));
        System.out.println("The sum of 2,4,3 and 5 is = "+sum(2,4,3,5));
        System.out.println("The sum of 1, 2, 3, 4 and 5 is = "+sum(1,2,4,3,5));


    }
}
