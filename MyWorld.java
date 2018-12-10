
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends BasicWorld {
    
    
    Hero hero;
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        super(); 
        this.setBackground("bg.png");
        int[][] map = { 
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,300,-1,-1,301,-1,-1,302,-1,-1,303,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },};
        setMap(map);
        
        
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            LevelManager.getInstance().setLevel(1);
            
        }
        
        
    }
     
}
