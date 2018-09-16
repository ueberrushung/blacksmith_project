package Smithery;

public class Game implements Runnable {
	  public static final int FPS = 60;
	  public static final long maxLoopTime = 1000 / FPS;
	  public static double deciseconds = 0.0;
	  public static double attTime = 0.0;
	
	  public static void main(String[] arg) {
	    Game game = new Game();
	    new Thread(game).start();
	    System.out.println(Math.round( 2.2 * 3.0)/1.0);
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
	      if(timestamp-oldTimestamp > maxLoopTime) {
	        System.out.println("Wir zu spät!");
	        continue;
	      }
	      
	      render();
	      
	      timestamp = System.currentTimeMillis();
	      //System.out.println(maxLoopTime + " : " + (timestamp-oldTimestamp));
	      //System.out.println(System.currentTimeMillis()/1000);
	      
	      try {
	          Thread.sleep(100);
	          deciseconds += 0.1;
	          //System.out.println(Math.round(deciseconds*10.0)/10.0);
	          attTime = (Math.round(deciseconds*10.0)/10.0);
	          
	        } catch (InterruptedException e) {
	          e.printStackTrace();
	        }
	      
	      if(attTime % (Math.round(2.2*10.0)/10.0) == (Math.round(0.0*10.0)/10.0) ) {
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