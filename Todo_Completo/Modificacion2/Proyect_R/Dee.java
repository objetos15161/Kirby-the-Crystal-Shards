import greenfoot.*;
import java.util.*;

/**
 * Write a description of class dee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dee extends Scrolleable
{
 private GreenfootImage[] im= new GreenfootImage[4];
    int cont;
    int img;
    int x,y;

/**
     * Act - do whatever the dee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
 public Dee()
{
  im[0]=new GreenfootImage("w1.png");
  im[1]=new GreenfootImage("w2.png");
  im[2]=new GreenfootImage("w3.png");
            
  im[0].mirrorHorizontally();
  im[1].mirrorHorizontally();
  im[2].mirrorHorizontally();
  setImage(im[0]);
  int img=0;
}
    public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
public void act() 
{
   this.move();
} 
    
    public void move()
    {
       cont++;
       x=getX();
       y=getY();
       if(cont%20==0){ 
        if(img==0){
           img=1;
           setImage(im[img]);
           
        }
        
        else
        {
         img=0;
         setImage(im[img]);
       }
       setLocation(x-=5,y);   
    }
}
}
