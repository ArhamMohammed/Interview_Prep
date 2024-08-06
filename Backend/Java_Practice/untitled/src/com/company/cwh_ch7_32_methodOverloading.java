package com.company;

public class cwh_ch7_32_methodOverloading {

    static void tellJoke()
    {
        System.out.println("I invented a new word!\n"+"Plagarism!");
    }

    static void change(int a){
        a=98;
    }
    static void change2(int arr[]){
        arr[0]=98;
    }

    static void foo()
    {
        System.out.println("Good Morning bro!");
    }

    static void foo(int a)
    {
        System.out.println("Good Morning "+a+"  bro! ");
    }

    static void foo(int a,int b)
    {
        System.out.println("Good Morning "+a+"  bro! ");
        System.out.println("Good Morning "+a+"  bro! "+b);
    }

    public static void main(String[] args) {
//        tellJoke();

//        Changing the integer
//        int x=45;
//        change(x);
//        System.out.println("The value of marks after running change is = "+marks[0]);

//         Changing the array
//        int[] marks= new int[]{52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of marks[0] after running the change function = "+marks[0]);

//        Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);

    }
}
