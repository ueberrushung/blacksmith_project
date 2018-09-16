package Smithery;

public class Game implements Runnable {
	  public static final int FPS = 60;
	  public static final long maxLoopTime = 1000 / FPS;
	  public static int deciseconds = 0;
	  public static int attTime = 0;
	
	  public static void main(String[] arg) {
	    Game game = new Game();
	    new Thread(game).start();
	  }
	 
	  public boolean running = true;
	 
	  @Override
	  public void run() {
		  
	    long timestamp;
	    long oldTimestamp;
	    
	    
	    while(running) {
	    	
	    	
	    	
	      oldTimestamp = System.currentTimeMillis();
	      update();
	      timestamp = System.currentTimeMillis();
	     
	      
	      render();
	      
	      timestamp = System.currentTimeMillis();
	 
	      //attack speed timer
	      try {
	          Thread.sleep(100);
	          deciseconds += 1;
	          attTime = (Math.round( (int)(Math.round(deciseconds) ) ) );
	          
	        } catch (InterruptedException e) {
	          e.printStackTrace();
	        }
	      if(attTime % 22 == 0 ) {
	    	  System.out.println(attTime);
	      }
	      
	      if(timestamp-oldTimestamp <= maxLoopTime) {
	        try {
	          Thread.sleep(maxLoopTime - (timestamp-oldTimestamp) );
	        } catch (InterruptedException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	  }
	  void update() { }
	  void render() { }
	}