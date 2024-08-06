package com.company;

import org.w3c.dom.ls.LSOutput;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class cwh_29_arraysPracticeSet6 {
    public static void main(String[] args) {
//        problem1
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is " + sum);
//
//        Problem 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float find = sc.nextFloat();
//        for(float element : marks){
//            if(find == element) {
//                System.out.println("Element has been found in the array");
//                break;
//            }
//            else System.out.println("Element has not been found");
//            break;
//        }
//         Problem 3
//
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float avg,sum=0;
//        for (float element:marks) {
//            sum+=element;
//        }
//        System.out.println("The sum is ="+sum);
//        System.out.println("The avg is ="+(sum/5));
//
//        Problem 4
//        int[][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] sum = {{0, 0, 0}, {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                sum[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(sum[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//        Problem 5
//        int a[]={10,20,30,40,50};
//        for(int i=(a.length)-1;i>=0;i--)
//            System.out.print(a[i]+" ");
//
//        Problem 6
        int a[]={4,21,3,455,5,34,67};
        int max=0,min=a[0];
        for(int e:a){
            if (e>max){
                max=e;
            }
            else if (e<min){
                min = e;
            }
        }

        System.out.println("The maximum ="+max);
        System.out.println("The minimum ="+min);
//
//      Problem 7
//        int a[]={5,21,3,455,1,34,67};
//        int min = a[0];
//        for(int e:a){
//            if(min>e)
//                min=e;
//    }
//        System.out.println("The minimum = "+min);
//

}
}
