package com.company;

class Practice13a extends Thread {
    public void run() {
        System.out.println("Good Morning!!!");

    }
}

class Practice13b extends Thread {
    public void run() {
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }

            System.out.println("Welcome!!!");

    }
}

public class cwh_76_PracticeSet {
    public static void main(String[] args) {
        Practice13a p1 = new Practice13a();
        Practice13b p2 = new Practice13b();

//        p2.setPriority(6);
//        p1.setPriority(9);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        System.out.println(p1.getState());
        System.out.println(p2.getState());

        p1.start();
        p2.start();

        System.out.println(p1.getState());
        System.out.println(p2.getState());


    }
}
