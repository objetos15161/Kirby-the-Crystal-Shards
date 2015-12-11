import greenfoot.*;

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Scrolleable
{   int modle;
    int corx,cory;
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       corx=getX();
       cory=getY();
       setLocation(corx-=5,getY()); 
    }    
}
