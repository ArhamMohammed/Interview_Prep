package com.company;

public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        //Precedence and Associativity
      /*
        int a = 6*5-34/2;

            30-17
            13
        System.out.println(a);
        int b = 60/5-34*2;
            =12-68
            =-56
        System.out.println(b);
*/
        int b=1;
        int c=4;
        int a=5;
        int k = b*b-4*a*c/(2*a);
        System.out.println(k);
    }
}
