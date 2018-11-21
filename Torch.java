import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Torch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torch extends NoCollision
{
    private String dir;
    private String teller;
    private int y = 1;
    
    
    
    public Torch(String image, int width, int heigth)
    {
        super(image, width, heigth);
        
    }
    
    /**
     * Act - do whatever the Torch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        torchanimation();
        
    }    
    private void torchanimation(){
        
        if (y != 3){
            teller = Integer.toString(y);
            y++;
        }
        else if ( y == 3){
            y = 1;
        }
        if (y == 1){
            setImage("torchLit1.png");
        } else if (y == 2){
            setImage("torchLit2.png");
        }
        
        
        

    }
}
