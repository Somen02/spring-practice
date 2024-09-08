package java8features;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAp {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // Represents Date without a time zone
        System.out.println(now);

        LocalDate customDate = LocalDate.of(2024, Month.APRIL, 5);
        System.out.println(customDate);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        int dayOfYear = now.getDayOfYear();

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);
        System.out.println(dayOfYear);

        LocalDate yesterday = now.minusDays(1);
        LocalDate pastDate = now.minusWeeks(20);
        System.out.println(yesterday);
        System.out.println(pastDate);
        if(now.isAfter(yesterday)){
            System.out.println("date is new to old date");
        }
        LocalTime todayTime = LocalTime.now(); // represents Time without a date or timezone
        LocalTime customTime = LocalTime.of(12, 20, 23);
        LocalTime parsedTime = LocalTime.parse("15:30:45");

        System.out.println(parsedTime);
        System.out.println(customTime);

        LocalDateTime dateTime = LocalDateTime.now(); // represent date time without timezone

        ZonedDateTime zonedDate = ZonedDateTime.now();
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        Instant ins = Instant.now();// represents instantaneous point on the timeline
        System.out.println(ins);
        String date ="01/02/2023";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parseDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parseDate);
    }
}
