package com.arham.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {

    public static void main(String[] args){

        List<Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();

        for(int i = 1;i<=10000;i++){
            nums.add(ran.nextInt(100));
        }

//        int sum = nums.
//                stream().
//                map(n -> n*2).
//                reduce(0,(c,e) -> c+e);

        long startSum2 = System.currentTimeMillis();
        int sum2 = nums.
                stream().
                map(n -> {
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                        System.out.println("Exception occurred");
                    }
                    return n*2;
                }).
                mapToInt(i->i).
                sum();
        long endSum2 = System.currentTimeMillis();

        long startSum3 = System.currentTimeMillis();
        int sum3 = nums.
                parallelStream().
                map(n -> {
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                        System.out.println("Exception occurred");
                    }
                    return n*2;
                }).
                mapToInt(i->i).
                sum();
        long endSum3 = System.currentTimeMillis();

//        System.out.println(sum);

        System.out.println("The sum2 is = "+sum2+". The total computation time is = "+(endSum2 - startSum2));
        System.out.println("The sum3 is = "+sum3+". The total computation time is = "+(endSum3 - startSum3));

    }

}
