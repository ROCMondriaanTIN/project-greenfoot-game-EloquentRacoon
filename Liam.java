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
    int gedaan = 0;
    boolean gevraagt;
    
    
    
    public Liam(){
        super();
        
        setImage("pokerMad.png") ;
        
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
               //Letter.str.setLength(0); 
               
               if (gevraagt == false && Greenfoot.mouseClicked(this)){
                   Vragen.laadVraag(0);
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNummer).vraag,200, 50);
                   gevraagt = true;
               }
               if (gevraagt == true && Greenfoot.mouseClicked(this)){
                   
                   if (Vragen.vragenlijst_1.get(Vragen.vraagNummer).antwoord.equals(Letter.str.toString())){
                       System.out.println("het klpt");
                    }
               }
               
            }
               if (gedaan == 1){
                   Vragen.laadVraag(1);
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNummer).vraag,200, 50);
               }
               if (gedaan == 2){
                   Vragen.laadVraag(2);
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNummer).vraag,200, 50);
               }
               if (gedaan == 3){
                   Vragen.laadVraag(3);
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNummer).vraag,200, 50);
               }
               if (gedaan == 4){
                   Vragen.laadVraag(4);
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNummer).vraag,200, 50);
               }
               if (gedaan == 5){
                   Vragen.laadVraag(5);
                   getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNummer).vraag,200, 50);
               }
           
           
       }
    }
    
    
   
}
