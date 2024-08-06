package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_Datetimeformatter {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
//        System.out.println("Before formatting "+dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- H:m a -- E ");
        String myDate = dt.format(dtf);
//        System.out.println(dtf);
        System.out.println(myDate);



    }
}
