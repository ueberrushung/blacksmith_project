package Smithery;

public interface ICompetitor {
	void tick(Battle battle);
	void damage(ICompetitor source);
	Weapon getWeapon();
	boolean isAlive();
	String getDisplayName();
}
