import greenfoot.*;

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends Boton
{  
    Info ft;
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        MouseInfo mouse = Greenfoot.getMouseInfo();
        ft= new Info();
        
        
        if(mouse!=null)
        {
           
                
                if(Greenfoot.mouseClicked(this)){
                   getWorld().addObject(ft,300,200);
                  
                   

            }
        }
    }    
}
