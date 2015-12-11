import greenfoot.*;

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends Boton
{   Porta por;
    /**
     * Act - do whatever the Records wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        por= new Porta();
        
        
        if(mouse!=null)
        {
           
                
                if(Greenfoot.mouseClicked(this)){
                   getWorld().addObject(por,300,200);
                  
                   

            }
    }    
}
}
