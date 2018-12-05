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
    public static ArrayList<Vraag> vragenlijst_1 = new ArrayList<Vraag>();
    boolean firstact = true;
    

    /**
     * Act - do whatever the Vragen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public static void vragenMaken(){
        vragenlijst_1.add(new Vraag("Wat is auto in het Engels?", "car"));
        vragenlijst_1.add(new Vraag("Wat is fiets in het Engels?", "bike"));
        vragenlijst_1.add(new Vraag("Wat is vliegtuig in het Engels?", "airplane"));

    }
    public static void laadVraag(int vraagNummer){
            switch(vraagNummer){
                case 0:
                    for (int letterNummer =0; letterNummer < vragenlijst_1.get(vraagNummer).antwoord.length(); letterNummer ++){
                        char y = vragenlijst_1.get(vraagNummer).antwoord.charAt(letterNummer);
                        System.out.println(y);
                    }   
                    break;
                
                case 1:
                    for (int letterNummer =0; letterNummer < vragenlijst_1.get(vraagNummer).antwoord.length(); letterNummer ++){
                        char y = vragenlijst_1.get(vraagNummer).antwoord.charAt(letterNummer);
                        System.out.println(y);
                    } 
                    break;
                    
                case 2:
                    for (int letterNummer =0; letterNummer < vragenlijst_1.get(vraagNummer).antwoord.length(); letterNummer ++){
                        char y = vragenlijst_1.get(vraagNummer).antwoord.charAt(letterNummer);
                        System.out.println(y);
                    } 
                    break;
                    
                default:
                    System.out.println("er is geen vraag"); 
            }
    }
    
    
    
    
    
}
