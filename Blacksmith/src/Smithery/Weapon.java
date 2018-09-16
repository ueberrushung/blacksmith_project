package Smithery;

public class Weapon {

	public int cost;
	public int totalDMG;
	public int physDMG;
	public int attSpeed;
	public int dps;
	public Material material;
	public WeaponPrototype weaponPrototype;
	
	public Weapon(Material material, WeaponPrototype weaponPrototype) {
		this.material = material;
		this.weaponPrototype = weaponPrototype;
		this.physDMG = getDMGByChance(weaponPrototype.physDMGmin, weaponPrototype.physDMGmax, material.chance);
		this.totalDMG = this.physDMG;
		this.attSpeed = weaponPrototype.attSpeed;
		this.dps = (int)((double)this.totalDMG * this.attSpeed);
		this.cost = weaponPrototype.cost + material.cost;
	}
	
	//for Monster Weapons
	public Weapon(int physDMG,int totalDMG, int attSpeed) {
		this.physDMG = physDMG;
		this.totalDMG = totalDMG;
		this.attSpeed = attSpeed;
	}
	
	//to String function
	public void print() {
		System.out.println(this.material.name + " " + this.weaponPrototype.name);
		System.out.println("Physical Damage: " + this.physDMG);
		System.out.println("Total Damage: " + this.totalDMG);
		System.out.println("Attack Speed: " + this.attSpeed/10.0);
		System.out.println("DPS: " + this.dps);
		System.out.println("Cost: " + this.cost);
		
	}
	
	//calculate DMG functions
	private int getDMGByChance(int min, int max, int percent) {
		int range = max - min;
		return randomRange( min + (range * percent) / 100, max );	
	}
	
	
	//math functions
	private int randomRange ( int min, int max) {
		int range = (max - min) +1;
		return (int)(Math.random() * range) + min;
	}
	
	/* for later use
	private boolean chance(double percent) {
		double r = (Math.random() * 100);
		if(r <= percent) {
		return true;
		} else return false;
	}
	*/
}
