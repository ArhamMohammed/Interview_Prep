package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//class HarryFun implements DemoAno{
//    @Override
//    public void meth1(){
//        System.out.println("This is method 1");
//    }
//}



//class AnonyDemo implements DemoAno{
//    @Override
//    public void meth1(){
//        System.out.println("I am meth1");
//
//
//    }
//
//    @Override
//    public void meth2(){
//        System.out.println("I am meth2");
//    }
//
//    public void display(){
//        System.out.println("Hello");
//    }
//}


public class cwh_109_lambda {

    public static void main(String[] args) {
//
//        AnonyDemo obj = new AnonyDemo();
//        obj.display();

//          Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//        };
//        obj.meth1();

//        Lambda Expressions
//        HarryFun obj = new HarryFun();
//        obj.meth1();

        DemoAno obj = (a) ->{System.out.println("I am from Lambda Function "+a);};
        obj.meth1(8);

    }
}
