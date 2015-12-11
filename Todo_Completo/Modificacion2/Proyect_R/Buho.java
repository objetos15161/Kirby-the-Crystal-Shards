import greenfoot.*;

/**
 * Write a description of class Buho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buho extends Scrolleable
{  GreenfootImage buho1;
   GreenfootImage buho2;
   GreenfootImage buho3;
   GreenfootImage buho4;
   GreenfootImage buho5;
   int moveAle,aleTo;
   int dex,dey;
   int cmb;
   int band;
   int dire;
   int poder;
   int cada;
   Rock roca;
   Label lpoder;
    public Buho(){
      
        buho1=new GreenfootImage("owl.png");
        buho2=new GreenfootImage("owl2.png");
        buho3=new GreenfootImage("owl3.png");
        buho4=new GreenfootImage("owl4.png");
        buho5=new GreenfootImage("owl5.png");
        dire=0;
     
        poder=1000;
        cmb=0;
        buho2.mirrorHorizontally();
        buho3.mirrorHorizontally();
        setImage(buho2);
    }
    
    /**
     * Act - do whatever the Buho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        //this.direccion();
        //this.mueve();
         if(isTouching(Nieve.class)||isTouching(Fuego.class)){
           poder-=100;
        
        }
        
        this.camina();
        //this.mueve();
        getWorld().removeObject(lpoder);
        lpoder=new Label("Power: " + Integer.toString(poder),30);
        getWorld().addObject(lpoder, 250, 30);
        
        
    }
    public void mueve(){
        roca= new Rock(); 
        switch(dire){
              case 0:
              setImage(buho1);
              setLocation(dex++,dey++);
              getWorld().addObject(roca,dex-=10,dey+=15);
              break;
              
              case 1:
              setImage(buho4);
              setLocation(dex--,dey--);
              break;
            
            
         }
    }
    
    public void direccion(){
     switch(dire){
              case 0:
              if(dey>=getWorld().getHeight()-50){
                  dire=1;  
              }
              break;
              
              case 1:
               if(dey<=50){
                  dire=0;  
              }
              break;
            
            
         }
        
        
    }
     public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
      int GetPoder(){
        return poder;
    }
    public void camina(){
         cada++;
         dex=getX();
         dey=getY();
         roca= new Rock(); 
         if(cada%100==0)
        if(cmb==0){
            setImage(buho2);
            getWorld().addObject(roca,dex-=10,dey+=15);
            cmb=1;
        }
        
        else
           
          {
       
           setImage(buho3);
           cmb=0;
        }
    
   }
    }
    
  


