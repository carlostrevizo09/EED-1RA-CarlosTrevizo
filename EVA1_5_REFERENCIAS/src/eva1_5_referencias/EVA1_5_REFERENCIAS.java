
package eva1_5_referencias;

public class EVA1_5_REFERENCIAS {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        Prueba prueba = new Prueba();
        System.out.println(x);
        System.out.println(prueba);
        //Como DESTRUYo EL OBJETO
        prueba = null; //Esto solo desconecta la variable del objeto
    }
    class prueba{
        int y = 200;
    }
}
