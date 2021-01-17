package DADOS;

public class MAIN {

	public static void main(String[] args) {
	       Dado d1,d2;
	       d1=new Dado();
	       d2=new Dado();
	       d1.lanzarDado();
	       d2.lanzarDado();
	       System.out.println("El valor del 1r dado es: "+d1.getDado()+"\n" + "El valor del 2do dado es: "+d2.getDado());
	       if(d1.getDado()+d2.getDado() == 7 || d1.getDado()+d2.getDado() ==11 )
	       {
	           System.out.println("Ha Ganado");
	       }
	     
	       if(d1.getDado()+d2.getDado() == 2 || d1.getDado()+d2.getDado() ==3 || d1.getDado()+d2.getDado() ==12 )
	       {
	           System.out.println("CRAP ! Has perdido");
	       }
	       if(d1.getDado()+d2.getDado() == 4 || d1.getDado()+d2.getDado() ==5 || d1.getDado()+d2.getDado() == 6  || d1.getDado()+d2.getDado() == 8 || d1.getDado()+d2.getDado() == 9 || d1.getDado()+d2.getDado() == 10 )
	       {
	    	   int SumaAnterior = d1.getDado()+d2.getDado();
	    	   System.out.println("Has ganado un punto, ahora debes conseguir el mismo numero");
	    	   d1.lanzarDado();
	    	   d2.lanzarDado();
	    	   System.out.println("El nuevo valor del 1r dado es: "+d1.getDado()+"\n" + "El nuevo valor del 2do dado es: "+d2.getDado());
	    	   if (SumaAnterior == (d1.getDado()+d2.getDado())) {
	    	   System.out.println("Has ganado un punto, ahora debes conseguir el mismo numero");
	    	   
	    	   }
	    	   else System.out.println("Has Perdido");
	       }
	   }
}
