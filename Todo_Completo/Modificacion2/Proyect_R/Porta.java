import greenfoot.*;

/**
 * Write a description of class Porta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Porta extends Boton
{
    /**
     * Act - do whatever the Porta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(Greenfoot.mouseClicked(this)){
           
             getWorld().removeObjects(getWorld().getObjects(Porta.class));
        }
    }    
}
