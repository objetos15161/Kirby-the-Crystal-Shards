import greenfoot.*;

/**
 * Write a description of class Sop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sop extends Scrolleable
{   GreenfootImage soplaFuego;
    GreenfootImage soplaFuego2;
    int img;
    int x,y;
    int dis;
    int difx,dify;
    int conta;
    
    /**
     * Act - do whatever the Sop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public Sop(){
     
     soplaFuego= new GreenfootImage("bAma.png");
     soplaFuego2= new GreenfootImage("bAma2.png");
     
     soplaFuego.mirrorHorizontally();
     soplaFuego2.mirrorHorizontally();
     
     setImage(soplaFuego2);
     img=0;
    }
    public void act() 
    {
        this.cambios();
    }  
    
    public void cambios(){
          
          x=getX();
          y=getY();
          dis++;
          if(dis%40==0){
          if(img==0){
             img=1;
             setImage(soplaFuego2);
             setLocation(x-=5,y);
             escupeFlama(x,y);
            }
            
          else
             {
              img=0;
              setImage(soplaFuego);
             }
    }
}
public void escupeFlama(int x ,int y){
    Flama f1;
    f1=new Flama();
    conta++;
    difx=x-5;
    dify=y+10;
    if(conta%2==0)
        getWorld().addObject(f1,difx,dify);
    
    
    }

}
