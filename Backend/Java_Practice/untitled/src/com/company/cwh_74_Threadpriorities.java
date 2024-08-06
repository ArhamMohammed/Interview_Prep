package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        System.out.println("Thank you!!"+this.getName());
    }
}

public class cwh_74_Threadpriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Arham");
        MyThr1 t2 = new MyThr1("Dell");
        MyThr1 t3 = new MyThr1("Legato");
        MyThr1 t4 = new MyThr1("Netserv");
        MyThr1 t5 = new MyThr1("Harry");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
