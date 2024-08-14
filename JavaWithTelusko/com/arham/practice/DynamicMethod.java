package com.arham.practice;


class Aarham {
    public void show1(){
        System.out.println("Inside Aarham");
    }
}

class Barham extends Aarham{
    public void show2(){
        System.out.println("Inside Barham");
    }
}

class Carham extends Aarham{
    public void show3(){
        System.out.println("Inside Carham");
    }
}

public class DynamicMethod{

public static void main(String args[]){
    Aarham obj = new Aarham();
    obj.show1();

    Barham obj1 = new Barham();
    obj1.show2();

    Aarham obj2 = new Barham();
    ((Barham) obj2).show2();

    obj = new Carham();
//    obj.show3();

}
}