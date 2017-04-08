package Task2;

/**
 * Created by guillaume on 4/8/17.
 */
public class WordContainsSpace extends Exception {
    //Parameterless Constructor
    public WordContainsSpace() {}

    //Constructor that accepts a message
    public WordContainsSpace(String message)
    {
        super(message);
    }
}
