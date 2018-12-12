import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2_Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_2_Main extends BasicWorld
{

    Hero hero;
    Liam liam;
    private boolean run = true;
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public Level_2_Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        this.setBackground("background3.png");
        

        int[][] map = {
        {39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,39,39,-1,39,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,39,39,-1,-1,-1,39,-1,-1,39,-1,-1,39,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,39,-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,-1,-1,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,39,39,39,39,-1,-1,39,39,39,39
        },{39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,39,39,39
        },{39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,50,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,39,39,39
        },{39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,51,-1,-1,-1,-1,-1,-1,-1,275,-1,39,39,39
        },{39,89,-1,-1,-1,-1,-1,45,-1,-1,49,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,56,56,56,56,56,39,39,39
        },{39,88,-1,45,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,88,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,88,-1,-1,-1,-1,-1,-1,-1,-1,39,39,102,-1,39,39,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,-1,-1,39
        },{39,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,39,-1,39,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,-1,-1,39
        },{39,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,39,39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,88,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,88,52,56,56,56,56,56,56,56,56,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,88,39,39,39,39,39,39,39,39,39,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{39,88,39,39,39,39,39,39,39,39,39,-1,104,-1,-1,56,56,56,56,56,56,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,49,39
        },{39,88,39,-1,-1,-1,-1,-1,39,39,39,-1,104,-1,-1,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,273,-1,-1,49,50,39
        },{39,88,-1,-1,-1,61,-1,-1,39,39,39,-1,104,-1,-1,-1,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,50,39,39
        },{39,88,-1,-1,-1,274,-1,-1,39,39,-1,-1,104,-1,-1,-1,39,-1,39,39,39,39,39,39,39,39,52,44,17,17,17,17,17,42,56,56,56,56,56,56,56,50,39,39,39,39,39,39
        },{39,88,39,39,39,39,39,39,39,39,-1,-1,104,-1,-1,-1,-1,-1,-1,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,39,39,39,39,39,39,39,39
        },{39,39,39,39,39,39,39,39,39,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39,39,39,39,-1,-1,39,39,39,39,39,39
        },{39,39,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,-1,-1,-1,-1,39,39,39,39
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,49,56,56,56,56,56,56,56,56,56,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39,39
        },{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,49,50,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,39
        },{-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,104,-1,-1,49,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,52,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39
        },{-1,-1,-1,-1,-1,-1,-1,271,-1,-1,-1,49,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,51,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,39
        },{-1,-1,-1,-1,-1,-1,49,56,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,51,-1,-1,-1,272,-1,-1,-1,-1,39
        },{56,56,56,56,56,56,50,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,56,56,56,51,-1,-1,39
        },{39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,52,56,56,39
        },};
    
        setMap(map);
        initWorld();
        
        addObject(new Liam() , 100 , 1975);
        
        
        Vragen v = new Vragen();
        // if (Liam.gedaan == 0){
            // Vraag Level_1_vraag1 = v.laadVraag(0);
        // }
        // if (Liam.gedaan == 1){
            // Vraag Level_1_vraag2 = v.laadVraag(1);
        // }
        // if (Liam.gedaan == 2){
            // Vraag Level_1_vraag3 = v.laadVraag(2);
        // }
        // if (Liam.gedaan == 3){
            // Vraag Level_1_vraag4 = v.laadVraag(3);
        // }
        // if (Liam.gedaan == 4){
            // Vraag Level_1_vraag5 = v.laadVraag(4);
        // }
        
        
    }
    
    public void startWorld() {
        super.startWorld();
        Level = true;
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
        
        
    }
}
