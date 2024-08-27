package com.arham.practice;

import java.util.Arrays;
import java.util.List;

public class DemoStreams {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,6,12,3);

        int result = nums
                .stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        System.out.println("The resule = "+result);

    }

}
