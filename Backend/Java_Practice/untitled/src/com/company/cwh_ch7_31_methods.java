package com.company;

public class cwh_ch7_31_methods {
   static int logic(int a,int b)
    {
        a += 5;
//        if(a>b)
//        {
//            z=y+x;
//        }
//        else {
//            z=(x+y)*5;
//        }
        return a;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        cwh_ch7_31_methods obj = new cwh_ch7_31_methods();
//        int c=obj.logic(a,b);
        a=logic(a,b);

        int a1=2;
        int b1=1;
//        int c1=obj.logic(a1,b1);
        int c1=logic(a1,b1);

//        System.out.println(c);
        System.out.println(a);
        System.out.println(c1);

    }
}
