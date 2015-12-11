import greenfoot.*;

/**
 * Write a description of class Fantasma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fantasma extends World
{
    Kirby kir;
    public boolean villania;
    public Ghost fantasmaVillano; 
    int ctd,cad,cd;
    int dife;
    Nube nu;
    public Fantasma(Kirby k, int puntos, int vidas, int crystales)
    {    
        
      super(700, 400, 1,false);
      kir=k;
      villania=false;
      addObject(kir, 20,20);
      addObject(new Piso3(),500,400);
      addObject(new Piso3(),1000,400);
      addObject(new Piso3(),1500,400);
      addObject(new Piso3(),2000,400);
      addObject(new Piso3(),2500,400);
      addObject(new Piso3(),3000,400);
      addObject(new Piso3(),3500,400);
      addObject(new Piso3(),4000,400);
      addObject(new Piso3(),4500,400);
         
      addObject(new Rat(),300,340);
      addObject(new Rat(),1000,340);
      addObject(new Rat(),1700,340);
      addObject(new Rat(),2400,340);
      addObject(new Rat(),3100,340);
      addObject(new Rat(),3800,340);
      addObject(new Rat(),4400,340);
      addObject(new Rat(),5100,340);
      
      addObject(new Crystal(),120,300);
      addObject(new Crystal(),200,300);
      addObject(new Crystal(),280,300);
      addObject(new Crystal(),360,300);
      addObject(new Crystal(),440,300);
      
        nu=new Nube();
        addObject(nu,50,100);
    }
    
    public void act(){
    
     
      scrollWorld();
      ctd++;
      cad++;
      cd++;
      dife++;
      if(ctd%1000==0)
         addObject(new Dee(),700,342);
         
     if(cad%1000==0){
        addObject(new Crystal(),dife*120,300);
        cad++;
        dife++;;
        }   
        
     if(kir.GetPuntos() == 1500 && villania== false)
      {
         fantasmaVillano = new Ghost();
         removeObjects(getObjects(Dee.class));
         removeObjects(getObjects(Rat.class));
         addObject(fantasmaVillano, 650, 240);
           
           this.villania = true;
      }
      
      if(fantasmaVillano != null && fantasmaVillano.GetPower()== 0)
        {
          Greenfoot.stop();
          Label ya=new Label("Ganaste",50);
        }
    }
    
    private void scrollWorld(){
     GreenfootImage bg = new GreenfootImage(getBackground());
     getBackground().drawImage(bg,-1,0);
     getBackground().drawImage(bg,getWidth()-1,0);
    } 
 }

