package app;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate d04 = LocalDate.parse("2024-01-08");
        LocalDateTime d05 = LocalDateTime.parse("2024-01-08T18:46:13");
        Instant d06 = Instant.parse("2024-01-08T01:00:13Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // 7 days ago
        LocalDate nextWeekLocalDate = d04.plusDays(7); // 7 days from now

        System.out.println("\n---[Past Week]-------------------------");
        System.out.print("pastWeekLocalDate = " + pastWeekLocalDate);

        System.out.println("\n---[Next Week]-------------------------");
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // 7 days ago
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // 7 days from now

        System.out.println("\n---[Past Week]-------------------------");
        System.out.print("pastWeekLocalDateTime = " + pastWeekLocalDateTime);

        System.out.println("\n---[Next Week]-------------------------");
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // 7 days ago
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // 7 days from now

        System.out.println("\n---[Past Week]-------------------------");
        System.out.print("pastWeekInstant = " + pastWeekInstant);

        System.out.println("\n---[Next Week]-------------------------");
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("\n---[Duration days]-------------------------");
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());

    }
}