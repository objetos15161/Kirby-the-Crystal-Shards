import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Rat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Rat extends Enemigo
{   
    GreenfootImage raty[]=new GreenfootImage[4];
    private int x,y;
    int imt;
    int c, ctg;
    boolean uno = false;
    int band=0;
    int lan;
    /**
     * Act - do whatever the Rat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rat(){
     raty[0]= new GreenfootImage("c1.png");
     raty[1]= new GreenfootImage("c2.png");
     raty[2]= new GreenfootImage("c3.png");
     
     raty[0].mirrorHorizontally();
     raty[1].mirrorHorizontally();
     raty[2].mirrorHorizontally();
     setImage(raty[0]);
     imt=0;
     
    }
    public void act() 
    {  
        //setLocation(x-=2,getY());
        
        this.lanza();   
    }
    
    public void lanza(){
       bomb b;
       x=getX();
       y=getY();
       ctg++;
       if(ctg%15==0){
       switch(imt){
        case 0:
        imt=1;
        setImage(raty[imt]); 
        break;
             
        case 1:
        
        c++;
        if(c%5==0){
            lan++;
            if(lan%6==0){
            b=new bomb();
            getWorld().addObject(b,getX(),335);
            imt=2;
            setImage(raty[imt]);
          }
        }
        break;
             
        case 2:
        imt=0;
        setImage(raty[imt]); 
        break;
       }
    }
   }
      
    public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
    
}
