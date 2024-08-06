package com.company;

import java.util.ArrayDeque;

public class cwh_93_ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque <Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.addFirst(96);

        System.out.print(ad1.getFirst());

//        for(int i =0; i<ad1.size(); i++){
//            System.out.print(ad1.get(i)+", ");
//        }


    }
}
