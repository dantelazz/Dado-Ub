package DADOS;
public class Dado {
   //Atributos
   private int dado;
   //Constructor
   public Dado(){
       
   }
   //sets y gets
   public int getDado(){
       return dado;
   }
   public void setDado(int dado){
       this.dado=dado;
   }
   //M�todos necesarios para la ejecuci�n
   public void lanzarDado(){
       this.dado = (int)(Math.random()*(6-1+1)+1);
   }
}