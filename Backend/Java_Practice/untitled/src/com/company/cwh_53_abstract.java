package com.company;

import javax.imageio.stream.ImageInputStream;
import java.sql.SQLOutput;

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public abstract void greet();
    public abstract void greet2();
}
abstract class Parent3{
    public Parent3(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public abstract void greet();
    public abstract void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning from Greet1!!!");
    }
    public void greet2(){
        System.out.println("Good Afternoon from Greet2!!!");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am Good.");
    }

}

public class cwh_53_abstract {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.sayHello();

    }
}
