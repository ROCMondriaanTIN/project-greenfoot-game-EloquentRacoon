  
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

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.1.png");
    }

    @Override
    public void act() {
        handleInput();
        
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
        for (Actor water : getIntersectingObjects(TileInteraction.class))
        {
            if (waterTile != null)
            {
                velocityY = 0;
                
            }
        }
    }
    
    
    
    public boolean onGround() {
        Actor under = getOneObjectAtOffset (0 , getImage().getHeight() / 2 , Tile.class);
        return under != null;
    }
   
    public boolean ignoreTile() {
        Actor ignore = getOneObjectAtOffset (0, getImage().getHeight() / 2 , TileInteraction.class);
        return ignore == null;
    }
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("w") && onGround() == true) {
           if (ignoreTile() != true){
               velocityY = 2;
            }
           else{velocityY = -17; }
        }

        if (Greenfoot.isKeyDown("a")) {
           
            velocityX = -4;
            
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 4;
        }
    }

    public int getWidth() {
        return (getImage().getWidth() );
    }

    public int getHeight() {
        return (getImage().getHeight() );
    }
}
