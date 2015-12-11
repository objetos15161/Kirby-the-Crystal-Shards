import greenfoot.*;

/**
 * Write a description of class Reco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reco extends Boton
{   Regresar Reg;
    /**
     * Act - do whatever the Reco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
        ScoreBoard score=new ScoreBoard(400,300);
        Reg =new Regresar();
        getWorld().addObject(score,300,150);
        getWorld().addObject(Reg,300,350);
    }    
}
}