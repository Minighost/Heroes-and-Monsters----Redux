public class Armor extends Entity{
    private int hp;
    private int x, y;
    private String type;
    
    public Armor(){
    }
    
    
    public Armor(int x, int y, int hp, String t){
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.type = t;
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
    
    public int getHP(){
        return this.hp;
    }
    
    public void setHP(int newHP){
        this.hp = newHP;
    }
    
    public String toString(){
        return "Type: " + this.type + "; Integrity: " + this.hp;
    }
}