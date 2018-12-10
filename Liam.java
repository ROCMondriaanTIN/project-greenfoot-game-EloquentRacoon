import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Liam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Liam extends Mover
{
    /**
     * Act - do whatever the Liam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int gedaan = 0;
    boolean gevraagt;
    static boolean update;
    
    
    
    
    public Liam(){
        super();
        
        setImage("Liam.png") ;
        getImage().scale(180,180);
        
    }
    
    public void act() 
    {
        velocityY = 0;
        applyVelocity();
        vraagstelen();
        
    }    
    
    public void vraagstelen(){
        for (Actor hero : getObjectsInRange(200,Hero.class)) 
       {
           if(gedaan == 0)
           {
               if (gevraagt == false && Greenfoot.mouseClicked(this)){               
                   Vragen.laadVraag(0);
                   BasicWorld.laadLetters = 1;
                   update = true;
                   gevraagt = true;
               }
               if (gevraagt == true && Greenfoot.mouseClicked(this)){ 
                    if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        gevraagt = false;
                        gedaan = 1;
                        Letter.str.setLength(0);
                        
                    }
                    else{
                        
                        Letter.str.setLength(0);
                        BasicWorld.laadLetters = 1; 
                    }
                }
           }
           if (gedaan == 1){
               if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   Vragen.laadVraag(1);
                   BasicWorld.laadLetters = 2;
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   gevraagt = true;
                }
               if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        gevraagt = false;
                        gedaan = 2;
                        Letter.str.setLength(0);
                    }
                    else {
                        Letter.str.setLength(0);
                        BasicWorld.laadLetters = 2;
                    }
                }
            }
            if (gedaan == 2){
               if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   Vragen.laadVraag(2);
                   BasicWorld.laadLetters = 3;
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   gevraagt = true;
                }
               if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        gevraagt = false;
                        gedaan = 3;
                        Letter.str.setLength(0);
                    }
                    else {
                        Letter.str.setLength(0);
                    }
                }
            }
            if (gedaan == 3){
               if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   Vragen.laadVraag(3);
                   BasicWorld.laadLetters = 4;
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   gevraagt = true;
                }
               if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        gevraagt = false;
                        gedaan = 4;
                        Letter.str.setLength(0);
                    }
                    else {
                        Letter.str.setLength(0);
                    }
                }
            }
            if (gedaan == 4){
               if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   Vragen.laadVraag(4);
                   BasicWorld.laadLetters = 5;
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   gevraagt = true;
                }
               if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        gevraagt = false;
                        gedaan = 5;
                        Letter.str.setLength(0);
                    }
                    else {
                        Letter.str.setLength(0);
                    }
                }
            }
           
       }
    }
    
    
    
   
}
