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
            BasicWorld.item.play();
            
            Schrijven(); 
            
            
            getWorld().removeObject(this);    
  
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
                   case '0': str.append("0");
                   break;
                   case '1': str.append("1");
                   break;
                   case '2': str.append("2");
                   break;
                   case '3': str.append("3");
                   break;
                   case '4': str.append("4");
                   break;
                   case '5': str.append("5");
                   break;
                   case '6': str.append("6");
                   break;
                   case '7': str.append("7");
                   break;
                   case '8': str.append("8");
                   break;
                   case '9': str.append("9");
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
