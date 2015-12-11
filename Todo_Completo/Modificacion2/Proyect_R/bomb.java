import greenfoot.*;

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Enemigo
 {   int x,y;
     double cont = -5;
     boolean exploto = false;
     int cg;
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
   
      if(!exploto){
       x=getX();
       y=getY();
       double y1 = y;
       cg++;
       if(cg%20==0){
       y -= (int)(-.09 * (cont * cont)) + 8;
       x-=10;
       cont++;
       this.setLocation(x, y);
    }
    if(isTouching(Piso.class)){
          setImage("d2.png");
          Explosion e;
          e=new Explosion();
          getWorld().addObject(e,getX(),335);
          exploto = true;
      }
    }
  }
  public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
 }