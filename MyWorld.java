
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
       
        
        
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            LevelManager.getInstance().setLevel(0);
        }
    }
     public void startWorld() {
        super.startWorld();
        for(Actor actor: getObjects(Hero.class)) {
            if(actor != null) {
                removeObject(actor);
            }
        }
        if(hero != null) {
            addObject(hero, 30, 2975);
        }
    }
}
