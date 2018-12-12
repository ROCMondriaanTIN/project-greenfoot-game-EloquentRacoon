import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialText extends Mover
{
    /**
     * Act - do whatever the TutorialText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    StringBuffer Text = new StringBuffer();
    public void act() 
    {
        // Add your action code here.
    }
    
    public void yeet(){
        
        getWorld().showText("ga er nu door heen om terug te gaan naar het main menu",350, 370); 
         
        getWorld().showText(Letter.str.toString(),100, 70); 
        getWorld().showText(Letter.str.toString(),100, 70); 
        getWorld().showText(Letter.str.toString(),100, 70);
    }
}
