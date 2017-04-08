package Task4;

import java.time.LocalDate;
import java.time.Month;
/**
 * Created by guillaume on 4/8/17.
 */
public class DateError extends Exception {

    public DateError(){}

    public DateError (LocalDate startDate, LocalDate endDate){
        System.out.println("Start date should be before end date, please check your dates");
        System.out.println("Start date: " + startDate);
        System.out.println("End date: " + endDate);
    }
}
