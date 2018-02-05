import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String args[]){
        Entity[][] map = new Entity[15][15];
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                map[i][j] = null;
            }
        }
        
        Weapon dagger = new Weapon(0, 0, 1, 20);
        Armor leatherArmor = new Armor(0, 0, 20, "leather");
        Hero hero = new Hero(0, 0, dagger, leatherArmor);
        
        entityList.add(hero);
        
        for(int i = 0; i < entityList.size(); i++){
            Entity currentObj = entityList.get(i);
            map[currentObj.getY()][currentObj.getX()] = currentObj;
        }
    }
}