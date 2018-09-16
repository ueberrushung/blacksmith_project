package Smithery;

public class Game implements Runnable {
	  public static final int FPS = 60;
	  public static final long maxLoopTime = 1000 / FPS;
	  public boolean running = true;
	  public static Battle battle;
	
	  public static void main(String[] arg) {
	    Game game = new Game(battle);
	    new Thread(game).start();
	  }
	  
	  public Game(Battle battle) {
		this.battle= battle;
	}

	@Override
	  public void run() {
	    long oldTimestamp=System.currentTimeMillis(),
	    	 currentTimestamp,
	    	 elapsedTime;
	    
	    
	    while(running) {
	    	currentTimestamp = System.currentTimeMillis();
	    	elapsedTime = currentTimestamp-oldTimestamp;
//    		update(elapsedTime);
//    		render(elapsedTime);
    		oldTimestamp=maxLoopTime;
	    }
	  }
	  
	 void updateBattle(long elapsed) {
		  this.battle.update(elapsed);
	  }
	 
//	  void update(long elapsed) {
//		  doBattleTick(elapsed);
//	  }
	  
	 
	  
//	  void render(long elapsedTime) {
//		  this.renderer.update(elapsedTime)
//	  }
	}