public class Monster extends Entity{
    private int x, y;
    private int hp;
    private int dmg;
    private String name;
    
    public Monster(){
    }
    
    public Monster(int x, int y, int h, int d, String n){
        this.x = x;
        this.y = y;
        this.hp = h;
        this.dmg = d;
        this.name = n;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int newX){
        this.x = newX;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int newY){
        this.y = newY;
    }
    
    public int getHP(){
        return this.hp;
    }
    
    public void setHP(int newHP){
        this.hp = newHP;
    }
    
    public int getDMG(){
        return this.dmg;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
}