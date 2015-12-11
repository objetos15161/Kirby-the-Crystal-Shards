import greenfoot.*;

/**
 * Write a description of class moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moneda extends Scrolleable
{   int dv,dw;
    /**
     * Act - do whatever the moneda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        dv=getX();
        dw=getY();
        setLocation(dv,dw+=3);
    }    
    public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
}
