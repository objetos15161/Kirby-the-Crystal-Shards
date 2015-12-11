import greenfoot.*;

/**
 * Write a description of class Flama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flama extends Lumbre
{    public int dx;
     public int model;
    /**
     * Act - do whatever the Flama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      getY();
       dx=getX();
         
       if(model%10==0)
            setLocation(dx-=1,getY());   
    }
    
 
}
