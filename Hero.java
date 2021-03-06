  
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    
    Hero hero;
    
    
    private final double gravity;
    private final double acc;
    private final double drag;
    
    private String waterTile = ("liquidWater.png");
    public static boolean ignoreGround;
    
    private String dir;
    private int y = 1;
    private String teller;
    
    
    public int score = 0;
    public boolean torch;
    
    
    
    //public static int number;
    

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
        
                
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(enemy);
                break;
            }
        }
        for (Actor water : getIntersectingObjects(Water.class))
        {
            if (waterTile != null)
            {
                velocityY = 2;
                break;
            }
        }
        
        for (Actor climbing : getIntersectingObjects(Climbing.class)) {
            if (climbing != null && Greenfoot.isKeyDown("w")) {
                velocityY = -5; 
                break;
            }
        }
        for (Actor damage : getIntersectingObjects(Damaging.class)) {
            if (damage != null) {
                Greenfoot.setWorld(new MyWorld());
                break;
            }
        }
        
        if (Greenfoot.isKeyDown("escape")){
                Greenfoot.setWorld(new MyWorld());
        }
        if (Liam.update == true){
            getWorld().showText(Letter.str.toString(),100, 70); 
            if (Wereld.world == 1){
                getWorld().showText(Vragen.vragenlijst_1.get(Vragen.vraagNumber).vraag,200, 50);
            }
            else if (Wereld.world == 2){
                getWorld().showText(Vragen.vragenlijst_2.get(Vragen.vraagNumber).vraag,200, 50);
            }
            
           }
        if (isAtEdge() && BasicWorld.Level == false){
            BasicWorld.hurt.play();
            BasicWorld.hurt.setVolume(30);
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public boolean onGround() {
        if (ignoreGround == true){
            return  false;
        }
        else {
            Actor under = getOneObjectAtOffset (0 , getImage().getHeight() / 2 , Tile.class);
            Tile tile = (Tile) under;
            if(tile != null) {
                if(tile instanceof Water) {
                        
                        ignoreGround = true;
                        return false;
                }  
                if (tile.isSolid){
                        return true;
                    }
            }
            
            return false;
        }
    }
 
    public boolean inWater() {
        Actor ignore = getOneObjectAtOffset (0, getImage().getHeight() / 2 , Water.class);
        
        return ignore == null;
    }
        
    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
           if (velocityY != 0){
               setImage( "p1_jump.png" );
            }
           if (onGround() == true)
           {
               if (inWater() == false){
                   velocityY = 4;
                   ignoreGround = true;
                 
                } else {
                    velocityY = -16;
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
    
    
    public void heroCheck(){
         for(Actor player: getWorld().getObjects(Hero.class)) {
                if(player != null) {
                    getWorld().removeObject(this);
                 }        
         }
         if(hero != null) {
                    getWorld().addObject(hero , 30 ,30 );
                 }
                 
                 
    }
    
    public int getWidth() {
        return (getImage().getWidth() );
    }

    public int getHeight() {
        return (getImage().getHeight() );
    }

}
