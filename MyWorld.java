import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Player Player=new Player();
    public World myWorld;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
     {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        Prepare();
    }

    public void Prepare()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(Player,300,550);
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<4;j++)
            {
                addObject(new Block(),50+70*i,30+30*j);
            }
        }
        Ball Ball = new Ball(Player,this);
        addObject(Ball,300,400);
    }
}
