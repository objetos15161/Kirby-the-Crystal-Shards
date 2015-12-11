import greenfoot.*;
import java.util.*;


/**
 * Write a description of class Kirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kirby extends Actor
   {
     private static GreenfootImage[] ima = new GreenfootImage[7];
     public boolean ganaVillano;
     public GreenfootImage bol;
     int cont;
     int im;
     List lista;
     int band;
     int limit;
     int contb;
     int vidas;
     int pasos;
     int X,Y;
     int dir;
     int puntos;
     int crystales;
     Label lVidas;
     Label lPuntos;
     Label lCrystales;
     int direccion;
     Saver mySaver;
     int g;
       
    public Kirby()
    {
        ima[0]=new GreenfootImage("Kir1.png");
        ima[1]=new GreenfootImage("Kir2.png");
        ima[2]=new GreenfootImage("Kir1.png");
        ima[3]=new GreenfootImage("Kir2.png");
        ima[4]=new GreenfootImage("Kir3.png");
        ima[5]=new GreenfootImage("Kir4.png");
        ganaVillano = false;
        ima[2].mirrorHorizontally();
        ima[3].mirrorHorizontally();
        vidas =15;
        mySaver=new Saver();
        setImage(ima[0]);
        lVidas=new Label("Vidas : 3",30);
        lPuntos=new Label("Puntos: 0",30);
        lCrystales=new Label("Crystal: 0",30);
        im=0;
        band=0;
        puntos=0;
    }
    
    /**
     * Act - do whatever the Kirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      lista = getWorld().getObjects(Scrolleable.class);
      
      getWorld().removeObject(lVidas);
      lVidas=new Label("Vidas: " + Integer.toString(vidas),30);
      getWorld().addObject(lVidas, 50, 10);
        
      getWorld().removeObject(lPuntos);
      lPuntos=new Label("Puntos: " + Integer.toString(puntos),30);
      getWorld().addObject(lPuntos, 300, 10);
    
      getWorld().removeObject(lCrystales);
      lCrystales=new Label("crystales: " + Integer.toString(crystales),30);
      getWorld().addObject(lCrystales, 600, 10);
      if(vidas==0)
      {
        Label ya=new Label("Perdiste",50);
        getWorld().addObject(ya, 400, 206);
        mySaver.saveHighscore(puntos);
        Greenfoot.stop();
        }
      this.brinca();
      this.camina();

        Fuego f;
        Nieve n;
      this.tocaBomba();
      this.tocaChang();
      this.tocaExplota();
      this.tocaRata();
      this.tocaGot();
      this.tocaManzano();
      this.tocaSoplo();
      this.tocaFire();
      this.tocaFuego();
      this.tocaFantasma();
      
      if(isTouching(moneda.class))
      {
          removeTouching(moneda.class);
          removeTouching(Crystal.class);
          puntos+=50;
          
         
      }
      
      if(isTouching(Crystal.class)){
          removeTouching(Crystal.class);
          crystales++;
        
        }
     
      if(isTouching(gota.class)||isTouching(Explosion.class)){
        
        
        }
      if(Greenfoot.isKeyDown("p"))
      {
        f=new Fuego(direccion);
        g++;
        if(g%5==0)
        getWorld().addObject(f,(getX())+5,getY());
      }
      
      if(Greenfoot.isKeyDown("m"))
      {
        n=new Nieve(direccion);
        g++;
        if(g%5==0)
        getWorld().addObject(n,(getX())+5,getY());
      }
    }
    
    public int GetPuntos()
    {
        return puntos;
    }
    
    
    public void camina(){
         X=getX();
         Y=getY();
     if(Greenfoot.isKeyDown("right"))
        {  
           direccion=1;
            if(X==590)
            {
            for (int i=0;i<lista.size();i++)
            {
                 Scrolleable a=(Scrolleable)lista.get(i);
                a.move(-1);
            }
        }
        else
        {
            setLocation(X+=2,Y);
        }
           cont++;
          
        if(cont%5==0)
          {
          if(im==0)
              im=1;
          else
           im=0;
           setImage(ima[im]);
          }     
       }
       
         
    if(Greenfoot.isKeyDown("left"))
    {   direccion=2;
        if(X==10)
        {
       for (int i=0;i<lista.size();i++)
        {
            Scrolleable a=(Scrolleable)lista.get(i);
            a.move(1);
       }
    }
    else
    {
        setLocation(X-=2,Y);
    }
       cont++;
    if(cont%5==0)
     {
            if(im==3)
                im=2;
            else
                im=3;
                
            setImage(ima[im]);
     }
  }      
}
   public void brinca(){
    int posY;
    int posX;
    posY=getY();
    posX=getX();
    
     if(Greenfoot.isKeyDown("space")){
        cont=50;
        band=1;
        
        if(cont%5==0 && posY>262){
            im=4;
            setImage(ima[im]); 
            setLocation(posX,posY-=5);
            cont--;
            
         }
       } 
    else
    {
        if( posY<342)
        {   setImage(ima[0]);
             setLocation(posX, posY+=5);
        }
    }
}

public void tocaBomba(){
      if(isTouching(bomb.class)){
      removeTouching(bomb.class);
      vidas--;
    }
}
public void tocaExplota(){
      if(isTouching(Explosion.class)){
      removeTouching(Explosion.class);
      vidas--;
    }
}
public void tocaRata(){
      if(isTouching(Rat.class)){
      removeTouching(Rat.class);
      vidas--;
    }
}
public void tocaChang(){
      if(isTouching(Dee.class)){
      removeTouching(Dee.class);
      vidas--;
    }
  }
public void tocaGot(){
      if(isTouching(gota.class)){
      removeTouching(gota.class);
      if(crystales>0)
      crystales--;
    }
  }
public void tocaManzano(){
      if(isTouching(Manzana.class)){
      removeTouching(Manzana.class);
      vidas--;
    }
  }  
public void tocaSoplo(){
      if(isTouching(Soplo.class)){
      removeTouching(Soplo.class);
      vidas--;
    }
  }
public void tocaFuego(){
      if(isTouching(Flemin.class)){
      removeTouching(Flemin.class);
      vidas--;
    }
  } 
 public void tocaFire(){
      if(isTouching(Flama.class)){
      removeTouching(Flama.class);
      vidas--;
    }
}
public void tocaRoca(){
      if(isTouching(Rock.class)){
      removeTouching(Rock.class);
      vidas--;
    }
  }     
  public void tocaFantasma(){
      if(isTouching(Fantasmin.class)){
      removeTouching(Fantasmin.class);
      vidas--;
    }
  } 
}


