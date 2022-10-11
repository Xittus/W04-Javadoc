/**
 * Class with all ships and its data
 * @author ewanwaldmann
 * @version 1.0
 */

public class Ship {

	private int nr;
	private String name;
	private int time;

	/**
	 * constructor
	 * @param nr
	 * @param name
	 */
	public Ship(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}

	/**
	 * getter for Number
	 * @return
	 */
	public int getNr() {
		return nr;
	}

	/**
	 * setter for number
	 * @param nr
	 */
	public void setNr(int nr) {
		this.nr = nr;
	}

	/**
	 * getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * generates a random end time the ships
	 * @see #time
	 */
	public void race() {
		int min = 300;
		int max = 600;
		this.time = (int) (Math.random() * (max - min + 1)) + min;
	}

	/**
	 * getter for the random time in race
	 * @return
	 */
	public int getTime() {
		return time;
	}
	
}
