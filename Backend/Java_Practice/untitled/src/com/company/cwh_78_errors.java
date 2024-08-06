package com.company;

import com.sun.security.jgss.GSSUtil;

public class cwh_78_errors {
    public static void main(String[] args) {
        int a = 6000;
        int b = 60;

        try{
        int c = a/b;
            System.out.println("The result is = "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide due to:");
            System.out.println(e);
        }
        System.out.println("End of the program");

    }
}
