import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_Tutorial extends BasicWorld
{

    Hero hero;
    /**
     * Constructor for objects of class Level_2.
     * 
     */
    public Level_Tutorial()
    {
          super();
        this.setBackground("bg.png");

        int [][] map = {
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,89,-1,-1,-1,-1,241,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,67,70,17,17,17,17,17,68,82,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,102,184,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,104,184,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
},{-1,60,128,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,225,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1
},{82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,95,95,95,95,95,95,95,82,82,82,82,222,222,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82
},{65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,93,93,93,93,93,93,93,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65
},};

    
    setMap(map);
    initWorld();
    }
    
    public void startWorld() {
        super.startWorld();
        for(Actor actor: getObjects(Hero.class)) {
            if(actor != null) {
                removeObject(actor);
            }
        }
        if(hero != null) {
            addObject(hero,30, 905);
        }
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
        
        
        
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
        if(Greenfoot.isKeyDown("r")) {
            LevelManager.getInstance().setLevel(0);
        }
    }
}
