public class Farmer extends Entity{
    private int x, y;
    private String name;
    private String item;
    
    public Farmer(int x, int y, String n, String i){
        this.x = x;
        this.y = y;
        this.name = n;
        this.item = i;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getX(){
        return x;
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
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getItem(){
        return this.item;
    }
    
    public String toString(){
        return "Name: " + this.name + ", Item: " + this.item;
    }
}