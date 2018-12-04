import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Tile
{
    int wereld;
    Hero hero;
    public Door(String image, int width, int heigth, int wereldnummer){
        super(image, width, heigth);
        this.wereld = wereldnummer;
        
        
    }
    private int number;
    

    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        deur();
        
    }    
    public void deur(){
        
        switch (wereld){
            case 0:
            number = 0;
            break;
            
            case 1:
            number = 1;
            break;
            
            case 2:
            number = 2;
            break;
            
            case 3:
            number = 3;
            break;
            
            case 4:
            number = 4;
            break;
            
            case 5:
            number = 5;
            break;
             
            
        }
        for (Actor door : getIntersectingObjects(Hero.class)) {
            if (door != null && Greenfoot.isKeyDown("space")) {
                
                LevelManager.getInstance().setLevel(number);
                //heroCheck();
            }
        }
        
    }
    
}
