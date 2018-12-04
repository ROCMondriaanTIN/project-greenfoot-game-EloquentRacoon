import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Vragen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vragen extends Actor
{
    public ArrayList<Vraag> vragenlijst = new ArrayList<Vraag>();
    boolean firstact = true;

    /**
     * Act - do whatever the Vragen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
            vraagToevoegen();
            if (firstact = true){
            firstact = false;
                for (int i = 0; i < vragenlijst.size(); i++){
                for (int x = 0; x < vragenlijst.get(i).antwoord.length(); x++){
                    char y = vragenlijst.get(i).antwoord.charAt(x);
                    for (int z = 0; z < vragenlijst.get(i).antwoord.length(); z++){
                        //characterz = y; 
                    }
                }
            }
        }
    }    
    public void vraagToevoegen(){
        
            Vraag vraag1 = new Vraag("Wat is auto in het Engels?", "car");
            Vraag vraag2 = new Vraag("Wat is fiets in het Engels?", "bike");
            Vraag vraag3 = new Vraag("Wat is vliegtuig in het Engels?", "airplane");
            
            vragenlijst.add(vraag1);
            vragenlijst.add(vraag2);
            vragenlijst.add(vraag3);
    }
    
    
    
}
