import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_2_3 extends BasicWorld
{

    Hero hero;
    /**
     * Constructor for objects of class Level_2.
     * 
     */
    public Level_2_3()
    {
          super();
        this.setBackground("background3.png");

        int [][] map = {
        {39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,-1,-1,-1,-1,-1,-1,-1,-1,49,50,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39
        },{39,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39
        },{39,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,-1,-1,-1,-1,49,56,56,50,39,39,39,-1,-1,-1,41,56,56,56,56,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,51,-1,-1,-1,-1,-1,-1,39
        },{39,-1,-1,-1,49,50,39,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,52,56,56,56,43,-1,-1,39
        },{52,43,-1,-1,39,39,39,-1,-1,-1,39,52,43,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,-1,-1,-1,39,39,39,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,-1,-1,-1,39,39,39,-1,-1,-1,39,39,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,56,56,56,56,56,56,56,51,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,41,50
        },{39,-1,-1,41,50,39,52,51,-1,-1,-1,39,-1,-1,-1,41,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,-1,-1,-1,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,52,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,-1,-1,-1,-1,39,39,39,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{52,43,-1,-1,-1,39,39,39,39,-1,-1,-1,-1,56,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,56,56,56,56,39,39,39,-1,-1,-1,41,56,56,56,56,56,56,56,56,56,39
        },{39,-1,-1,-1,-1,-1,39,39,52,51,-1,-1,-1,39,-1,-1,-1,-1,49,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,52,43,-1,-1,-1,39,39,39,39,39,39,39,39,39,39
        },{39,-1,-1,-1,-1,-1,-1,39,39,52,-1,-1,-1,52,43,-1,-1,49,50,39,39,39,39,-1,-1,39,-1,-1,-1,-1,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1,39,39,39
        },{52,56,56,56,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39
        },{39,39,39,39,-1,-1,-1,-1,39,52,51,-1,-1,-1,-1,-1,41,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,49,56,51,-1,-1,-1,-1,-1,-1,-1,-1,39,39
        },{39,39,39,-1,-1,-1,56,56,50,39,52,56,51,-1,-1,-1,-1,39,-1,-1,-1,56,56,56,56,56,56,56,56,56,56,-1,-1,-1,-1,-1,50,39,52,56,56,56,56,51,-1,-1,-1,-1,-1
        },{39,39,39,-1,-1,-1,39,39,39,39,39,39,52,56,-1,-1,-1,52,43,-1,-1,39,39,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,49,39,39,39,-1,-1,-1,-1,52,51,-1,-1,-1,-1
        },{39,39,-1,-1,-1,56,50,39,39,39,39,39,39,52,51,-1,-1,39,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,49,50,-1,-1,-1,-1,-1,-1,-1,39,52,51,-1,-1,-1
        },{39,39,-1,-1,-1,39,39,39,39,39,39,39,39,39,52,-1,-1,39,-1,-1,-1,39,39,-1,-1,-1,56,-1,-1,39,39,-1,-1,-1,50,39,-1,-1,-1,-1,-1,-1,-1,39,39,52,51,-1,-1
        },{39,-1,-1,-1,41,50,39,39,-1,-1,-1,-1,-1,-1,39,56,56,39,-1,-1,41,50,52,43,-1,-1,39,-1,-1,39,39,-1,-1,49,50,-1,-1,-1,-1,49,56,-1,-1,39,39,39,52,-1,-1
        },{39,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1,-1,39,39,-1,-1,-1,39,-1,-1,39,39,-1,-1,50,-1,-1,-1,49,56,50,39,-1,-1,39,39,-1,-1,-1,-1
        },{39,-1,-1,-1,-1,-1,39,39,56,56,56,51,-1,-1,-1,-1,39,39,-1,-1,-1,39,39,-1,-1,-1,39,-1,-1,39,39,-1,-1,39,-1,-1,-1,50,39,39,39,-1,-1,39,39,-1,-1,-1,-1
        },{39,-1,41,56,56,56,50,39,39,39,39,52,43,-1,-1,-1,39,52,43,-1,-1,39,39,-1,-1,41,50,-1,41,50,39,-1,41,50,-1,41,56,50,39,39,39,-1,41,50,39,-1,-1,41,56
        },{39,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{39,270,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{52,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56
        },};
    
        setMap(map);
        initWorld();
    }
    
    public void startWorld() {
        super.startWorld();
        Level = false;
        
        for(Actor actor: getObjects(Hero.class)) {
            if(actor != null) {
                removeObject(actor);
            }
        }
        if(hero != null) {
            addObject(hero,100, 2155);
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
        if (laadLetters == 3){
            addObject(new Letter('p'), 200, 825);
            addObject(new Letter('u'), 2850, 1625);
            addObject(new Letter('r'), 1900, 750);
            addObject(new Letter('p'), 1850, 1600);
            addObject(new Letter('l'), 1150, 1625);
            addObject(new Letter('e'), 3000, 1000);
            laadLetters = 0;
        }
    }
    @Override
    public void act() {
        ce.update();
        spawnLetters();
        if (BasicWorld.Level1.isPlaying() == true){
            BasicWorld.Level1.stop();

        }
        if (BasicWorld.Level2.isPlaying() == false){
            BasicWorld.Level2.play();
        }
    }
}
