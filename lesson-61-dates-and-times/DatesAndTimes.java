import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

    public static void main(String[] args){

        // how to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        //LocalDate date = LocalDate.now();
        //LocalTime time = LocalTime.now();
        //LocalDateTime datetime = LocalDateTime.now();
        //Instant instant = Instant.now();
        // utc

        // Custom format

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = datetime.format(formatter);

        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2025, 12, 9, 20, 23, 8);
        System.out.println(date1);

        LocalDateTime date2 = LocalDateTime.of(2025, 12, 9, 20, 19, 5);
        System.out.println(date2);

        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
        //System.out.println(date);
        //System.out.println(time);
        //System.out.println(datetime);
        //System.out.println(instant);

    }
}
