package Smithery;

import java.util.Timer;
import java.util.TimerTask;

public class Battle {
	
	public Monster monster;
	public Attacker attacker;
	public static int deciseconds = 0;
	public static int attTime = 0;
	
	
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
		
		 //attack speed timer
	      try {
	    	 
	          Thread.sleep((1*10*1000)/(this.attacker.weapon.attSpeed));
	         
	          	this.monster.hp -= this.attacker.weapon.totalDMG;
		  		System.out.println("Bob attacks with: " + this.attacker.weapon.totalDMG + " DMG" );
		  		System.out.println(this.monster.name + " HP: " + this.monster.hp);
	          
	        } catch (InterruptedException e) {
	          e.printStackTrace();
	        }
	      
		
		
	}
}
