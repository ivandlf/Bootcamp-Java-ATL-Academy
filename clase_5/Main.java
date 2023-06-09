package clase_5;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {


        int opcion;
        do {
            menu.menu();
            opcion = entrada.nextInt();
            if (opcion == 1) {
                edadPerro.calcularEdadPerro();
            } else if (opcion == 2) {
                millasAKm.millasAKm();
            } else if (opcion == 3) {
                calcularDescuento.descuento();
            } else if (opcion == 4) {
                calcularPropina.propina();
            } else if (opcion == 5) {
                adivinarNumero.adivinarNumero();
            } else {
                System.out.println("el programa finalizo con exito");
            }
        } while (opcion > 0 && opcion < 6);

    }



}
