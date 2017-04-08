package Task3;

/**
 * Created by guillaume on 4/8/17.
 */
public class main {

    public static void main(String[] args) {
        Integer a = null;
        Integer b = 2;
        try{
            Integer c = a*b;
            System.out.println(c);
        } catch (NullPointerException e){
            System.out.println("One of your variables is null, please check! " + e);
        }finally{
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
