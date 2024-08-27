package com.arham.practice;

import java.util.Arrays;

enum Status{
    Running, Failed, Success, Pending;
}

public class EnumsClass {

    public static void main(String[] args) {

        System.out.println(Status.Success);
        System.out.println(Arrays.toString(Status.values()));

        //Comparing the constants

        if(Status.Success == Status.Running){
            System.out.println("Failure");
        }
        else if(Status.Success == Status.Success){
            System.out.println("True. As the condition is satisfied.");
        }

    }
}
