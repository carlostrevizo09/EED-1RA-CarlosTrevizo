/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_copia_arreglos;

/**
 *
 * @author carlo
 */
public class EVA1_12_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println("arreglo=" + arreglo);
        // arreglo.-> nos permite acceder al arreglo
        //creamos cada objeto
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        //imprimimos
        System.out.println("arreglo[0]" + arreglo[0]);
        System.out.println("arreglo[0]" + arreglo[1]);
        //arreglo[0].val = 10;
        
        System.out.println(arreglo[0].val);
        System.out.println(arreglo[1].val);
        
        ///Ejemplo[] copia = arreglo; no funciona , Creo un duplicado de la direccion
        Ejemplo[] copia = new Ejemplo[2]; // edebo Crear un nuevo arreglo 
        System.out.println("copia=" + copia);
// posicion por posicion copiar de un arreglo a otro
        System.out.println("copia=" + copia);
        //ESTO NO SIRVE TAMPOCO
        //copia[0] = arreglo[0]; //no duplico el objeto, se Duplica la direccion
        //copia[1] = arreglo[1];
        //crear un BACKUP DE UN OBJETO IMPLICA CREAR O INSTANCIAR OTRO ONJETO QUE SERVIRA DE REPSALODO
        copia[0] = new Ejemplo();
        copia[1] = new Ejemplo();
        System.out.println("copia[0] = " + copia[0]);
        System.out.println("copia[1] = " + copia[1]);
        //ahora si hay que transferir la info de un objeto a otro (siempre y cuand
        //esa info no sean objetos tambien
        copia[0].val = arreglo[0].val;
        copia[1].val = arreglo[1].val;
        
    }
    
}
class Ejemplo{
        int val = 5;
    }