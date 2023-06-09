package clase_5;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {


        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            if (opcion == 1) {
                edadPerro();
            } else if (opcion == 2) {
                millasAKm();
            } else if (opcion == 3) {
                descuento();
            } else if (opcion == 4) {
                propina();
            } else if (opcion == 5) {
                adivinarNumero();
            } else {
                System.out.println("el programa finalizo con exito");
            }
        } while (opcion > 0 && opcion < 6);

    }

    public static void menu() {
        System.out.print("""
                Hola! Bienvenido a la calculadora de conversiones
                Digite la opcion que desee utilizar:
                1- Calculadora de edad de Perros
                2- Conversor de millas a kilómetros
                3- Calculadora de descuento
                4- Calculadora de propinas
                5- Juego de adivinar el número
                Presiona 0 para finalizar la ejecucion
                """);
    }

    public static void edadPerro() {
        System.out.println("ingresa la edad de tu perro");
        int aniosHumanos = entrada.nextInt();
        int aniosPerro = aniosHumanos * 7;
        System.out.println("La edad de tu perro en años humanos es: " + aniosPerro + "\n");
    }

    public static void millasAKm() {
        System.out.println("ingrese las millas que desea convertir a km:");
        double millas = entrada.nextDouble();
        double conversion = millas * 1.60934;
        System.out.println(millas + " millas es quivalente a " + conversion + " kms. \n");
    }

    public static void descuento() {
        System.out.println("ingrese el precio sin descuento");
        double precioOriginal = entrada.nextDouble();
        System.out.println("ingrese el porcentaje del descuento");
        double descuento = entrada.nextDouble();
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("el precio con el descuento es de: " + precioFinal + "\n");
    }

    public static void propina() {
        System.out.println("ingrese el total de la cuenta en un restorante: ");
        double totalCuenta = entrada.nextDouble();
        System.out.println("que porcentaje de propina desea dejar?: ");
        double porcPropina = entrada.nextDouble();
        double montoPropina = totalCuenta * (porcPropina / 100);
        System.out.println("el monto de propina que debe dejar es: " + montoPropina);
    }

    public static void adivinarNumero() {
        int numeroAleatorio = (int) ((Math.random()) * 100);
        System.out.println(numeroAleatorio);
        System.out.println("Adivine el numero secreto(entre 0 y 100): ");

        int numeroElegido = entrada.nextInt();

        while (numeroElegido != numeroAleatorio) {
            if (numeroElegido > 0 && numeroElegido < 100) {
                if (numeroElegido < numeroAleatorio) {
                    System.out.println("el numero que eligio es menor al numero secreto, escoja otro:");
                    numeroElegido = entrada.nextInt();
                } else if (numeroElegido > numeroAleatorio) {
                    System.out.println("el numero que eligio es mayor al numero secreto, escoja otro: ");
                    numeroElegido = entrada.nextInt();
                }
            } else {
                System.out.println("respuesta incorrecta, vuelva a intertarlo");
                numeroElegido = entrada.nextInt();
            }
        }

        System.out.println("felicitaciones! Adivinaste! el numero secreto es: " + numeroAleatorio+"\n");
    }
}
