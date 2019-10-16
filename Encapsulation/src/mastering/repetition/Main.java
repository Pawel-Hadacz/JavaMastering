package mastering.repetition;

public class Main {

    public static void main(String[] args) {
	/*Player player = new Player();
	player.name = "Tim";
	player.health = 20;
	player.weapon = "Sword";

	int damage = 10;
	player.loseHealth(damage);
	System.out.println("Remaining health " + player.healthRemaining());
	damage = 11;
		player.loseHealth(damage);
		System.out.println("Remaining health " + player.healthRemaining());*/

	/*EngancedPlayer player = new EngancedPlayer("Tom", 50,"Sword");
		System.out.println("Initial healh is: " +player.getHealth());
	EngancedPlayer defPlayer = new EngancedPlayer("Kamil", 222,"Gun");
		System.out.println("Initial healh is: " +defPlayer.getHealth());*/

	Printer p1 = new Printer(100,true);
		System.out.println(p1.getNumberOfPagesPrinted());
	p1.print(20);
	p1.print(30);


		System.out.println(p1.getNumberOfPagesPrinted());
		System.out.println(p1.getTonerLevel());
}
}
