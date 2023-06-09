package clase_5;

import static clase_5.Main.entrada;

public class calcularPropina {
    public static void propina() {
        System.out.println("ingrese el total de la cuenta en un restorante: ");
        double totalCuenta = entrada.nextDouble();
        System.out.println("que porcentaje de propina desea dejar?: ");
        double porcPropina = entrada.nextDouble();
        double montoPropina = totalCuenta * (porcPropina / 100);
        System.out.println("el monto de propina que debe dejar es: " + montoPropina);
    }
}
