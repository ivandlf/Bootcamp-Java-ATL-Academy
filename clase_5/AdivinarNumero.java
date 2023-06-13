package clase_5;

import static clase_5.Main.entrada;

public class AdivinarNumero {
    public static void adivinarNumero() {
        int numeroAleatorio = (int) ((Math.random()) * 100);
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
