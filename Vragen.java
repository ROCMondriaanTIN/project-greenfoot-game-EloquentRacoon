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
    public static ArrayList<Vraag> vragenlijst_2 = new ArrayList<Vraag>();
    
    
    
    static int vraagNumber;
   
    
    
    public Vragen(){
        vragenlijst_1.add(new Vraag("Wat is auto in het Engels?", "car"));
        vragenlijst_1.add(new Vraag("Wat is fiets in het Engels?", "bike"));
        vragenlijst_1.add(new Vraag("Wat is boot in het Engels?", "boat"));
        vragenlijst_1.add(new Vraag("Wat is trein in het Engels?", "train")); 
        vragenlijst_1.add(new Vraag("Wat is vliegtuig in het Engels?", "airplane"));
        
        vragenlijst_2.add(new Vraag("Wat is rood in het Engels?", "red"));
        vragenlijst_2.add(new Vraag("",""));
        vragenlijst_2.add(new Vraag("",""));
        vragenlijst_2.add(new Vraag("",""));
        vragenlijst_2.add(new Vraag("",""));
    }

    /**
     * Act - do whatever the Vragen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         
    }    
    
    public static Vraag laadVraag(int vraagNummer){
            // System.out.println(vraagNummer);
            vraagNumber = vraagNummer;
            return vragenlijst_1.get(vraagNummer); 
            
           
    }
    
    
    
    
    
}
