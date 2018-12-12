import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1_Main extends BasicWorld
{
    
    
    Hero hero;
    Liam liam;
    private boolean run = true;
    boolean yeet = true;
    
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public Level_1_Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        this.setBackground("background1.png");
        

        int[][] map = {
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,186,186,187,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,186,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,185,186,-1,-1,-1,-1,-1,-1,187,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,82,82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,187,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,78,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,186,-1,-1,-1,-1,-1,-1,-1,187,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,187,185,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,82,76,65,65,65,65,65,65,65,65,78,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,-1,-1,-1
        },{186,186,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,78,82,82,82,82,82,82,82,69,-1,-1,-1,-1,-1,186,187,-1,-1,-1,-1,-1,127,-1,-1,-1,-1,-1,268,-1,-1,-1,-1,-1,-1,-1,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65
        },{-1,-1,-1,75,82,82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,-1,65,65,65,65,-1,65,65,65,65,65,-1,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65
        },{-1,-1,75,76,65,65,65,78,82,82,77,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,75,82,82,65,65,65,65,65,-1,-1,65,65,65,65,-1,-1,65,65,65,65,-1,-1,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,-1,102,-1,-1,65,65,65,65,65,65,65
        },{82,82,76,65,65,65,65,65,65,65,78,82,82,77,-1,-1,269,-1,-1,75,82,82,76,65,65,65,65,65,-1,-1,-1,-1,-1,65,65,65,-1,-1,65,65,65,65,-1,-1,-1,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,-1,-1,-1,-1,104,-1,-1,-1,65,65,65,65,65,65
        },{65,65,65,65,65,65,65,65,65,65,65,65,65,78,82,82,82,82,82,76,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,65,65,65,65,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,-1,-1,-1,-1,-1,104,-1,-1,-1,65,65,65,65,65,65
        },{65,65,65,65,65,65,65,65,-1,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,65,65,65,65,65
        },{65,65,65,65,65,65,65,-1,-1,-1,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,77,-1,-1,-1,-1,104,-1,-1,-1,-1,65,65,65,65,65
        },{65,65,65,-1,-1,65,-1,-1,-1,-1,65,65,-1,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,78,82,82,82,70,104,-1,-1,-1,-1,-1,65,65,65,65
        },{65,65,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,-1,104,-1,-1,-1,-1,-1,-1,65,65,65
        },{65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65
        },{65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,267,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65
        },{65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,78,70,17,17,17,17,17,17,17,17,68,82,82,76,65,65,65,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,102,65
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,89,-1,-1,75,82,82,82,82,76,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,89,-1,-1,-1,-1,-1,-1,104,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,67,82,76,65,65,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,65,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,104,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,104,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,104,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,88,-1,-1,-1,-1,-1,-1,104,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,266,-1,88,-1,-1,-1,-1,-1,-1,104,-1
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,82,82,77,-1,-1,-1,-1,104,-1
        },{82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,82,82,76,65,65,65,65,78,77,-1,-1,-1,104,-1
        },{65,65,78,82,82,82,82,82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,78,77,-1,-1,104,-1
        },{65,65,65,65,65,65,65,65,65,78,82,82,82,77,-1,-1,-1,-1,-1,-1,-1,265,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,82,82,82,82,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,82,76,65,65,65,65,65,65,65,65,65,65,65,65,78,77,-1,104,-1
        },{65,65,65,65,65,65,65,65,65,65,65,65,65,78,82,77,-1,-1,75,82,82,82,82,82,82,82,82,82,82,82,82,77,-1,-1,75,82,82,82,82,82,82,82,76,65,65,65,65,65,78,82,82,82,82,82,82,77,-1,-1,-1,75,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,78,82,82,82
        },{65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,78,82,82,76,65,65,65,65,65,65,65,65,65,65,65,65,78,82,82,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,78,82,82,82,76,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65
        },};
        
        setMap(map);
        initWorld();
        
        
        addObject(new Liam() , 80 , 1945);
        
        
        Vragen v = new Vragen();
        
        
    }
    
    public void startWorld() {
        super.startWorld();
        Level = true;
        if (!Level1.isPlaying()){
            Level1.play();
        }
        
        
        if (run == true){
            run = false;
                for(Actor hero: getObjects(Hero.class)) {
                if(hero != null) {
                    removeObject(hero);
                }
            }
        }
        if(hero != null) {
                addObject(hero,30, 1975);
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
        //Vragen v = new Vragen();
        
    }
        
    @Override
    public void act() {
        ce.update();
        
        if (Greenfoot.isKeyDown("x")){
            laadLetters = 5 ; 
            
            
        }
        if (Greenfoot.isKeyDown("4")){
            LevelManager.getInstance().setLevel(7);
            Greenfoot.playSound("Level2.mp3");
        }
    }
    
}
    


