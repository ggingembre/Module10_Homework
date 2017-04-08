
package Task1;

/**
 * Created by guillaume on 4/8/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try{
            System.out.println("entering try block");
            throw new Exception("throwing exception");
        } catch(Exception e) {
            System.out.println("inside catch statement, do something");
        } finally {
            System.out.println("now executing finally block");
        }
    }
}
