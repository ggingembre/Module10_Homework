package Task4;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by guillaume on 4/8/17.
 */
public class fandg {

    public static void f() throws GuestError{
        try {
            g();
        }catch(DateError e){
            int guest = 0;
            if (guest <= 0) throw new GuestError(guest);
        }
    }

    public static void g() throws DateError {
        LocalDate startDate = LocalDate.of(2017, Month.APRIL, 10);
        LocalDate endDate = LocalDate.of(2017, Month.APRIL, 9);
        if (startDate.isAfter(endDate)) throw new DateError(startDate,endDate);
    }

}
