package Task5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Created by guillaume on 4/9/17.
 */
public final class ErrorsUtil {

    // private constructor
    private ErrorsUtil(){}

    //public static methods

    public static LocalDate getDate(String dateType) throws DateTimeParseException {

        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;

        while (true){
            try {
                System.out.println("Please enter the " + dateType + " (format: dd/MM/yyyy; for instance, 20/08/1982).");
                String date2 = scanner.next();
                //Parsing the String
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                date = LocalDate.parse(date2,formatter);
                break;
            } catch (DateTimeParseException e) {
                System.err.println("Not a valid input. Error :" + e.getMessage());
                continue;
            }
        }
        return date; // I personally prefer when the logic to catch the error is within the error class, and not
                    // in the catch block in main... I prefer this structure of checkdate to the following structures
                    // What do you think?
    }

    public static String getHotel(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your hotel: HYATT, RITZ, INTERCONTINENTAL");
        String hotel = scanner.next();

        return hotel;
    }

    public static class checkToday extends Exception {
        public checkToday (LocalDate startDate){
            System.err.println("You have set a check in date in the past.");
            System.err.println("Please make sure that your check in date is today or later.");
        }
    }

    public static class checkDates extends Exception {

        public checkDates(LocalDate startDate, LocalDate endDate) {
            System.err.println("Your check in date is after your check out date.");
            System.err.println("Your check in date should be before your check out date.");
        }
    }

    public static class checkHotel extends Exception{
        public checkHotel(){
            System.err.println("The hotel you want is not in our list");
        }
    }

    public static boolean rightHotel(String test) {

        for (Hotels c : Hotels.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }
        return false;
    }
}