package com.company;

import java.util.*;

public class cwh_92_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList <Integer> l2 = new LinkedList<>();
        l2.add(16);
        l2.add(26);
        l2.add(36);
        l2.add(46);
        l2.add(56);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.addLast(13);
        l1.add(0,5);
        l1.addAll(0,l2);

        System.out.println(l1.contains(1));
        System.out.println(l1.indexOf(26));
        System.out.println(l1.indexOf(9));

        for(int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i)+", ");
        }
    }
}
