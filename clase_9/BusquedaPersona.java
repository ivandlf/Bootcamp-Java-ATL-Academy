package clase_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusquedaPersona {
    public static void main(String[] args) {
        List<String> personas = new ArrayList<String>();
        personas.add("Raul Gimenez");
        personas.add("Obispo Bustos");
        personas.add( "Grandote Tomillo");
        personas.add( "Jacinto Piedra");
        personas.add("Armando Barreda");
        System.out.println("Ingrese su búsqueda: ");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        for (String persona: personas) {
            if (persona.toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println("La persona es: "+persona);
            }
        }
    }
}
