package clase_5;

import static clase_5.Main.entrada;

public class calcularDescuento {
    public static void descuento() {
        System.out.println("ingrese el precio sin descuento");
        double precioOriginal = entrada.nextDouble();
        System.out.println("ingrese el porcentaje del descuento");
        double descuento = entrada.nextDouble();
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("el precio con el descuento es de: " + precioFinal + "\n");
    }
}
