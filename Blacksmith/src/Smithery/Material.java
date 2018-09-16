package Smithery;

public class Material {
	
	public int cost;
	public int chance;
	public String name;
	
	public Material( String material) {
		switch(material) {
		case "iron":
			this.name = "Iron";
			this.chance = 0;
			this.cost = 10;
			break;
		case "steel":
			this.name = "Steel";
			this.chance = 50;
			this.cost = 20;
			break;
		}
	}
}
