import greenfoot.*;

/**
 * Write a description of class Regresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regresar extends Boton
{
    /**
     * Act - do whatever the Regresar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
             getWorld().removeObjects(getWorld().getObjects(ScoreBoard.class));
             getWorld().removeObjects(getWorld().getObjects(Regresar.class));
           
        }
    }    
}
