
/**
 * Write a description of class Die here.
 *
 * @author Beatrice
 * @version 2020 - 1 - 15
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int result;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        result = roll();
    }
    /**
     * calculate the roll
     * 
     */
    public int roll()
    {
        // put your code here
        result = (int) (Math.random() * 6 + 1);
        return result; //have it both places
    }
    /**
     * returns the reslut of the roll
     * @return    the result
     */
    public int getResult()
    {
        return result;
    }
  
}
