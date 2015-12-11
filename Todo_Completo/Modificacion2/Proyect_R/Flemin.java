import greenfoot.*;

/**
 * Write a description of class Flemin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flemin extends Lumbre
{   int cx,cy,vez;
    /**
     * Act - do whatever the Flemin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      this.caeFlama(); 
    }
    
    public void caeFlama(){
        if(vez%100==0){
        cx=getX();
        cy=getY();
        setLocation(cx,cy+=2);
    }
    }
}
