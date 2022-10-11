/** Class with all ships and its data
		* @author ewanwaldmann
		* @version 1.0
		*/
public class Start {

	/**
	 * starting method, gets the code running
	 * @param args
	 */
	public static void main(String[] args) {
		
		Competition c = new Competition("Rotsee Regatta");
		
		Ship ship1 = new Ship(1, "Alinghi");
		Ship ship2 = new Ship(2, "Red Baron");
		Ship ship3 = new Ship(3, "Blue Lagoon");
		
		c.addShip(ship1);
		c.addShip(ship2);
		c.addShip(ship3);
		
		c.start();
	
		c.printResult();
	}	
}