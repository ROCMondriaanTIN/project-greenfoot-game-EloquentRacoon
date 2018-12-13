import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1_2 extends BasicWorld
{
    Hero hero;
    /**
     * Constructor for objects of class Level_2.
     * 
     */
    public Level_1_2()
    {
          super();
        this.setBackground("background1.png");
        
        int [][] map = {
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,65,65,65,65,65,65,65,65,65,65,65
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,65,65,65,65,65,65,65,65,65,65
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,65,65,65,102,-1,-1,65,65,65
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,-1,-1,104,-1,-1,-1,65,65
        },{82,82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,186,186,186,186,186,-1,-1,-1,-1,-1,-1,65,-1,-1,104,-1,-1,-1,65,65
        },{65,65,65,78,82,77,-1,-1,-1,-1,-1,-1,89,-1,-1,-1,-1,186,-1,-1,-1,186,-1,-1,-1,186,-1,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,104,-1,-1,-1,65,65
        },{-1,65,65,65,65,78,82,82,82,82,82,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,104,-1,-1,-1,65,65
        },{-1,-1,-1,65,65,65,65,65,65,65,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,65
        },{-1,-1,-1,-1,-1,65,65,65,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,65
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,65
        },{-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,71,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,65
        },{-1,264,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,95,95,95,95,95,95,95,95,95,82,77,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,65
        },{82,82,82,82,77,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,75,82,82,82,82,82,76,65,93,93,93,93,93,93,93,93,93,65,78,82,82,82,82,82,82,82,77,-1,-1,-1,-1,65
        },{65,65,65,65,78,82,82,82,82,82,82,82,82,82,82,82,76,65,65,65,65,65,65,65,93,93,93,93,93,93,93,93,93,65,65,65,65,65,65,65,65,65,78,77,-1,-1,-1,65
        },{65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,93,93,93,93,93,93,93,93,93,65,65,65,65,65,65,65,65,65,65,78,82,82,82,65
        },{65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,93,93,93,93,93,93,93,93,93,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65
        },};
    
        setMap(map);
        initWorld();
    }
    
    public void startWorld() {
        super.startWorld();
        Level = false;
        isPlaying = true;
        for(Actor actor: getObjects(Hero.class)) {
            if(actor != null) {
                removeObject(actor);
            }
        }
        if(hero != null) {
            addObject(hero,100, 755);
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
        
        //addObject(new Enemy(), 200, 610);
        
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
    public void spawnLetters(){
        if (laadLetters == 2){
            addObject(new Letter('b'), 150, 175);
            addObject(new Letter('i'), 2860, 250);
            addObject(new Letter('k'), 2200, 150);
            addObject(new Letter('e'), 500, 725);
            laadLetters = 0;
        }
    }
    @Override
    public void act() {
        ce.update();
        spawnLetters();
        if (BasicWorld.Level1.isPlaying() == false){
            BasicWorld.Level1.play();

        }
        if (BasicWorld.Level2.isPlaying() == true){
            BasicWorld.Level2.stop();

        }
    }
    
}
