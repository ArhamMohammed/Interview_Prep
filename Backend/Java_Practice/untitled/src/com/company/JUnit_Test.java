package com.company;

import org.junit.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class JUnit_Test {
    String s1 = "Arham";
    String s2 = "Arham";
    int a1[] = {1,2,3,4,5};
    int a2[] = {1,2,3,4,5};
    int a3[],a4[];
    public static LocalDate localDate(){
        LocalDate date = LocalDate.now();
        return date;
    }

    @Test
    public void localDateTest(){
        JUnit_Test test = new JUnit_Test();
        LocalDate date = LocalDate.now();
        LocalDate dateNotEqual = LocalDate.of(2022,8,31);
        assertEquals(date,test.localDate());
        assertNotEquals(dateNotEqual,test.localDate());
        assertFalse(dateNotEqual == test.localDate());
        assertNotSame(dateNotEqual,test.localDate());
    }
    @Test
    public void sameString(){
        assertTrue(s1 == s2);
        assertSame(s1,s2);
    }

    @Test
    public void sameArray(){
        assertArrayEquals(a1,a2);
    }

    @Test
    @Ignore
    public void notSameArray(){
        assertArrayEquals(a1,a2);
    }

    @Test (expected = NullPointerException.class)
    public void testingNullException(){
        assertArrayEquals(a3,a4);
    }

    @BeforeClass
    public static void beforeAllTestCases(){
        System.out.println("Executed before all the test cases");
    }
    @Before
    public void initialize(){
        System.out.println("@Before, before the test case");
    }

    @After
    public void afterTestCase(){
        System.out.println("@After... After the test case");
    }

    @AfterClass
    public static void afterLastTestCase(){
        System.out.println("@AfterClass... After the last test case");
    }
}
