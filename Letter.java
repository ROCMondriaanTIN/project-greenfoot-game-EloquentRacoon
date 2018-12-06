import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Mover
{
    /**
     * Act - do whatever the Letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        applyVelocity();
        
        if (Greenfoot.mouseClicked(this)){
            
            Schrijven(); 
            
            getWorld().showText(str.toString(),100, 100);
            getWorld().removeObject(this);    
            
                
            System.out.println(Letter.str);
        }
        
    }    
    public static StringBuffer str = new StringBuffer("");
    char letter;
    public Letter(char y){
           setImage("Letters/"+y+".png");
           getImage().scale(60 , 60);
           this.letter = y;
           
           
        
           
           
           
           
           
    }
    public void Schrijven(){
          switch(letter){
                   case 0: str.setLength(0);
                   break;
                   case 'a': str.append("a");
                   break;
                   case 'b': str.append("b");
                   break;
                   case 'c': str.append("c");
                   break;
                   case 'd': str.append("d");
                   break;
                   case 'e': str.append("e");
                   break;
                   case 'f': str.append("f");
                   break;
                   case 'g': str.append("g");
                   break;
                   case 'h': str.append("h");
                   break;
                   case 'i': str.append("i");
                   break;
                   case 'j': str.append("j");
                   break;
                   case 'k': str.append("k");
                   break;
                   case 'l': str.append("l");
                   break;
                   case 'm': str.append("m");
                   break;
                   case 'n': str.append("n");
                   break;
                   case 'o': str.append("o");
                   break;
                   case 'p': str.append("p");
                   break;
                   case 'q': str.append("q");
                   break;
                   case 'r': str.append("r");
                   break;
                   case 's': str.append("s");
                   break; 
                   case 't': str.append("t");
                   break; 
                   case 'u': str.append("u");
                   break; 
                   case 'v': str.append("v");
                   break; 
                   case 'w': str.append("w");
                   break; 
                   case 'x': str.append("x");
                   break; 
                   case 'y': str.append("y");
                   break;
                   case 'z': str.append("z");
                   break;
               }
    }
}
