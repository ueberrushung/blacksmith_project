package Smithery;

public class Monster {

	public int hp;
	public int attDMG;
	public int attSpeed;
	public String name;
	
	public Monster(String monstertype) {
		switch (monstertype) {
		case "goblin":
			this.name = "Goblin";
			this.hp = 100;
			break;
		case "orc":
			this.name = "Orc";
			this.hp = 1000;
			break;
		}
	}
	
	public boolean alive() {
		if(this.hp <= 0)return false;
		else return true;
	}
}
