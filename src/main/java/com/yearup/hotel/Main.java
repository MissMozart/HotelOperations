package com.yearup.hotel;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee(null, null, null, 25.);
        E1.punchIn(LocalDateTime.now().minus(3, ChronoUnit.HOURS));
        E1.punchOut(LocalDateTime.now());
        double hoursWorked = E1.getHoursWorked();
        System.out.println(hoursWorked);
    }
}
