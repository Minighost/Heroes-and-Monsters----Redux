public class Potion extends obj{
  	private int x, y;
  
 	public Potion(int x, int y){
 	    this.x = x;
 	    this.y = y;
  	}
  
    public int getX(){
      return this.x;
    }

    public int getY(){
      return this.y;
    }

    public String toString(){
      return "Potion";
    }
}