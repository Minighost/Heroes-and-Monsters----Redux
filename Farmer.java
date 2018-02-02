public class Farmer extends entity{
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