import greenfoot.*;
import java.awt.image.*;
/**
 * Write a description of class Piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso extends Scrolleable
{   
    int cont;
    /**
     * Act - do whatever the Piso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
   private int vScroll;
    
    public void act() 
    {
        if(isTouching(Explosion.class)){
           cont++;
            if(cont%30==0){
               removeTouching(Explosion.class);
            }
                   
        }  
        
           if(isTouching(bomb.class)){
           cont++;
            if(cont%30==0){
               removeTouching(bomb.class);
            }
                   
        } 
    }
    public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
    
    
    
}
