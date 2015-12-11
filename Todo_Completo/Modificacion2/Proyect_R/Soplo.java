import greenfoot.*;

/**
 * Write a description of class Soplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soplo extends Scrolleable
{   int lx,ly;
    int mop;
    /**
     * Act - do whatever the Soplo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   lx=getX();
        ly=getY();
        setLocation(lx-=2,getY());
    }    
}
