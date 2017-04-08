package Task2;

/**
 * Created by guillaume on 4/8/17.
 */
public class main {

    public static void main(String[] args) {

        String word = "I feel great";
        System.out.println("Before try block word is: " + word);

        try
        {
            if(word.contains(" "))
            {
                throw new WordContainsSpace(word);
            }
        }
        catch(WordContainsSpace ex) {
            System.out.println("entering catch block");
            word = word.replace(" ","_");
            System.out.println("exiting catch block: " + word);

        } finally
        {
            System.out.println("In final block, word is: " + word);

        }
    }
}
