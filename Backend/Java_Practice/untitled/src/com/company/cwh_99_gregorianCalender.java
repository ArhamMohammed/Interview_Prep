package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class cwh_99_gregorianCalender {
    public static void main(String[] args) {


        Calendar c = Calendar.getInstance();

//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2020));
        System.out.println(g.get(GregorianCalendar.MARCH));

    }
}
