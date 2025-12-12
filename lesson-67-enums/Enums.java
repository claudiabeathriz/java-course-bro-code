import java.util.Scanner;

public class Enums {

    public static void main(String[] args){

        // enums = (enumerations) are a special kind of class that represents a fixed set of constants
        //                        (unchangeable variables, like final variables)
        //         they improve code readability and are easy to maintain
        //         more efficient with switches when comparing Strings

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");

            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid weekday");
        }

        //System.out.println(day);
        //System.out.println(day.getDayNumber());

    }
}
