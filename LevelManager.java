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
        worlds.add(new LevelSelect());
        worlds.add(new Level());
        worlds.add(new MyWorld());

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
