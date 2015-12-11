import greenfoot.*;

/**
 * Write a description of class Fuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuego extends Lumbre
{   int vel;
    int direcc;
    /**
     * Act - do whatever the Fuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fuego(int dir){
      direcc=dir;
    }
    
    public void act()
    
    {  vel++;
       
          switch(direcc){
               case 1: 
                 if(vel%5==0)
                    this.setLocation(getX()+10,getY());
                if(this.isTouching(Dee.class)||isTouching(Rat.class)){ 
                 removeTouching(Dee.class);
                 removeTouching(Rat.class);
                }
               break;
               case 2:
                if(vel%5==0)
                    this.setLocation(getX()-10,getY());
                if(this.isTouching(Dee.class)||isTouching(Rat.class)){ 
                 removeTouching(Dee.class);
                 removeTouching(Rat.class);
                }
                 break;
               case 3:
                if(vel%5==0)
                    this.setLocation(getX(),getY()-10);
                if(this.isTouching(Dee.class)||isTouching(Rat.class)){ 
                 removeTouching(Dee.class);
                 removeTouching(Rat.class);
                }
                 break;
            }
    }    
}
