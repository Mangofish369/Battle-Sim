import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleWorld extends World
{
    private String hp; 
    private SuperTextBox statBar; 
    private SuperTextBox testBox; 
    private Font sans_serif = new Font(24); 
    private Font boringFont = new Font ("Times New Roman", false, false, 18);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BattleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 800, 1); 
        hp = "2111111";
        
        statBar = new SuperTextBox(hp, sans_serif, 200);
        addObject(statBar, 100,200);
        
        testBox = new SuperTextBox(hp, Color.BLACK, Color.WHITE, boringFont, true, 500, 3, Color.YELLOW);
        addObject(testBox, 200,400);
    }
    
}
