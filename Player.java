import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    
    {
        getImage().setColor(Color.RED);
        getImage().fillRect(0,0,200,200 );
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")) 
           setLocation(getX() +4,getY());
         if(Greenfoot.isKeyDown("left")) 
           setLocation(getX() -4,getY());  
    }    
}
