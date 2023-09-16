import java.util.Random;
public class RecDieRoller 
{
	/**
	 * Creates integers to track total rolls, rolls of 2, a float to calculate the 
	 * mean number of die rolls of 2 in 1000 rolls.
	 */
	int totalRolls;
	int twoRolls;
	float mean;
	
	/**
	 * Sets all values to 0.
	 */
	public RecDieRoller()
	{
		totalRolls = 0;
		twoRolls = 0;
		mean = 0f;
	}//end constructor
	
	/**
	 * Recursive method that simulates rolling a six sided die 1000 times, keeping track of total rolls, rolls of 2, 
	 * and then the average number of times a 2 is rolled.
	 * @param rolls
	 * @return a random number between 1-6 until 1000 rolls have been made, then returns 0.
	 */
	public int roll(int rolls)
	{
		/**
		 * Instantiates a random number generator between 1-6 within the method.
		 */
		Random rand = new Random();	
		rolls = rand.nextInt(6)+1;
		
		/**
		 * Checks for a roll of a 2 and if total rolls are less than 1000.
		 * If true, increments twoRolls +1 and totalRolls +1, then calls itself.
		 */
		if (rolls == 2 && totalRolls < 1000)
		{
			twoRolls++;
			totalRolls++;
			return roll(rolls);
		}//end if
		
		/**
		 * If the roll is not 2, checks if totalRolls is less than 1000. 
		 * If true, increments totalRolls and calls itself.
		 */
		else if (totalRolls < 1000)
		{
			totalRolls++;
			return roll(rolls);
		}//end else if
		
		/**
		 * mean calculats what percentage of the total rolls were 2s.
		 * Then prints out twoRolls, totalRolls, and the mean.
		 */
		mean = ((float)totalRolls/twoRolls);
		System.out.print("Rolls of 2: " + twoRolls + "\n" + "Total rolls: " + totalRolls
				 + "\nMean number of rolls to get 2: ");
		System.out.printf("%,.2f", mean);
		/**
		 * Returns 0 once the recursion is done.
		 */
		return 0;
	}//end class
}//end class