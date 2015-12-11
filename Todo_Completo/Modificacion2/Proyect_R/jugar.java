import greenfoot.*;

/**
 * Write a description of class Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugar extends Boton
{
    /**
     * Act - do whatever the Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         MouseInfo mouse = Greenfoot.getMouseInfo();      
        if(mouse!=null)
        {
            if(Greenfoot.mouseClicked(this)){
                
                Greenfoot.setWorld(new DreamLand());   

            }
        }
    }    
}
