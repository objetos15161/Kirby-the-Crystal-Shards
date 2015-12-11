import greenfoot.*;

/**
 * Write a description of class Nieve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nieve extends Actor
{   int dire;
    int vel;
    public Nieve(int dir){
     dire=dir;
    }
    /**
     * Act - do whatever the Nieve wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        switch(dire){
               case 1: 
                 if(vel%15==0)
                    this.setLocation(getX()+10,getY());
                if(this.isTouching(Dee.class)||isTouching(Rat.class)||isTouching(Sop.class)){ 
                 
                 removeTouching(Dee.class);
                 removeTouching(Rat.class);
                 removeTouching(Sop.class);
                 
                }
               break;
               case 2:
                if(vel%15==0)
                    this.setLocation(getX()-10,getY());
                   if(this.isTouching(Dee.class)||isTouching(Rat.class)||isTouching(Sop.class)){ 
                 
                 removeTouching(Dee.class);
                 removeTouching(Rat.class);
                 removeTouching(Sop.class);
                 
                }
                 break;
               case 3:
                if(vel%15==0)
                    this.setLocation(getX(),getY()-10);
                  if(this.isTouching(Dee.class)||isTouching(Rat.class)||isTouching(Sop.class)){ 
                 
                 removeTouching(Dee.class);
                 removeTouching(Rat.class);
                 removeTouching(Sop.class);
                 
                }
                 break;
            }
    }    
}
