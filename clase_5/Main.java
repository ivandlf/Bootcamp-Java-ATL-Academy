package clase_5;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {


        int opcion;
        do {
            Menu.menu();
            opcion = entrada.nextInt();
            if (opcion == 1) {
                EdadPerro.calcularEdadPerro();
            } else if (opcion == 2) {
                MillasAKm.millasAKm();
            } else if (opcion == 3) {
                CalcularDescuento.descuento();
            } else if (opcion == 4) {
                CalcularPropina.propina();
            } else if (opcion == 5) {
                AdivinarNumero.adivinarNumero();
            } else {
                System.out.println("el programa finalizo con exito");
            }
        } while (opcion > 0 && opcion < 6);

    }



}
