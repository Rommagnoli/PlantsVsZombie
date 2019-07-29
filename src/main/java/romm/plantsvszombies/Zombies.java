package romm.plantsvszombies;

/**
 * Class that describe zombies and they behavior.
 * @author Román Magnoli
 *
 */
public class Zombies {
	
	/**
	 * name set the typo of the zombies.
	 */
	private static String name;
	
	/**
	 * health is a variable that describe the life of the zombies.
	 */
	private static int health;
	
	/**
	 * attack define the damage caused by the zombies.
	 */
	private static int attack;
	
	/**
	 * speed is a variable that describe the advance of the zombies.
	 */
	private static int speed;
	
	/**
	 * cost set the value to invoke a zombie.
	 */
	private static int cost;

	public Zombies(String name){
		switch (name) {
		case "DPS" : Zombies.name = name;	
					 Zombies.health = 100;
					 Zombies.attack = 50;
					 Zombies.speed = 2;
					 Zombies.cost = 50;
		break;				 
		case "Tank" : Zombies.name = name;	
					  Zombies.health = 100;
					  Zombies.attack = 50;
					  Zombies.speed = 1;
					  Zombies.cost = 50;
		break;
		}
	}
	
	/**
	 * getName inform the typo of a zombie
	 * @return A string with the typo of zombie.
	 */
	public String getName() {
		return Zombies.name;
	}
	
	/**
	 * getHealth inform current life of a zombie.
	 * @return An integer with the current life of the zombie.
	 */
	public int getHealth() {
		return Zombies.health;
	}
	
	/**
	 * getAttack inform the amount of damage a zombie can do.
	 * @return An integer with the amount of damage of a zombie.
	 */
	public int getAttack() {
		return Zombies.attack;
	}
	
	/**
	 * getSpeed inform the advance of a zombie.
	 * @return An integer with the speed of a zombie.
	 */
	public int getSpeed() {
		return Zombies.speed;
	}
	
	/**
	 * getCost inform the price of a zombie to be invoke.
	 * @return An integer with the value of a zombie.
	 */
	public int getValor() {
		return Zombies.cost;
	}
	
	/**
	 * setHealth assign the remaining life of a zombie. 
	 * @param newhealth is the remaining life of the zombie.
	 */
	public void setHealth(int newhealth) {
		Zombies.health = newhealth;
	}
	
	/**
	 * damageRecived calculates the remaining life of a zombie 
	 * depending the damage he take.
	 * @param damage is the amount of life decremented to a hitted zombie.
	 */
	public void damageRecived(int damage) {
		int currentHealth = this.getHealth();
		currentHealth = currentHealth - damage;
		this.setHealth(currentHealth);
	}
}
