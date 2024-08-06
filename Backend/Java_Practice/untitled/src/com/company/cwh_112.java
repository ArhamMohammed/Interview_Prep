package com.company;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("This is a deprecated method");
    }
}

interface MyInt{
    void display();
}

public class cwh_112 {
    @SuppressWarnings(" deprecation ")
    public static void main(String[] args) {

        MyDeprecated md = new MyDeprecated();
        md.meth1();

        MyInt i = () ->{
                System.out.println("Display");
        };


    }
}
