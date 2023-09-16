/**
 * @author Ben Albright
 * Program to simulate dice rolls.
 * 
 * Imports Random to generate random numbers
 */
import java.util.Random;

public class RecDieRollerDriver 
{
	public static void main(String[] args) 
	{
		/**
		 * Instantiates a integer variable 1 to 6.
		 */
		Random rand = new Random();	
		int randInt = rand.nextInt(6)+1;

		/** 
		 * Instantiates roller to call the RecDieRoller() class.
		 * Initial call uses the first randomly generated number.
		 */
		RecDieRoller roller = new RecDieRoller();
		roller.roll(randInt);
	}//end main
}//end class