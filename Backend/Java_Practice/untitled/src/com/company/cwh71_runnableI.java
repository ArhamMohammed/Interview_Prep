package com.company;

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a thread 1, not a threat");
    }

}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a thread 2, not a threat");
    }

}

public class cwh71_runnableI {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1= new MyThreadRunnable1();
        Thread gun1 = new MyThread();

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new MyThread();

        gun1.start();
        gun2.start();

    }
}
