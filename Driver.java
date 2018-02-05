import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String args[]){
        Entity[][] map = new Entity[15][15];
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        int[][] takenCoord = new int[10][2];
        
        // Testing map printout
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                map[i][j] = new Air();
            }
        }
        //create obj
        Weapon dagger = new Weapon(0, 0, 1, 20);
        Armor leatherArmor = new Armor(0, 0, 20, "leather");
        Hero hero = new Hero(0, 0, dagger, leatherArmor);
        
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();
        
        Weapon shortSword = new Weapon();
        
        Potion potion1 = new Potion();
        
        Armor bronzeArmor = new Armor();
        
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
                    s = s + "Hero\t";
                }else if((i.getClass().isInstance(new Weapon()))){
                    s = s + "Weapon\t";
                }else if((i.getClass().isInstance(new Potion()))){
                    s = s + "Potion\t";
                }else if((i.getClass().isInstance(new Armor()))){
                    s = s + "Armor\t";
                }else if((i.getClass().isInstance(new Monster()))){
                    s = s + "Monster\t";
                }else if((i.getClass().isInstance(new Farmer()))){
                    s = s + "Farmer\t";
                }else{
                    s = s + "0\t";
                }
            }
            s = s + "\n\n";
        }
        System.out.println(s);
    }
    
    public static void AttackSequence(Entity[][] map, Hero hero){
        System.out.println("\f");
        //x, y, hp, dmg, name
        Monster monster = new Monster(hero.getX(), hero.getY(), 100, 20, "Skeleton");
        System.out.println("A wild " + monster.getName() + " appeared!");
        while(true){
            break;
        }
    }
    
    public static void pressEnter(){
        Scanner s = new Scanner(System.in);
        System.out.print("Press Enter to continue...");
        String str = s.nextLine();
    }
}