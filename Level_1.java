import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1 extends BasicWorld
{
        Hero hero;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(); 
        this.setBackground("grot.png");

        
        
        int[][] map = { 
            {39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39},{
39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,-1,39,39,39},{
39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,39,39,39,39,39,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,-1,39,39,39},{
39,39,39,-1,39,39,-1,-1,-1,39,39,39,39,-1,-1,-1,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,56,56,56,56,39,39,39},{
39,39,-1,-1,-1,39,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,-1,-1,-1,39,39,-1,39,39,39,39,39,39,39,39},{
39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,39,39,52,38,43,-1,-1,-1,-1,-1,-1,39,39,39,39,39,-1,-1,-1,39,39,39,-1,39,39,39,39,39,39,39,39},{
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,102,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,45,-1,39,39,39,-1,102,-1,-1,-1,39,39,39,-1,-1,39,39,39,39,39,39,39},{
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,104,-1,-1,-1,-1,39,39,-1,-1,39,39,39,39,39,39,-1},{
56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,104,-1,-1,-1,-1,39,-1,-1,-1,-1,39,39,39,39,-1,-1},{
39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,51,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,-1,-1},{
39,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,39,-1,-1,-1,47,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,52,-1,-1,-1,-1,-1,104,45,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,-1,-1},{
39,51,-1,-1,-1,-1,-1,-1,49,56,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,-1,-1},{
39,52,56,56,56,56,56,56,50,39,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,45,-1,104,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1},{
39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,56,51,-1,-1,-1,-1,-1,-1,-1,41,56,39,51,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1},{
39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,56,51,-1,-1,-1,-1,-1,-1,-1,39,52,51,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,102,-1,-1,-1,-1},{
39,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,-1,-1,-1,-1,-1,-1,52,56,51,-1,-1,-1,-1,-1,-1,39,52,51,-1,-1,104,-1,-1,-1,-1,169,-1,-1,-1,-1,-1,104,-1,-1,-1,-1},{
52,56,-1,-1,-1,56,56,56,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,52,-1,-1,104,41,56,51,-1,-1,-1,-1,49,56,43,104,-1,-1,-1,-1},{
-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,168,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,39,52,51,-1,49,56,50,39,-1,104,47,-1,-1,169},{
-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,51,-1,-1,-1,-1,-1,104,-1,-1,39,52,56,50,39,39,39,-1,104,-1,-1,-1,-1},{
51,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,50,39,-1,-1,41,56,56,51,-1,49,56,50,39,52,51,-1,-1,-1,168,104,-1,-1,39,39,39,39,39,-1,-1,-1,104,-1,-1,-1,47},{
39,-1,-1,-1,-1,41,56,50,39,-1,-1,-1,39,39,39,-1,-1,-1,-1,-1,52,56,50,39,39,39,39,52,51,-1,-1,-1,104,-1,-1,-1,39,39,39,39,-1,-1,-1,104,-1,-1,-1,-1},{
52,56,43,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,103,103,103,103,103,103,103,103,39,39,39,39,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,39,-1,-1,-1,47,104,-1,-1,-1,-1},{
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,45,104,-1,168,-1,-1,-1,39,-1,-1,-1,-1,104,-1,-1,47,-1},{
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,104,-1,-1,-1,-1},{
-1,-1,41,56,56,51,-1,-1,49,56,43,-1,-1,-1,39,52,56,43,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,45,-1,-1,-1,104,-1,45,-1,-1,-1,39,103,103,103,103,56,56,51,-1,126},{
-1,-1,-1,-1,-1,52,56,56,50,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,43,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,41,56,39,-1,-1,-1,-1,39,39,52,56,56},{
51,-1,-1,-1,-1,-1,-1,102,-1,39,-1,-1,45,-1,-1,-1,-1,-1,168,-1,49,50,39,-1,-1,-1,168,-1,-1,-1,45,-1,104,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,39,39,39,39},{
52,56,43,-1,-1,-1,-1,104,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,50,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,39,51,-1,-1,-1,-1,-1,39,39,39},{
-1,-1,-1,-1,168,-1,-1,104,-1,39,-1,-1,168,-1,-1,-1,168,-1,49,50,39,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,44,-1,-1,-1,-1,-1,-1,-1},{
-1,-1,128,-1,-1,-1,-1,104,-1,39,-1,-1,-1,-1,45,-1,-1,49,50,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{
-1,49,56,56,56,51,-1,104,49,39,-1,-1,-1,-1,-1,-1,49,50,39,39,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,46,48,-1,-1,-1,-1,-1,-1,-1,-1,-1},{
56,50,39,39,39,52,56,56,50,39,56,56,56,56,56,56,50,39,39,39,56,56,56,56,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

};
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
            addObject(hero,100, 2125);
        }
    }
    
    public void initWorld(){
        super.initWorld();
                // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera

        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 80, 1910);
        //addObject(hero,100, 1760);
        
        //addObject(new Enemy(), 1170, 410);
        

        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
    
    public void endWorld() {
        super.endWorld();
        removeObject(hero);
    }
        
    @Override
    public void act() {
        ce.update();
        if(Greenfoot.isKeyDown("r")) {
            LevelManager.getInstance().setLevel(2);
        }
    }
    
}

        
       