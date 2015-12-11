import greenfoot.*;

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Scrolleable
{   Label Power;
    int poder;
    GreenfootImage f;
    Fantasmin fanta;
    int dx,dy,cmb;
    int inter;
    public Ghost(){
      cmb=0;
      poder=20000;
      f= new GreenfootImage("Gh1.png");
      f.mirrorHorizontally();
      setImage(f);
    }
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().removeObject(Power);
        Power=new Label("Power: " + Integer.toString(poder),30);
        getWorld().addObject(Power, 250, 30);
        
        
        this.lanzaFantasmin();
        if(isTouching(Nieve.class)||isTouching(Fuego.class)){
           poder-=100;
        
        }
    } 
    
     int GetPower(){
        return poder;
    }
    
      public void lanzaFantasmin(){
      inter++;
      dx=getX();
      dy=getY();
      fanta= new Fantasmin(); 
        if(inter%30==0){
        if(cmb==0){
            
            getWorld().addObject(fanta,dx-=10,dy+=15);
            cmb=1;
        }
        
        else
           cmb=0;
      }
    }
 }

