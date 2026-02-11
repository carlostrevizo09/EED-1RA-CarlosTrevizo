/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_arreglo_objetos;

/**
 *
 * @author carlo
 */
public class EVA1_11_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println(arreglo);
        // arreglo.-> nos permite acceder al arreglo
        //creamos cada objeto
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        //arreglo[0].val = 10;
        System.out.println(arreglo[0].val);
        System.out.println(arreglo[1].val);
        
        
    }
    
}
class Ejemplo{
        int val = 5;
    }