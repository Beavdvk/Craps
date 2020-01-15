
/**
 * In this assignment you’ll be creating a main program called Craps.java, which will allow the user to play
 * the game of craps on the computer. 
 *
 * @author Beatrice
 * @version 2020 - 01 -15
 */
import java.util.Scanner;
public class Craps
{
    public static void giveInstructioons()
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Do you want instructions for craps? Y/N");
    String Answer = in.nextLine();
    if (Answer.equals(" ")|| Answer.substring(0,1).equalsIgnoreCase("Y"))//puting the substirng bc then there is 
    {
      System.out.println("1. Roll two dice and add them together!");
      System.out.println("2. If you roll a 7 or 11 on th first try you WIN");
      System.out.println("3. If you get a 2,3, or 12 on the first try you LOSE :(");
      System.out.println("4. any other number you roll becomes your POINT");
      System.out.println("5. Continue to roll until you get another one of your POINT or a 7");
      System.out.println("6. if you get the same number as your POINT you WIN!");
      System.out.println("6. BUT if you roll a 7 you LOSE"); 
    }
   
}
        
    // instance variables - replace the example below with your own
public static void Main(String[]args)
{
    Scanner in = new Scanner(System.in);
    
}
}
