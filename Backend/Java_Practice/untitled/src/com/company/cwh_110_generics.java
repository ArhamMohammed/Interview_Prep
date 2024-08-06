package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class cwh_110_generics {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("str1");
        al.add(54);
        al.add(653);
        al.add(new Scanner(System.in));

        int a = (int) al.get(2);
        System.out.println(a);

    }
}
