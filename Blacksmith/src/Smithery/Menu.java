package Smithery;

public class Menu {

	public static void main (String[] args) {
		
		String iron = "iron";
		String steel = "steel";
		String straight = "straightsword";
		String shorts = "shortsword";
		String longs = "longsword";
		String broad = "broadsword";
		
	/*	int x = 0; 
		for(int i = 0; i < 100; i++) {
			
			Weapon ss1 = new Weapon(iron, shorts);
			Weapon ss2 = new Weapon(steel, shorts);
			if (ss2.totalDMG > ss1.totalDMG) {
				x++;	
			}
			
		}
		System.out.print(x); */
		
		Weapon ss1 = new Weapon(iron, broad);
		Weapon ss2 = new Weapon(steel, shorts);
		
		Attacker bob = new Attacker(ss2);
		Monster goblin = new Monster("goblin");
		Battle firstBattle = new Battle(bob,goblin);
		firstBattle.fight();
		//ss1.print();
		
		//ss2.print();
	}
}
