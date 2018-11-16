
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends World {

    private CollisionEngine ce;
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1, false);
        this.setBackground("Level een.png");

        int[][] map = { 
{39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,57,43,-1,-1,-1,-1,-1,-1,-1,-1
},{52,47,48,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,39,39,39,-1,-1,-1,-1,45,-1,-1,-1,-1,-1
},{39,-1,-1,-1,-1,-1,-1,-1,41,56,56,56,51,-1,49,50,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,45,-1,-1,-1,-1,39,39,52,56,50,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1
},{56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,49,95,95,95,95,95,95,95
},{39,39,52,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,93,93,93,93,93,93,93
},{39,39,39,39,52,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,93,93,93,93,93,93
},{39,39,39,39,39,39,39,52,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,39,93,93,93,93,93,93
},{39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,56,56,56,56,56,50,39,39,39,39,39,93,93,93,93,93
},};



        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 70, 70, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 80, 655);
        addObject(hero, 30, 655);
        //addObject(new Enemy(), 1170, 410);
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
        
        
        
    }
        
    @Override
    public void act() {
        ce.update();
    }
}
