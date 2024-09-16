import java.util.Random;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        System.out.println(numeroAleatorio);

        Scanner teclado = new Scanner(System.in);

        int intentos = 5;

        while (intentos > 0) {
            System.out.println("Elija un numero entre 0 y 100");
            int user = teclado.nextInt();
            intentos--;

            if (numeroAleatorio > user) {
                System.out.println("El numero secreto es mas grande");
            } else if (numeroAleatorio < user) {
                System.out.println("El numero secreto es mas pequeño");
            } else {
                System.out.println("Acertaste");
            }
        }
        if (intentos == 5) {
            System.out.println("Lo siento, perdiste");
        }
    }
}
