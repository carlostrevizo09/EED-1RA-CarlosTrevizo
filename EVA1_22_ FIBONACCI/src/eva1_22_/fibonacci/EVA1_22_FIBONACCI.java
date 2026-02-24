
package eva1_22_.fibonacci;

public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("valor Fibonacci en posicion 5 = " + fibonacci(5));
    }
    
    public static int fibonacci(int posi){
             
        // Casos base
        if(posi == 1){
            return 0;
        }
        if(posi == 0){
            return 1;
        }
        
        // Llamada recursiva
        return fibonacci(posi - 1) + fibonacci(posi - 2);
    }
}
