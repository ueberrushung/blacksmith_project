package Smithery;

import java.util.Timer;
import java.util.TimerTask;

public class Battle {
	
	public Monster monster;
	public Attacker attacker;
	private static Timer timer;
	
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
			startTimer("peter");
			resetSomeTimer();
			attack();
			//timer.schedule(new Hit(), (long)(1000 * this.attacker.weapon.attSpeed));
			timer.cancel();
		}
	}
	
	private void attack() {
		this.monster.hp -= this.attacker.weapon.totalDMG;
		System.out.println("Bob attacks with: " + this.attacker.weapon.totalDMG + " DMG" );
		System.out.println(this.monster.name + " HP: " + this.monster.hp);
	}
	
	private void startTimer(String name) {
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {
                System.out.println("name: " + name);
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 5000);

    }

    public void resetSomeTimer() {
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {
                System.out.println("updating timer");
            }
        };
        timer.cancel();
        timer = new Timer();
        timer.schedule(timerTask, 1000);

    }
}
