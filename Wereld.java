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
    static int world;
    static int unlocked;
    Hero hero;
    private static boolean firstAct = true;
    public Wereld(String image, int width, int heigth, int wereldnummer){
        super(image, width, heigth);
        getImage().scale(180, 90);
        this.wereld = wereldnummer;
        
        // if (wereldnummer == 0){
             // setImage("Level1.png");
        // }
        
        
    }
    private int number;
    

    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (firstAct == true){
                
                LevelManager.getInstance().setLevel(0);
                firstAct= false;
            }
        else{
            levelSelect();
        }
        
    }    
    public void levelSelect(){
        
        switch (wereld){
            
            
            case 0:
            if (unlocked >= 0){
                
                number = 1;
                world = 1;
            }
            break;
            
            case 1:
            if (unlocked > 0){
                number = 7;
                world = 2;
            }
            else {
                number = 1;
                world = 1;
            }
            break;
            
            case 2:
            if (unlocked > 1){
                number = 1;
                world = 1;
            }
            break;
            
            case 3:
            if (unlocked > 2){
                number = 1;
                world = 1;
            }
            break;
            
            

        }
        if (Greenfoot.mouseClicked(this)){
            LevelManager.getInstance().setLevel(number);
        }
    }
}
