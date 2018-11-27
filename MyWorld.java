
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends BasicWorld {
    
    
    Hero hero;
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        super();
        this.setBackground("grot.png");

        int [][] map = {
{39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56 ,43,-1,-1,-1,-1,-1,-1,-1,-1
},{52,47,48,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,39,39,39,-1,-1,-1,-1,45,-1,-1,-1,-1,-1
},{39,-1,-1,-1,-1,-1,-1,-1,41,56,56,56,51,-1,49,50,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,45,-1,-1,-1,-1,39,39,52,56,50,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1
},{56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,56,-1,-1,-1,-1,-1,-1,-1
},{39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,39,95,95,95,95,95,95,95
},{39,39,52,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,93,93,93,93,93,93,93
},{39,39,39,39,52,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,93,93,93,93,93,93
},{39,39,39,39,39,39,39,52,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,39,93,93,93,93,93,93
},{39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,56,56,56,56,56,50,39,39,39,39,39,93,93,93,93,93
}};
    

    }
    
    public void startWorld() {
        super.startWorld();
        for(Actor actor: getObjects(Hero.class)) {
            if(actor != null) {
                removeObject(actor);
            }
        }
        addObject(hero,100, 655);
    }
    
    @Override
    public void initWorld() {
        super.initWorld();
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 30, 655);
        addObject(new Enemy(), 200, 610);
        
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
    }
}
