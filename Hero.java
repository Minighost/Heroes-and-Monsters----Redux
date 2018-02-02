public class Hero extends Entity{
    private int x, y;
    private int hp, dmg;
    private String name;
    private Weapon weapon;
    private Armor armor;
    
    public Hero(int x, int y, int h, int d, Weapon w, Armor a){
        this.x = x;
        this.y = y;
        this.hp = h;
        this.dmg = d;
        this.weapon = w;
        this.armor = a;
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
    
    public void setDMG(int newDMG){
        this.dmg = newDMG;
    }
    
    public Weapon getWeapon(){
        return this.weapon;
    }
    
    public void setWeapon(Weapon newWeap){
        this.weapon = newWeap;
    }
    
    public Armor getArmor(){
        return this.armor;
    }
    
    public void setArmor(Armor newArmor){
        this.armor = newArmor;
    }
    
    public String toString(){
        return "Name: " + this.name + ", HP: " + this.hp + ", Weapon: " + this.weapon.toString() + ", Damage: " + this.dmg + ", Armor: " + this.armor.toString();
    }
}