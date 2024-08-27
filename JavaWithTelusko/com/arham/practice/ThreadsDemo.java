package com.arham.practice;

class AThread implements Runnable{
        public void run(){
            for(int i =0; i<10;i++){
            System.out.println("Hi");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}

class BThread implements Runnable{
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsDemo {

    public static void main(String[] args){

        AThread obj1 = new AThread();
        BThread obj2 = new BThread();
//
//        System.out.println("The priority of the first thread is  = "+obj1.getPriority());
//        System.out.println("The priority of the second thread is  = "+obj2.getPriority());
//
//        obj2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("The max priority of the second thread is  = "+obj2.getPriority());
//
//        obj2.setPriority(Thread.MIN_PRIORITY);
//        System.out.println("The min priority of the second thread is  = "+obj2.getPriority());


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}
