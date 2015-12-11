import greenfoot.*;

/**
 * Write a description of class Nube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nube extends Scrolleable
{   int cx,cy;
    int dy;
    int mode;
/**
     * Act - do whatever the Nube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() 
{
 this.desplazate();
} 
    
public void desplazate(){
     
     cx=getX();
     cy=getY();
     
     this.tiraGota(cx,cy);
     setLocation(cx+=1,cy); 
     if(getX()>=5900)
     {
         setLocation(50,cy);
     }
 }
public void move(int d)
{
 this.setLocation(this.getX()+10*(d),getY());
}
    public void tiraGota(int cx,int cy){
     gota g;
     g=new gota();
     mode++;
     dy=cy+50;
     if(mode%100==0)
        getWorld().addObject(g,cx,dy);
    
    
    else{
        moneda m; 
        m=new moneda();
        if(mode%150==0){
           dy=cy+20;
           getWorld().addObject(m,cx,dy);
        }
    } 
}
}