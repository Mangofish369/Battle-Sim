import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class updateText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class updateText extends Actor
{
    private String attack;
    private int attackPoints = 100;
    public updateText(){
        
    }
    public void act()
    {
        attack = Integer.toString(attackPoints);
    }
}
