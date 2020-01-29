
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
    public static void giveInstructions(Scanner in)
    {
    
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
public static int rollTheDice(Scanner in, Die die)
{
    System.out.println("Press enter to roll the dice");
    in.nextLine(); //no imput needs to be saved
    int result1 = die.roll();
    int result2 = die.roll();
    int total = result1 + result2;
    System.out.println("you rolled a " + result1 + "and a " + result2 + "for a total of " + total);
    return total;
}
    // instance variables - replace the example below with your own
public static void Main(String[]args)
{
       Scanner in = new Scanner(System.in);
    Die die = new Die();
    System.out.println("The game of craps!");
    giveInstructions(in);
    System.out.println("Lets play!");
    
    String Status = "y";
    while(Status.substring(0,1).equalsIgnoreCase("y"))
    {
      System.out.println("first roll");
      int result = rollTheDice(in,die);
      if (result == 7 || result == 11)
      {
          System.out.println("you win!! :D ");
        }
      else if (result == 3 || result == 2 || result == 12)
      {
          System.out.println("you loose :/");
        }
      else 
      {
          System.out.println("rolling the point now!");
          int point = result;
          System.out.println("your point is " + point + ". Try to roll it again!");
          result = rollTheDice(in, die);
      while (result != 7 && result != point)
      {
              System.out.println("roll again");
              result = rollTheDice(in,die);
      }
      if (result == 7)
      {
          System.out.println("LOSE!");
        }
      if (result == point)
      {
          System.out.println("YOU WIN yay!");
        }
    }
      System.out.println("would you like to play again (Y/N)");
      Status = in.nextLine();
      if (Status.equals (" ")) { Status = "y";}
  }
  System.out.println("Thank you for playing");
}
}
