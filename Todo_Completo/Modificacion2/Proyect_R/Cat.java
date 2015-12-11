import greenfoot.*;

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Scrolleable
{
    
    private static GreenfootImage[] gat = new GreenfootImage[7];
    int cmb;
    int ux,uy;
    int mod;
    int cad;
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cat(){
    
        gat[0]=new GreenfootImage("CatFire6.png");  
        gat[1]=new GreenfootImage("CatFire5.png");
        gat[2]=new GreenfootImage("CatFire4.png");
        gat[3]=new GreenfootImage("CatFire3.png");
        gat[4]=new GreenfootImage("CatFire2.png");
        gat[5]=new GreenfootImage("CatFire.png");
        mod=0;
        setImage(gat[cmb]);
        
    }
    
    
    public void act() 
    {
        this.vuela();
    }   
    public void move(int d)
    {
        this.setLocation(this.getX()+10*(d),getY());
    }
    
    public void vuela(){
      //cmb=0;
      ux=getX();
      uy=getY();
      mod++;
      Flemin fl;
      fl= new Flemin();
      moneda mon;
      mon =new moneda();
          if(mod%50==0){
          switch(cmb){
           
              
               case 0:
                    cmb=1;
                    setImage(gat[cmb]);
                    setLocation(ux-=15,getY());
                    if(cad%200==0)
                       getWorld().addObject(fl,ux-=5,uy+=15);
                    break;
                    
               case 1:     
                    cmb=2;
                    setImage(gat[cmb]);
                    setLocation(ux-=15,getY());
                    getWorld().addObject(mon,ux-=5,uy+=15);
                    break;
                    
               case 2:
                    cmb=3;
                    setImage(gat[cmb]);
                    setLocation(ux-=15,getY());
                    
                    break;
                    
               case 3:
                    cmb=4;
                    setImage(gat[cmb]);
                    setLocation(ux-=15,getY());
                   
                    break;
                    
               case 4:
                    cmb=5;
                    setImage(gat[cmb]);
                    setLocation(ux-=15,getY());
                    if(cad%200==0)
                    getWorld().addObject(fl,ux-=5,uy+=15);
                    break;
               case 5:
                    cmb=0;
                    setImage(gat[cmb]);
                    setLocation(ux-=15,getY());
 
                    break;
        }      
      }
    }
}

