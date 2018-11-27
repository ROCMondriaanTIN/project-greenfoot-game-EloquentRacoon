
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends BasicWorld {
    
    
    
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        super(); 
        this.setBackground("bg.png");
       
        
        
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            LevelManager.getInstance().setLevel(0);
        }
    }
}
