import greenfoot.*;
import java.awt.List;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

/**
 * Write a description of class DreamLand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DreamLand extends World
{
    int ctd, cad,conta, cd;
    Nube nu;
    int dife;
    Kirby kirby;
    public FireLand mundo2;
    public boolean villano;
    public Tree arbolVillano; 
    
    /**
     * Constructor for objects of class DreamLand.
     * 
     */
    public DreamLand()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 400, 1,false);
        kirby = new Kirby();
        villano = false;
        addObject(new Piso(),600,400);
        addObject(new Piso(),1600,400);
        addObject(new Piso(),2600,400);
        addObject(new Piso(),3600,400);
        addObject(new Piso(),4600,400);
        addObject(new Piso(),5600,400);
        addObject(new Piso(),6600,400);
        addObject(new Piso(),7600,400);
        addObject(new Piso(),8600,400);
        addObject(new Piso(),9600,400);
        addObject(new Piso(),10600,400);
        addObject(new Piso(),11600,400);
        
        addObject(new Rat(),300,340);
        addObject(new Rat(),1000,340);
        addObject(new Rat(),1700,340);
        addObject(new Rat(),2400,340);
        addObject(new Rat(),3100,340);
        addObject(new Rat(),3800,340);
        addObject(new Rat(),4400,340);
        addObject(new Rat(),5100,340);
        
        
        addObject(kirby,20,342);
        
        addObject(new Crystal(),120,300);
        addObject(new Crystal(),200,300);
        addObject(new Crystal(),280,300);
        addObject(new Crystal(),360,300);
        addObject(new Crystal(),440,300);
        nu=new Nube();
        addObject(nu,50,100);
        ctd=0;
        
    }
    public void act(){
      scrollWorld();
      ctd++;
      cad++;
      cd++;
      if(ctd%1000==0)
         addObject(new Dee(),700,342);
         
     if(cad%1000==0){
        addObject(new Crystal(),dife*120,300);
        cad++;
        dife++;;
        }   
        
     if(kirby.GetPuntos() == 500 && villano == false)
      {
         arbolVillano = new Tree();
         removeObjects(getObjects(Dee.class));
         removeObjects(getObjects(Rat.class));
         //removeObjects(getObjects(Buho.class));
         addObject(arbolVillano, 650, 240);
           
           this.villano = true;
        }
        
        if(arbolVillano != null && arbolVillano.GetVida() == 0)
        {
            mundo2 = new FireLand(kirby, 10,10,2);
            Greenfoot.setWorld(mundo2);
        }
            
    }
    private void scrollWorld(){
     GreenfootImage bg = new GreenfootImage(getBackground());
     getBackground().drawImage(bg,-1,0);
     getBackground().drawImage(bg,getWidth()-1,0);
    } 
}
