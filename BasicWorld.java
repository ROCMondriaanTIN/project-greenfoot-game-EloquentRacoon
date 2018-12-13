import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicWorld extends World
{
    Camera camera;
    TileEngine te;
    CollisionEngine ce;
    int[][] map;
    static boolean initialized = false;
    static int laadLetters = 0;
    static boolean Level = false;
    static boolean isPlaying;
    
    public static GreenfootSound Level1 = new GreenfootSound("Level1.mp3");
    public static GreenfootSound Level2 = new GreenfootSound("Level2.mp3");
    public static GreenfootSound hurt = new GreenfootSound("hurt.mp3");
    public static GreenfootSound item = new GreenfootSound("letter.mp3");
    public static GreenfootSound liamFout = new GreenfootSound("deny.mp3");
    public static GreenfootSound liamGoed = new GreenfootSound("accept.mp3");
    public static GreenfootSound liamVragen = new GreenfootSound("vragen.mp3");
    
    
    
    
    /**
     * Constructor for objects of class BasicWorld.
     * 
     */
    public BasicWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1, false); 
        
        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        te = new TileEngine(this, 70, 70);
        
        
        
        initWorld();
    }
    
    public void startWorld() {
        if(map != null) {        
            te.setMap(map);
            TileEngine.MAP_HEIGHT = this.map.length;
            TileEngine.MAP_WIDTH = this.map[0].length;
            Hero.ignoreGround = false;
            
        }
        
    }
    
    public void setMap(int [][] map) {
        this.map = map;
        if(initialized) {
            te.setMap(this.map);
            
        }
    }
    
    public void initWorld() {
        
        initialized = true;
        camera = new Camera(te);
        ce = new CollisionEngine(te, camera);
        System.out.println("Init!" + this.getClass().getName());
    }
    
    public void endWorld() {
        te.clearTilesWorld();
        
    }
    
    
    
    
}
