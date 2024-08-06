package com.company;

class MyNewThr1 extends Thread{

    @Override
    public void run() {
        while (true){
        System.out.println("Thank you!! For the first thread");
    }
    }
}

class MyNewThr2 extends Thread{
    @Override
    public void run() {
        while (true){
        System.out.println("Thank you!! For the second thread");
    }
    }
}

public class cwh_75_threadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
