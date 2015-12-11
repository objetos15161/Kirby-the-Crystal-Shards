import greenfoot.*;

/**
 * Write a description of class Fantasmin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fantasmin extends Scrolleable
{
    GreenfootImage f2;
    int x,y;
    public Fantasmin(){
        f2=new GreenfootImage("Gh3.png");
        f2.mirrorHorizontally();
        setImage(f2);
    }
    
    public void act() 
    {
        x=getX();
        y=getY();
        
        setLocation(x-=3,y);
    }    
}
