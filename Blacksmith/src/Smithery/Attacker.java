package Smithery;

public class Attacker extends Competitor {

	public Attacker(String name, Weapon weapon, int hp) {
		super(Faction.ATTACKER, name,weapon,hp);
	}
}
