package Task5;

import java.time.LocalDate;

import static Task5.ErrorsUtil.getDate;
import static Task5.ErrorsUtil.getHotel;
import static Task5.ErrorsUtil.rightHotel;
import static Task5.ErrorsUtil.checkToday;

/**
 * Created by guillaume on 4/9/17.
 */
public class Main {

    public static void main(String[] args) {

        LocalDate startDate = getDate("start date");
        LocalDate endDate = getDate("end date");
        String hotel = getHotel();

        try {
            if(startDate.isBefore(LocalDate.now())) throw new checkToday(startDate);
            if (startDate.isAfter(endDate)) throw new ErrorsUtil.checkDates(startDate, endDate);
            if (!rightHotel(hotel)) throw new ErrorsUtil.checkHotel();
        }
        catch (ErrorsUtil.checkToday |ErrorsUtil.checkDates | ErrorsUtil.checkHotel cd){

            if (cd instanceof checkToday){
                while (true){
                    try {
                        startDate= getDate("check-in date (should be today or later)");
                        if(startDate.isBefore(LocalDate.now())) throw new checkToday(startDate);
                        if (startDate.isAfter(endDate)) {
                            System.out.println("Your check-out date is now after your check-in date.");
                            while (true){
                                endDate = getDate("checkout date (make sure it is after your check-in date)");
                                if (startDate.isBefore(endDate)) break;
                            }
                        }
                        if ((!rightHotel(hotel))){
                            while (true){
                                System.out.println("You entered the wrong value for your hotel.");
                                hotel = getHotel();
                                if ((rightHotel(hotel))) break;
                            }
                        }
                        break;
                    } // this is why I prefer to have the exception check and catch in the method, and not in main, this
                        // is a bit messy
                 catch(checkToday e){
                    continue;
                    }
                }
            } else if (cd instanceof ErrorsUtil.checkDates){
                while (true){
                    try{
                        startDate= getDate("check in date");
                        endDate = getDate("check out date (should be after check in date)");
                        if (startDate.isAfter(endDate)) throw new ErrorsUtil.checkDates(startDate, endDate);
                        break;
                    } catch(ErrorsUtil.checkDates e){
                        System.err.println("Not a valid input. Please make sure your check in date is before your checkout date");
                        continue;
                    }
                }
                if ((!rightHotel(hotel))){
                    while (true){
                        System.out.println("You entered the wrong value for your hotel.");
                        hotel = getHotel();
                        if ((rightHotel(hotel))) break;
                    }
                }
            }else if (cd instanceof ErrorsUtil.checkHotel){
                while (true){
                    try{
                        System.err.println("You have entered a wrong value for your hotel. Please try again.");
                        hotel = getHotel();
                        if (!rightHotel(hotel)) throw new ErrorsUtil.checkHotel();
                        break;
                    } catch(ErrorsUtil.checkHotel e){
                        continue;
                    }
                }
            }
        }
        System.out.println("Your check-in date is: " + startDate + ".");
        System.out.println("Your check-out date is: " + endDate + ".");
        System.out.println("Your hotel is: " + hotel + ".");
    }
}