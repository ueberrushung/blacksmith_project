package Smithery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Battle {
	
	public List<ICompetitor> monsters;
	public List<ICompetitor> attackers;
	public static int deciseconds = 0;
	public static int attTime = 0;
	public long elapsedTime = 0;
	public long updateRate = 10;
	
	
	public Battle(Collection<ICompetitor> attacker, Collection<ICompetitor> monster) {
		this.attackers = new ArrayList<>(attackers);
		this.monsters = new ArrayList<>(monsters);
	}
	
	public void update(long elapsed) {
		elapsedTime += elapsed;
		if(elapsed>=100) {
			for(ICompetitor a:attackers) {
				a.tick(this);
			}
			for(ICompetitor m:monsters) {
				m.tick(this);
			}
			elapsedTime=0;
		}
	}
}
