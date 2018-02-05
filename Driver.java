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
        //create obj
        Weapon dagger = new Weapon(0, 0, 1, 20);
        Armor leatherArmor = new Armor(0, 0, 20, "leather");
        Hero hero = new Hero(0, 0, dagger, leatherArmor);
        
        //farmers?
        
        //what items can farmers sell?
        
        //how many farmers?
        
        //number of random weap/armor in map?
        
        entityList.add(hero); //add all obj to list
        
        for(int i = 0; i < entityList.size(); i++){ //set all obj to map
            Entity currentObj = entityList.get(i);
            map[currentObj.getY()][currentObj.getX()] = currentObj;
        }
        
        printMap(map);
    }
    
    public static void printMap(Entity[][] map){
        String s = "";
        for(Entity[] r : map){
            for(Object i : r){
                if((i.getClass().isInstance(new Hero()))){
                    s = s + "Hero";
                }else if((i.getClass().isInstance(new Weapon()))){
                    s = s + "Weapon";
                }else if((i.getClass().isInstance(new Potion()))){
                    s = s + "Potion";
                }else if((i.getClass().isInstance(new Armor()))){
                    s = s + "Armor";
                }else if((i.getClass().isInstance(new Monster()))){
                    s = s + "Monster";
                }else if((i.getClass().isInstance(new Farmer()))){
                    s = s + "Farmer";
                }else{
                    s = s + "0";
                }
            }
        }
    }
}