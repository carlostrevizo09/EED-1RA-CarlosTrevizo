
package eva_10_cambiar_tamanio;

public class EVA_10_CAMBIAR_TAMANIO {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos = new int[5];
        
        
         
         for (int i = 0; i< datos.length; i++){
     datos[i]=(int)(Math.random()*100);
     
    }
           for(int i = 0; i<datos.length; i++){
              System.out.print("["+datos[i]+"]"); 
           } 
           System.out.println("");
           System.out.println("cambiar el arreglo");
          
           System.out.println("");
           //RESPALDAR LA INFO EN UN NUEVO ARREGLO
           int[] copia = new int[3];
           for (int i = 0; i <copia.length; i++){
               copia[i] = datos [i];
           }
           datos = copia;
           System.out.println("Nuevos Valores de Datos:");
           for (int i = 0; i < datos.length; i++){
              System.out.print("[" + datos[i]+ "]"); 
           } 
           
           
           
           
           
           
    }
    
}
