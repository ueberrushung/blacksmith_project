package Smithery;

public class Monster extends Competitor {
	
	private static Weapon orcWeapon = new Weapon(1,1,1);
	
	public Monster(String name, Weapon weapon, int hp) {
		super(Faction.MONSTER,name,weapon,hp);
	}
	
	public static Monster createOrc(){
		return new Monster("Orc", orcWeapon, 1000);
	}
	
	public static Monster createGoblin() {
		return new Monster("Goblin", orcWeapon, 100);
	}
}