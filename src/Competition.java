/**
 * Class that simulates a regatta
 *
 * @author Ewan Waldmann
 * @version 1.0
 *
 */
public class Competition {

	private String name;
	private Ship[] ships = new Ship[5];

	/**
	 * creates a new competition
	 * @param name the name of the competition
	 */
	public Competition(String name) {
		this.name = name;
	}

	/**
	 * starts the race
	 * @param Ship#race() is called for each ship
	 */

	public void start() {

		for (Ship s : this.ships) {
			if (s != null) {
				s.race();
			}
		}
	}

	/**
	 * adds a ship to the competition
	 * @param ship
	 */
	public void addShip(Ship ship) {
		for (int i = 0; i < ships.length; i++) {
			if (ships[i] == null) {
				ships[i] = ship;
				break;
			}
		}
	}

	/**
	 * prints out the resault
	 */
	public void printResult() {
		System.out.println("Wettkampf: " + this.name);

		for (Ship s : this.ships) {
			if (s != null) {
				System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
			}
		}
	}
}
