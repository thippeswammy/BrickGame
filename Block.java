import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Block()
    {
        getImage().setColor(Color.BLUE);
        getImage().fillRect(0,0,60,20);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
