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
   //Métodos necesarios para la ejecución
   public void lanzarDado(){
       this.dado = (int)(Math.random()*(6-1+1)+1);
   }
}