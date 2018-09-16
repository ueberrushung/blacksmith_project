package Smithery;

public enum Material{
	IRON("Iron",0,10),
	STEEL("Steel",50,20);
	
	public int cost;
	public int chance;
	public String name;
	
	private Material(String name, int chance, int cost) {
		this.cost = cost;
		this.chance = chance;
		this.name = name;
	}
	
}

	