import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wereld extends Tile
{
    int wereld;
    Hero hero;
    public Wereld(String image, int width, int heigth, int wereldnummer){
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
        levelSelect();
        
    }    
    public void levelSelect(){
        
        switch (wereld){
            case 0:
            number = 1;
            break;
            
            case 1:
            number = 7;
            break;
            
            case 2:
            number = 0;
            break;
            
            case 3:
            number = 0;
            break;
            
            

        }
        if (Greenfoot.mouseClicked(this)){
            LevelManager.getInstance().setLevel(number);
        }
    }
}
