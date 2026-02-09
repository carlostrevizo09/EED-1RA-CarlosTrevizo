
package eva1_7_arreglos;
public class EVA1_7_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        //String[] cade1,cade2,cade3; -- Todos Son arreglos
        //String cade1,cade2[],cade3; -- Solo cade2 es Objeto 
        int[] datos = new int [10];
        //Manejos de Bytes 
        System.out.println(datos);
        datos[0] = 100;
        datos[1] = 200;
        datos[2] = 300;
        datos[9] = 1000;
        //datos[10] = 1100; // posicion 10 no exitente
        System.out.println("Valor en posicion 0 = " + datos[0]);
        
        
    }
    
}
