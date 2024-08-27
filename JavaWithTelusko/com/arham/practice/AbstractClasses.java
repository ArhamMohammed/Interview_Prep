package com.arham.practice;


abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Play music in apple car play");
    }
}

abstract class WagonR extends Car{

    public void drive(){
        System.out.println("Drive at the speed of 80");
    }
}

public class AbstractClasses {

    public static void main(String args[]){

//    WagonR wagonR = new WagonR();
//    wagonR.drive();
//    wagonR.playMusic();
    }
}
