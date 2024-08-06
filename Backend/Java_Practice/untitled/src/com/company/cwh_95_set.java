package com.company;

import java.util.HashSet;

public class cwh_95_set {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(5);
        myHashSet.add(4);
        myHashSet.add(3);
        myHashSet.add(2);
        System.out.println(myHashSet);


    }
}
