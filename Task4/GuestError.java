package Task4;

/**
 * Created by guillaume on 4/8/17.
 */
public class GuestError extends Exception {

    public GuestError(){}

    public GuestError(int guest){
        System.out.println("Your guest number is invalid. You set this value to: " + guest);
        System.out.println("Guest values should be between 0 and 10");
    }
}
