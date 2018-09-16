package Smithery;

public class WeaponPrototype {
	public int cost;
	public int physDMGmin;
	public int physDMGmax;
	public double attSpeed;
	public double critChance;
	public int attRange;
	public String name;
	
	public WeaponPrototype(String prototype) {
		switch (prototype) {
		case "straightsword":
			this.name = "Straigh Sword";
			this.cost = 100;
			this.physDMGmin = 1;
			this.physDMGmax = 10;
			this.attSpeed = randomRange(1.0,1.5);
			break;
		case "shortsword":
			this.name = "Short Sword";
			this.cost = 50;
			this.physDMGmin = 1;
			this.physDMGmax = 5;
			this.attSpeed = randomRange(1.2,1.5);
			break;
		case "longsword":
			this.name = "Long Sword";
			this.cost = 500;
			this.physDMGmin = 5;
			this.physDMGmax = 15;
			this.attSpeed = randomRange(1.1,1.3);
			break;
		case "broadsword":
			this.name = "Broad Sword";
			this.cost = 300;
			this.physDMGmin = 3;
			this.physDMGmax = 12;
			this.attSpeed = randomRange(1.2,1.4);
			break;
		}
	}
	
	private double randomRange ( double min, double max) {
		double range = (max - min);
		return Math.round( ((Math.random() * range) + min)*10.0) /10.0; 
	}
}
