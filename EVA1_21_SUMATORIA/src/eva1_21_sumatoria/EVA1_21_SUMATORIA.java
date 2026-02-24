/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_sumatoria;

/**
 *
 * @author carlo
 */
public class EVA1_21_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //SUMATORIA (5) = 5 + 4 + 3 + 2 + 1 + 0
        System.out.println("Sumatoria  de 5 = "  + Sumatoria(5));
    }
    public static int Sumatoria (int base){
        if (base == 0)
            return 0;
        else {
             return  base + Sumatoria(base - 1);
        }
        }
}
