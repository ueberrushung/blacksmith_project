package Smithery;

public class Attacker {

	public Weapon weapon;
	public int hp = 100;
	public Attacker( Weapon weapon) {
		this.weapon = weapon;
		
	}
	public boolean alive() {
		if(this.hp <= 0)return false;
		else return true;
	}
}
