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
        startWorld();

    }
    
    public void startWorld() {
        if(map != null) {        
            te.setMap(map);
            TileEngine.MAP_HEIGHT = this.map.length;
            TileEngine.MAP_WIDTH = this.map[0].length;
            
        }
        
    }
    
    public void setMap(int [][] map) {
        this.map = map;
        if(initialized) {
            te.setMap(this.map);
            
        }
    }
    
    public void initWorld() {
        camera = new Camera(te);
        ce = new CollisionEngine(te, camera);
        initialized = true;
        
        System.out.println("Init!" + this.getClass().getName());
    }
    
    public void endWorld() {
        te.clearTilesWorld();
        
    }
}
