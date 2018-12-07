import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LevelArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelManager
{
    ArrayList<BasicWorld> worlds = new ArrayList<BasicWorld>();
     
    BasicWorld currentWorld = null;
    
    private static LevelManager instance = null;
    
    /**
     * Constructor for objects of class LevelArrayList.
     * 
     */
    private LevelManager() 
    {    
        worlds.add(0, new Level_Tutorial());
        
        worlds.add(1, new Level_1_Main());
        worlds.add(2, new Level_1_1());
        worlds.add(3, new Level_1_2());
        worlds.add(4, new Level_1_3());
        worlds.add(5, new Level_1_4());
        worlds.add(6, new Level_1_5());
        
        worlds.add( 7, new Level_2_Main());
        worlds.add( 8, new Level_2_1());
        worlds.add( 9, new Level_2_2());
        worlds.add(10, new Level_2_3());
        worlds.add(11, new Level_2_4());
        worlds.add(12, new Level_2_5());
        
        
             
        
        

    }
    
    public void setCurrentWorld(BasicWorld world) {
        this.currentWorld = world;
    }
    
    public void setLevel(int levelNumber){
        if(this.currentWorld != null) {
            currentWorld.endWorld();
        }
        this.currentWorld = worlds.get(levelNumber);
        Greenfoot.setWorld(this.currentWorld);
        currentWorld.startWorld();
        
    }
    
    public static synchronized  LevelManager getInstance() {
        if(instance == null){
            synchronized (LevelManager.class) {
                if(instance == null){
                    instance = new LevelManager();
                }
            }
        }
        return instance;
    }
    
}
