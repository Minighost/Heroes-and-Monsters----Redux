public class Armor extends entity{
    private int hp;
    private int x, y;
    private String type;
    
    public Armor(int x, int y, int hp, String t){
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.type = t;
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