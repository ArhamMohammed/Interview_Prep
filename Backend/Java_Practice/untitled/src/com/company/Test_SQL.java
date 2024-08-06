package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Test_SQL {
        public Test_SQL(){}
    @Test
    public void testFilterEvenNumbersWithNulls() {
        Integer[] numbers = {1, 2, 3, 4, null, 5, 6, 7, 8, 9, 10};
        List<Integer> numberList = Arrays.asList(numbers);
        Predicate<Integer> evenIntegerPredicate = number -> number != null && number % 2 == 0;
        List<Integer> evenNumbers = numberList.stream().filter(evenIntegerPredicate).collect(Collectors.toList());
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), evenNumbers);
    }
}
