import greenfoot.*;

/**
 * Write a description of class gota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gota extends Scrolleable
{   int xd;
    int yd;
    /**
     * Act - do whatever the gota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        xd=getX();
        yd=getY();
        setLocation(xd,yd+=3);
        
        
    }
   public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
    
}
