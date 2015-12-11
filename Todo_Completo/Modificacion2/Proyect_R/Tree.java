import greenfoot.*;

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Scrolleable
{   
    Label lpoder;
    int Power;
    Soplo soplido;
    Manzana apple;
    int mol;
    int cox,coy;
    public Tree(){
     Power=80000;
    }
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().removeObject(lpoder);
        lpoder=new Label("Power: " + Integer.toString(Power),30);
        getWorld().addObject(lpoder, 250, 30);
        
        
        
        if(isTouching(Nieve.class)||isTouching(Fuego.class)){
           Power-=100;
        
        }
        
        this.sopla();
    
    }    
    
    int GetVida(){
        return Power;
    }
    
    public void sopla(){
      cox=getX();
      coy=getY();
      mol++;
      soplido=new Soplo();
      apple=new Manzana();
      if(mol%200==0)
         getWorld().addObject(soplido,cox-=10,coy+=80);
        
         else{
             if(mol%300==0)
                 getWorld().addObject(apple,cox-=10,coy+=80);
            
            }
    
    }
    
}
