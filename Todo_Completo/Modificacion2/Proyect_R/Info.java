import greenfoot.*;

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Boton
{

    /**
     * Constructor for objects of class Info.
     * 
     */
    public Info()
    {
    }
    
    public void act(){
    
    if(Greenfoot.mouseClicked(this)){
           
             getWorld().removeObjects(getWorld().getObjects(Info.class));
        }
    
    
    
    }
}
