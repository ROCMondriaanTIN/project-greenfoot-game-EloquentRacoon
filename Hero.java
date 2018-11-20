  
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    
    private String waterTile = ("liquidWater.png");
    private boolean drown;
    
    public String dir;
    public int y = 1;
    public String teller;
    
    public int score;
    

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1_front.png") ;
        
    }

    @Override
    public void act() {
        handleInput();
        worldBorder();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        for (Actor water : getIntersectingObjects(Water.class))
        {
            if (waterTile != null)
            {
                velocityY = 2;
                
            }
        }
        for (Hero hero : getWorld().getObjects(Hero.class))
        {
            if (hero == null)
            {
                getWorld().addObject(new Hero(), 30 ,655);
                
            }
        }
        
        
        getWorld().showText("Score is: "+ score,950, 50);
    }
    
    public boolean onGround() {
        if (drown == true){
            Actor under = getOneObjectAtOffset (0 , getImage().getHeight() / 2 , Tile.class);
        return under == null;
        }
        else {
            Actor under = getOneObjectAtOffset (0 , getImage().getHeight() / 2 , Tile.class);
            return under != null;
        }
    }
   
    public boolean inWater() {
        Actor ignore = getOneObjectAtOffset (0, getImage().getHeight() / 2 , Water.class);
        return ignore == null;
        
    }
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
           
           if (onGround() == true)
           {
               if (inWater() != true){
                   velocityY = 4;
                   drown = true;
                } else {
                    velocityY = -17; 
                }
            }
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -6;
            if (velocityY != 0 ) {
                setImage( "p1_jumpB.png" );  
                
                
            } else if (onGround() == true && velocityX < 0){
             animationLeft();
             
            }
            
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 6;   
            if (velocityY != 0 ) {
                setImage( "p1_jump.png" );
                   
            } else if (onGround() == true && velocityX > 0)
            {
             animationRight();
            } 
        } else if ( Greenfoot.isKeyDown("s")){
            setImage("p1_duck.png");
            
        } 
        else if (velocityY == 0 && velocityX == 0){
            setImage("p1_front.png");
            
            
        }
    }
    
    public void animationRight() {
        String dir = "images/p1/PNG/p1_walk";
        if (y != 12){
            teller = Integer.toString(y);
            y++;
        }
        else if ( y == 12){
            y = 1;
        }
        setImage( dir+teller+".png");
        

    }
    
    public void animationLeft() {
        String dir = "images/p1/PNG/p1_walkB";
        if (y != 12){
            teller = Integer.toString(y);
            y++;
        }
        else if ( y == 12){
            y = 1;
        }
        setImage( dir+teller+".png");
        

    }
    
    public void worldBorder(){
        if (isAtEdge() == true){
            
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
    
    public int getWidth() {
        return (getImage().getWidth() );
    }

    public int getHeight() {
        return (getImage().getHeight() );
    }

}
