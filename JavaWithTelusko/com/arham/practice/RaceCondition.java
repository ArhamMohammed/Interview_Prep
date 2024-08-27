package com.arham.practice;

class Counter{
    int count;
    public synchronized void increment(){
        count ++;
//        System.out.println("The value of count is = "+count);
    }
}

public class RaceCondition {

    public static void main(String [] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i = 1;i<=1000;i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 1;i<=1000;i++){
                c.increment();
            }
        };

        Thread t1arham = new Thread(obj1);
        Thread t2arham = new Thread(obj2);

        t1arham.start();
        t2arham.start();

        t2arham.join();
        t1arham.join();

        System.out.println("The value of count is = "+c.count);
    }

}
