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
    ArrayList<Vraag> vragenlijst = new ArrayList<Vraag>();
    
    
    
    public String vraag;
    public String antwoord;
    
    private int currentVraagNumber;
    /**
     * Act - do whatever the Vragen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            vragenlijst.add(new Vraag("wat is lekker", "bami"));
            
    }    
    
    
}
