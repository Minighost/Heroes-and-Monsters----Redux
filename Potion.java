public class Potion extends Entity{
    private int x, y;
    int potency;

    public Potion(){
    }
    
    public Potion(int x, int y, int potency){
        this.x = x;
        this.y = y;
        this.potency = potency;
    }

    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return "Potion";
    }
}