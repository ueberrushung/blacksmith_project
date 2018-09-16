package Smithery;

import java.util.List;
import java.util.Random;

public class Competitor implements ICompetitor {
	public static final Random RNG = new Random();
	
	public Weapon weapon;
	public int hp = 100;
	private int counter;
	private String name;
	private Faction faction;
	
	public Competitor(Faction faction,String name, Weapon weapon, int hp) {
		this.faction = faction;
		this.name = name;
		this.weapon = weapon;
		this.hp = hp;	
	}
	
	public boolean canAttack(Battle battle) {
		return counter>=this.weapon.attSpeed;
	}
	
	@Override
	public void tick(Battle battle) {
		counter++;
		if(canAttack(battle)) {
			attack(battle);
			counter=0;
		}
		//poison damage
		//bleeding
	}
	
	public void attack(Battle battle) {
		List<ICompetitor> enemies;
		if(faction==Faction.ATTACKER)
			enemies=battle.monsters;
		else
			enemies=battle.attackers;
		ICompetitor target =enemies.get(RNG.nextInt(enemies.size()));
		target.damage(this);
	}
	
	@Override
	public void damage(ICompetitor source) {
		//def calculation here
		this.hp -= weapon.totalDMG;
		System.out.println(String.format("%s attacks %s for %d damage.%2$s has %d HP left.", source.getDisplayName(), this.getDisplayName(), weapon.totalDMG, this.hp));
	}
	
	@Override
	public Weapon getWeapon() {
		return this.weapon;
	} 
	
	@Override
	public boolean isAlive() {
		return this.hp > 0;
	}
	
	@Override
	public String getDisplayName() {
		return name;
	}
	
	public enum Faction{
		ATTACKER,
		MONSTER;
	}
}
