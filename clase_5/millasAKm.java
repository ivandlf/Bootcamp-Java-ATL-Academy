package clase_5;

import static clase_5.Main.entrada;

public class millasAKm {
    public static void millasAKm() {
        System.out.println("ingrese las millas que desea convertir a km:");
        double millas = entrada.nextDouble();
        double conversion = millas * 1.60934;
        System.out.println(millas + " millas es quivalente a " + conversion + " kms. \n");
    }
}
