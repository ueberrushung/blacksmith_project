package Smithery;
	
public enum WeaponPrototype{
	STRAIGHTSWORD("Straight Sword",1,0,randomRange(10,15),10,1,100),
	SHORTSWORD("Short Sword",1,0,randomRange(12,15),5,1,50),
	LONGSWORD("Long Sword",1,0,randomRange(11,13),15,5,300),
	BROADSWORD("Broad Sword",1,0,randomRange(12,14),12,3,500);
	
	public int cost;
	public int physDMGmin;
	public int physDMGmax;
	public int attSpeed;
	public double critChance;
	public int attRange;
	public String name;
	
	private WeaponPrototype(String name, int attRange, int critChance,int attSpeed,int physDMGmax, int physDMGmin, int cost) {
		this.name =name;
		this.attRange = attRange;
		this.critChance = critChance;
		this.attSpeed = attSpeed;
		this.physDMGmax =physDMGmax;
		this.physDMGmin = physDMGmin;
		this.cost = cost;
		
	}
		
	private static int randomRange ( int min, int max) {
		int range = (max - min);
		return (int)(Math.random() * range) + min; 
	}
}