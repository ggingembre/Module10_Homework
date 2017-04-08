package Task4;

import java.time.LocalDate;
import java.time.Month;

import static Task4.fandg.f;

/**
 * Created by guillaume on 4/8/17.
 */
public class main {
    public static void main(String[] args) {
        try{
        f();
        }catch (GuestError g){
                System.out.println("Am I doing this right??");
        }finally {
                System.out.println("It would be nice to pass values of dates and guests to all functions");
            }
    }
}