package com.company.CharanPractice;
public class Java_Features {
    public static void main(String args[]){
                String name = "John Doe";

                // Without the `when` keyword, we would have to write this:
                if (name.length() > 0) {
                    System.out.println("The name is not empty.");
                } else {
                    System.out.println("The name is empty.");
                }

                // With the `when` keyword, we can write this:
                when (name.length()){
                    is > 0 -> System.out.println("The name is not empty.");
                    is 0 -> System.out.println("The name is empty.");
                }
            }
        }


