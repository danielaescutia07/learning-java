package main.java.com.daniela;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class WorkingWithDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

//        System.out.println(now); //Zone date and time
//        System.out.println(nowLDT); //Local date and time
//        System.out.println(localDate); //Just date
//        System.out.println(localTime); //Time only
//        System.out.println(instant); //Date and time

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Australia/West")); //We can target zones by using ZoneId.of()
//        ZoneId.getAvailableZoneIds().forEach(System.out::println); //This will print out all zones available to us
//        System.out.println(localDateTime);
//        System.out.println(LocalDateTime.now());

        LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);

        System.out.println(someDate.minus(2, ChronoUnit.DECADES)); //ChronoUnits gives us multiple options

        System.out.println(someDate.isAfter(localDateTime.toLocalDate())); //This is asking if "someDate" is after "localDateTime" (which is now); expected false

        System.out.println(someDate.getYear()); //We can get the year
    }
}
