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
    int level;
    Hero hero;
    public Door(String image, int width, int heigth, int levelnummer){
        super(image, width, heigth);
        this.level = levelnummer;
        
        
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
        
        switch (level){
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
            
            case 6:
            number = 6;
            break;
            
            case 7:
            number = 7;
            break;
            
            case 8:
            number = 8;
            break;
            
            case 9:
            number = 9;
            break;
            
            case 10:
            number = 10;
            break;
            
            case 11:
            number = 11;
            break;
            
            case 12:
            number = 12;
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
