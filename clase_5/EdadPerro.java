package clase_5;

import java.util.Scanner;

import static java.lang.System.*;

public class EdadPerro {
    public static void calcularEdadPerro (){
        Scanner entrada = new Scanner(in);
        out.println("ingresa la edad de tu perro");
        int aniosHumanos = entrada.nextInt();
        int aniosPerro = aniosHumanos * 7;
        out.println("la edad de tu perro es: "+ aniosPerro+"\n");
    }

}
