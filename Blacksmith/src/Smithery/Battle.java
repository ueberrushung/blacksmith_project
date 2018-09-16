package Smithery;

import java.util.Timer;
import java.util.TimerTask;

public class Battle {
	
	public Monster monster;
	public Attacker attacker;
	
	
	public Battle( Attacker attacker, Monster monster) {
		this.attacker = attacker;
		this.monster = monster;
	}
	
	public void fight() {
		System.out.println("Bob has: ");
		this.attacker.weapon.print();
		System.out.println("");
		System.out.println("Monster has: "+  this.monster.hp + " HP");
		while( this.monster.alive() && this.attacker.alive() ) {		
			attack();
		}
	}
	
	private void attack() {
		this.monster.hp -= this.attacker.weapon.totalDMG;
		System.out.println("Bob attacks with: " + this.attacker.weapon.totalDMG + " DMG" );
		System.out.println(this.monster.name + " HP: " + this.monster.hp);
	}
}
