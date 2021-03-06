package monopoly;

public interface IDice {
	/**
	 * roll the dice
	 */
	public void roll();
	/**
	 * obtain the current value of the dice
	 * @return current value of the dice
	 */
	public int getValue();
	/**
	 * check if the roll is a double
	 * @return true if doubles have been rolled
	 */
	public boolean isDoubles();	
}
