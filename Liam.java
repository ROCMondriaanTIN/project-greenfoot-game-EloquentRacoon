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
    static int vragenWereldEenGedaan = 0;
    static int vragenWereldTweeGedaan = 0;
    boolean gevraagt;
    static boolean update;
    
    
    
    
    public Liam(){
        super();
        
        setImage("Liam.png") ;
        // getImage().scale(135,180);
        getImage().mirrorHorizontally();
        
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
           switch(Wereld.world){
               case 1:
               switch (vragenWereldEenGedaan){
                    case 0:
                    // geen break zodat je niet 2x hoeft te klikken voor een vraag
                    if (Greenfoot.mouseClicked(this)){
                       if (gevraagt == false){               
                           Vragen.laadVraag(1);
                           BasicWorld.laadLetters = 1;
                           update = true;       //zorgt ervoor dat de vraag in de wereld constand word geupdate, anders zie je niet de string in iedere wereld
                           gevraagt = true;     // checkt of er een vraag is gestelt
                       }
                       if (gevraagt == true && Greenfoot.mouseClicked(this)){ 
                            if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                                //controleerd of jou antwoord klopt met het goede antwoord
                                gevraagt = false;
                                vragenWereldEenGedaan = 1;  //zegt hoeveel vragen er gedaan zijn in de gegeven wereld
                                Letter.str.setLength(0);    //reset je antwoord naar een lege stringbuffer
                                Vragen.laadVraag(0);
                            }
                            else{
                                
                                Letter.str.setLength(0);    
                                BasicWorld.laadLetters = 1; //laad opnieuw de letters want het antwoord is fout
                            }
                            break;
                       }
                       
                    }
                    break;
                    case 1:
                    
                        if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                               Vragen.laadVraag(2);
                               BasicWorld.laadLetters = 2;
                               getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                               gevraagt = true;
                        }
                        if (gevraagt == true && Greenfoot.mouseClicked(this)){
                               if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                                    gevraagt = false;
                                    vragenWereldEenGedaan = 2;
                                    Letter.str.setLength(0);
                                    Vragen.laadVraag(0);
                                }
                                else {
                                    Letter.str.setLength(0);
                                    BasicWorld.laadLetters = 2;
                                }
                        }
                    
                    break;
                    case 2:
                   
                       if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                           Vragen.laadVraag(3);
                           BasicWorld.laadLetters = 3;
                           getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                           gevraagt = true;
                       }
                       if (gevraagt == true && Greenfoot.mouseClicked(this)){
                           if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                                gevraagt = false;
                                vragenWereldEenGedaan = 3;
                                Letter.str.setLength(0);
                                Vragen.laadVraag(0);
                            }
                            else {
                                Letter.str.setLength(0);
                                BasicWorld.laadLetters = 3;
                            }
                       }
                    
                   break;
                    
                   case 3:
                   
                       if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                           Vragen.laadVraag(4);
                           BasicWorld.laadLetters = 4;
                           getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                           gevraagt = true;
                       }
                       if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                           if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                                gevraagt = false;
                                vragenWereldEenGedaan = 4;
                                Letter.str.setLength(0);
                                Vragen.laadVraag(0);
                            }
                            else {
                                Letter.str.setLength(0);
                                BasicWorld.laadLetters = 4;
                            }
                       }
                    
                   break;
                   
                   case 4:
                   
                       if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                           Vragen.laadVraag(5);
                           BasicWorld.laadLetters = 5;
                           getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                           gevraagt = true;
                        }
                       if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                           if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                                gevraagt = false;
                                vragenWereldEenGedaan = 0;
                                Letter.str.setLength(0);
                                Vragen.laadVraag(0);
                                Greenfoot.setWorld(new MyWorld());
                                Wereld.unlocked = 1;
                            }
                            else {
                                Letter.str.setLength(0);
                                BasicWorld.laadLetters = 5;
                            }
                        }
                   }
                
               break;
               
               case 2:
               switch (vragenWereldTweeGedaan){
                   case 0:
                   if (gevraagt == false && Greenfoot.mouseClicked(this)){               
                       Vragen.laadVraag(1);
                       BasicWorld.laadLetters = 1;
                       update = true;
                       gevraagt = true;
                   }
                   if (gevraagt == true && Greenfoot.mouseClicked(this)){ 
                        if (Vragen.vragenlijst_2.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                            gevraagt = false;
                            vragenWereldTweeGedaan = 1;
                            Letter.str.setLength(0);
                            Vragen.laadVraag(0);
                        }
                        else{
                            
                            Letter.str.setLength(0);
                            BasicWorld.laadLetters = 1; 
                        }
                   }
                   break;
                   
                   case 1:
                   if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                       Vragen.laadVraag(2);
                       BasicWorld.laadLetters = 2;
                       gevraagt = true;
                   }
                   if (gevraagt == true && Greenfoot.mouseClicked(this)){
                       if (Vragen.vragenlijst_2.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                            gevraagt = false;
                            vragenWereldTweeGedaan = 2;
                            Letter.str.setLength(0);
                            Vragen.laadVraag(0);
                        }
                        else {
                            Letter.str.setLength(0);
                            BasicWorld.laadLetters = 2;
                        }
                   }
                   break;
                   
                   case 2:
                   if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                       Vragen.laadVraag(3);
                       BasicWorld.laadLetters = 3;
                       gevraagt = true;
                   }
                   if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                       if (Vragen.vragenlijst_2.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                            gevraagt = false;
                            vragenWereldTweeGedaan = 3;
                            Letter.str.setLength(0);
                            Vragen.laadVraag(0);
                        }
                        else {
                            Letter.str.setLength(0);
                            BasicWorld.laadLetters = 3;
                        }
                   }
                   break;
                    
                   case 3:
                   if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                       Vragen.laadVraag(4);
                       BasicWorld.laadLetters = 4;
                       gevraagt = true;
                   }
                   if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                       if (Vragen.vragenlijst_2.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                            gevraagt = false;
                            vragenWereldTweeGedaan = 4;
                            Letter.str.setLength(0);
                            Vragen.laadVraag(0);
                        }
                        else {
                            Letter.str.setLength(0);
                            BasicWorld.laadLetters = 4;
                        }
                   }
                   break;
                   
                   case 4:
                   if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                       Vragen.laadVraag(5);
                       BasicWorld.laadLetters = 5;
                       gevraagt = true;
                    }
                   if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                       if (Vragen.vragenlijst_2.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                            gevraagt = false;
                            vragenWereldTweeGedaan = 0;
                            Letter.str.setLength(0);
                            Vragen.laadVraag(0);
                            Greenfoot.setWorld(new MyWorld());
                        }
                        else {
                            Letter.str.setLength(0);
                            BasicWorld.laadLetters = 5;
                        }
                    }
                    break;
               }
               break;
            
            }
               
            
           // if(gedaan == 0)
           // {
               // if (gevraagt == false && Greenfoot.mouseClicked(this)){               
                   // Vragen.laadVraag(0);
                   // BasicWorld.laadLetters = 1;
                   // update = true;
                   // gevraagt = true;
               // }
               // if (gevraagt == true && Greenfoot.mouseClicked(this)){ 
                    // if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        // gevraagt = false;
                        // gedaan = 1;
                        // Letter.str.setLength(0);
                        
                    // }
                    // else{
                        
                        // Letter.str.setLength(0);
                        // BasicWorld.laadLetters = 1; 
                    // }
                // }
           // }
           // if (gedaan == 1){
               // if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   // Vragen.laadVraag(1);
                   // BasicWorld.laadLetters = 2;
                   // getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   // gevraagt = true;
                // }
               // if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   // if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        // gevraagt = false;
                        // gedaan = 2;
                        // Letter.str.setLength(0);
                    // }
                    // else {
                        // Letter.str.setLength(0);
                        // BasicWorld.laadLetters = 2;
                    // }
                // }
            // }
            // if (gedaan == 2){
               // if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   // Vragen.laadVraag(2);
                   // BasicWorld.laadLetters = 3;
                   // getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   // gevraagt = true;
                // }
               // if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   // if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        // gevraagt = false;
                        // gedaan = 3;
                        // Letter.str.setLength(0);
                    // }
                    // else {
                        // Letter.str.setLength(0);
                    // }
                // }
            // }
            // if (gedaan == 3){
               // if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   // Vragen.laadVraag(3);
                   // BasicWorld.laadLetters = 4;
                   // getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   // gevraagt = true;
                // }
               // if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   // if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        // gevraagt = false;
                        // gedaan = 4;
                        // Letter.str.setLength(0);
                    // }
                    // else {
                        // Letter.str.setLength(0);
                    // }
                // }
            // }
            // if (gedaan == 4){
               // if (gevraagt == false && Greenfoot.mouseClicked(this)){    
                   // Vragen.laadVraag(4);
                   // BasicWorld.laadLetters = 5;
                   // getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
                   // gevraagt = true;
                // }
               // if ( gevraagt == true && Greenfoot.mouseClicked(this)){
                   // if (Vragen.vragenlijst_1.get(Vragen.vraagNumber).antwoord.equals(Letter.str.toString())){
                        // gevraagt = false;
                        // gedaan = 5;
                        // Letter.str.setLength(0);
                    // }
                    // else {
                        // Letter.str.setLength(0);
                    // }
                // }
            // }
           
       }
    }
    
    
    
   
}
