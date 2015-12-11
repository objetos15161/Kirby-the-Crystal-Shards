import greenfoot.*;

/**
 * Write a description of class FireLand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireLand extends World
{
    int cda;
    int vez;
    int alguna,al,d;
    boolean villan;
    public Buho buhoVillano;
    public DreamLand mun;
    Kirby kir;
    public Fantasma mundo3;
     
     
    /**
     * Constructor for objects of class FireLand.
     * 
     */
   
    public FireLand(Kirby k, int puntos, int vidas, int crystales)
    {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(700, 400, 1,false); 
      kir=k;
      addObject(kir, 20,20);
      addObject(new Piso2(),500,400);
      addObject(new Piso2(),1500,400);
      addObject(new Piso2(),2500,400);
      addObject(new Piso2(),3500,400);
      addObject(new Piso2(),4500,400);
      addObject(new Piso2(),5500,400);
      addObject(new Piso2(),6500,400);
      addObject(new Piso2(),7500,400);
      addObject(new Piso2(),8500,400);
      villan =false;
     
    }
    
    public void act()
    {
      this.scrollWorld();
      cda++;
      vez++;
      alguna++;
      al++;
        //addObject(new Piso2(),500,400);
         if(cda%1000==0){
         addObject(new Cat(),900,100);
        }
           
        if(vez%800==0){
          addObject(new Sop(),500,340); 
        }
       
   
       if(al%1000==0){
         addObject(new Crystal(),d*120,300);
         
         d++;;
        }  
        
        
        if(kir.GetPuntos() == 1000 && villan == false)
        {
            buhoVillano = new Buho();
           removeObjects(getObjects(Dee.class));
           removeObjects(getObjects(Rat.class));
           //removeObjects(getObjects(Buho.class));
           addObject(buhoVillano,650,300);
           this.villan= true;
        }
        
       if(buhoVillano != null && buhoVillano.GetPoder() == 0)
        {
            mundo3 = new Fantasma(kir, 10,10,2);
            Greenfoot.setWorld(mundo3);
        } 
      
    
    }
    private void scrollWorld(){
     GreenfootImage bg = new GreenfootImage(getBackground());
     getBackground().drawImage(bg,-1,0);
     getBackground().drawImage(bg,getWidth()-1,0);
    } 
}
