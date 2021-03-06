import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_2_2 extends BasicWorld
{

    Hero hero;
    /**
     * Constructor for objects of class Level_2.
     * 
     */
    public Level_2_2()
    {
          super();
        this.setBackground("background3.png");
        getBackground().scale(1200, 1200);
        int [][] map = {
        {39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,39,39,39,39,-1,39,39,39,39,39,39,39
        },{-1,-1,-1,102,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,39,39,39,39,39,39
        },{226,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39
        },{45,45,-1,104,-1,-1,45,-1,-1,-1,45,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,45,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,45,-1,45,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39
        },{-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,45,-1,-1,-1,-1,-1,-1,39,39,39
        },{-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39
        },{-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,39,-1
        },{-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,168,-1,-1,168,-1,-1,168,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,49,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,51,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,45,168,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,168,-1,-1,-1,-1,-1,49,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,51,-1,168,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,49,56,56,56,56
        },{-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,168,-1,49,56,56,56,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,39,39
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,52,56,51,-1,-1,168,-1,-1,-1,49,56,50,39,39,39,39,39
        },{-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,102,-1,-1,-1,102,-1,-1,-1,39,39,39,39,39,39,39,39,39,52,56,51,-1,-1,49,56,50,39,39,39,39,39,-1,102
        },{-1,-1,-1,-1,-1,41,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,104,-1,-1,-1,104,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,52,56,56,50,39,39,39,39,39,-1,-1,-1,104
        },{-1,45,-1,168,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,104,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,-1,104
        },{-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,102,-1,-1,104,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,59,-1,-1,104
        },{-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,104,-1,-1,104,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,-1,58,-1,-1,104
        },{45,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,-1,39,39,39,39,102,-1,-1,104,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,104
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,104,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,-1,39,39,39,39,39,39,104
        },{-1,45,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1,-1,-1,-1,-1,39,39,39,39,39,104
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,104
        },{-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,104
        },{-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,104
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,168,-1,-1,-1,168,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,168,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,168,-1,-1,49,56,56,56,56,56,51,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104
        },{-1,61,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,49,56,50,39,39,39,39,39,52,51,-1,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,104
        },{-1,270,-1,-1,-1,-1,49,56,56,56,56,56,56,56,50,39,39,39,39,39,39,39,52,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,50,39,39,39,39,39,39,39,39,52,56,51,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,104
        },{56,56,56,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,95,95,95,95,95,95,95,95,95,95,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,51,-1,-1,-1,-1,-1,-1,104
        },{39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,93,93,93,93,93,93,93,93,93,93,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,56,56,56
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
        if (laadLetters == 2){
            addObject(new Letter('g'), 400 , 1650);
            addObject(new Letter('r'), 3700, 925);
            addObject(new Letter('e'), 4200, 2025);
            addObject(new Letter('e'), 2400, 1225);
            addObject(new Letter('n'), 2350, 600);
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
