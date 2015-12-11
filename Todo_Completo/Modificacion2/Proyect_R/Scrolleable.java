import greenfoot.*;

/**
 * Write a description of class Scrolleable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scrolleable extends Actor
{
    /**
     * Act - do whatever the Scrolleable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
}
