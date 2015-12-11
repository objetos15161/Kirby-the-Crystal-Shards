import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Ayuda ayu;
    Records reco;
    jugar  jueg;
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        ayu= new Ayuda();
        reco= new Records();
        jueg= new jugar();
        addObject(jueg,300,100);
        addObject(ayu,300,180);
        addObject(reco,300,280);
        prepare();
    }

    public void botonPlay(){

            
               
               
               
               
               
               
    }
    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Reco reco = new Reco();
        addObject(reco, 308, 362);
        reco.setLocation(294, 356);
    }
}

