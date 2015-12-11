import greenfoot.*;

/**
 * Write a description of class Manzana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manzana extends Scrolleable
{   int lotx;
    int loty;
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lotx=getX();
        loty=getY();
        setLocation(lotx-=2,getY());
    }    
}
